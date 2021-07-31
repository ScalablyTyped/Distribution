package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
  def hasPermission(permission: String): Boolean = js.native
  def hasPermission(permission: js.Object): Boolean = js.native
  
  def init(): Unit = js.native
  
  def login(done: js.Function0[Unit]): Unit = js.native
  def login(opts: Cancelable, done: js.Function0[Unit]): Unit = js.native
  
  def logout(): Unit = js.native
}
