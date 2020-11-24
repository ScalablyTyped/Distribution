package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarHelp extends js.Object {
  
  def init(): Unit = js.native
  
  def set(html: String): Unit = js.native
  def set(html: String, title: String): Unit = js.native
  
  def show(): Unit = js.native
  def show(`type`: String): Unit = js.native
}
