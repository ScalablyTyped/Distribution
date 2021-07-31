package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.File
import typings.nodeRedEditorClient.anon.Key
import typings.nodeRedEditorClient.anon.NodeInstanceNodePropertie
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends StObject {
  
  def addSpinnerOverlay(container: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  def addSpinnerOverlay(container: JQuery[HTMLElement], contain: Boolean): JQuery[HTMLElement] = js.native
  
  def clearNodeColorCache(): Unit = js.native
  
  /**
    * Create or update an icon element and append it to iconContainer.
    * @param iconUrl - Url of icon.
    * @param iconContainer - Icon container element with red-ui-palette-icon-container class.
    * @param isLarge - Whether the icon size is large.
    */
  def createIconElement(iconUrl: String, iconContainer: JQuery[HTMLElement]): Unit = js.native
  def createIconElement(iconUrl: String, iconContainer: JQuery[HTMLElement], isLarge: Boolean): Unit = js.native
  
  def createNodeIcon(node: NodeInstanceNodePropertie): JQuery[HTMLElement] = js.native
  
  def createObjectElement(obj: js.Any): JQuery[HTMLElement] = js.native
  def createObjectElement(obj: js.Any, options: js.Object): JQuery[HTMLElement] = js.native
  
  def decodeObject(payload: String, format: String): js.Any = js.native
  
  def getDarkerColor(c: String): String = js.native
  
  def getDefaultNodeIcon[TProps /* <: NodeProperties */](`def`: NodeDef[TProps, Unit, TProps]): File = js.native
  def getDefaultNodeIcon[TProps /* <: NodeProperties */](`def`: NodeDef[TProps, Unit, TProps], node: NodeInstance[TProps]): File = js.native
  
  def getMessageProperty(msg: js.Object, expr: String): js.Any = js.native
  def getMessageProperty(msg: js.Object, expr: js.Array[String]): js.Any = js.native
  
  def getNodeColor(`type`: String, `def`: NodeDef[NodeProperties, Unit, NodeProperties]): String = js.native
  
  def getNodeIcon[TProps /* <: NodeProperties */](`def`: NodeDef[TProps, Unit, TProps]): String = js.native
  def getNodeIcon[TProps /* <: NodeProperties */](`def`: NodeDef[TProps, Unit, TProps], node: NodeInstance[TProps]): String = js.native
  
  def getNodeLabel(node: NodeInstanceNodePropertie): String = js.native
  def getNodeLabel(node: NodeInstanceNodePropertie, defaultLabel: String): String = js.native
  
  def normalisePropertyExpression(str: String): js.Array[String | Double] = js.native
  
  def parseContextKey(key: String): Key = js.native
  
  def renderMarkdown(txt: String): String = js.native
  
  def sanitize(m: String): String = js.native
  
  def separateIconPath(): File = js.native
  def separateIconPath(icon: String): File = js.native
  
  def setMessageProperty(msg: js.Object, prop: String, value: js.Any): js.UndefOr[Null] = js.native
  def setMessageProperty(msg: js.Object, prop: String, value: js.Any, createMissing: Boolean): js.UndefOr[Null] = js.native
  
  def validatePropertyExpression(str: String): Boolean = js.native
}
