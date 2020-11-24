package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarConfig extends js.Object {
  
  def init(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def show(param: String): Unit = js.native
  /**
    * @param param - filterUnused or id
    */
  def show(param: Boolean): Unit = js.native
}
