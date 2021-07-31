package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarConfig extends StObject {
  
  def init(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def show(param: String): Unit = js.native
  /**
    * @param param - filterUnused or id
    */
  def show(param: Boolean): Unit = js.native
}
