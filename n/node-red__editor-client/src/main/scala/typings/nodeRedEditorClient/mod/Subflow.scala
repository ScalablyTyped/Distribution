package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Instances
import typings.nodeRedEditorClient.anon.LinksArray
import typings.nodeRedEditorClient.anon.SubflowInputs
import typings.nodeRedEditorClient.anon.SubflowOutputs
import typings.nodeRedEditorClient.anon.Subflows
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subflow extends StObject {
  
  def buildEditForm(`type`: String, node: js.Object): Unit = js.native
  
  def buildPropertiesForm(node: js.Object): Unit = js.native
  
  def convertToSubflow(): Unit = js.native
  
  def createSubflow(): Unit = js.native
  
  def exportSubflowInstanceEnv(node: js.Object): js.Array[js.Object] = js.native
  
  def exportSubflowTemplateEnv(list: JQuery[HTMLElement]): js.Array[js.Object] | Null = js.native
  def exportSubflowTemplateEnv(list: JQuery[HTMLElement], all: Boolean): js.Array[js.Object] | Null = js.native
  
  def init(): Unit = js.native
  
  def refresh(): js.UndefOr[Instances] = js.native
  def refresh(markChange: Boolean): js.UndefOr[Instances] = js.native
  
  def removeInput(): SubflowInputs = js.native
  
  def removeOutput(): SubflowOutputs = js.native
  def removeOutput(removeSubflowOutputs: js.Array[js.Object]): SubflowOutputs = js.native
  
  def removeStatus(): LinksArray = js.native
  
  def removeSubflow(id: String): Subflows = js.native
}
