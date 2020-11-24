package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarVersionControl extends js.Object {
  
  def init(utils: js.Object): Unit = js.native
  
  def refresh(): Unit = js.native
  def refresh(full: js.UndefOr[scala.Nothing], includeRemote: Boolean): Unit = js.native
  def refresh(full: Boolean): Unit = js.native
  def refresh(full: Boolean, includeRemote: Boolean): Unit = js.native
  
  def show(): Unit = js.native
  
  def showLocalChanges(): Unit = js.native
}
