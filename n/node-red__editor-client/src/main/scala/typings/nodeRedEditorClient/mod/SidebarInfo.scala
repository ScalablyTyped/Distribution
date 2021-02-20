package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarInfo extends StObject {
  
  def clear(): Unit = js.native
  
  def init(): Unit = js.native
  
  var outliner: SidebarInfoOutliner = js.native
  
  def refresh(): Unit = js.native
  def refresh(node: js.Array[js.Object]): Unit = js.native
  def refresh(node: js.Object): Unit = js.native
  
  def set(html: String): Unit = js.native
  def set(html: String, title: String): Unit = js.native
  
  def show(): Unit = js.native
}
