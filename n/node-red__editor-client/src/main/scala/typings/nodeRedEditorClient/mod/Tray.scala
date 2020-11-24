package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tray extends js.Object {
  
  def close(): Unit = js.native
  def close(done: js.Function0[Unit]): Unit = js.native
  
  def hide(): Unit = js.native
  
  def init(): Unit = js.native
  
  def resize(): Unit = js.native
  
  def show(): Unit = js.native
  def show(options: js.Object): Unit = js.native
}
