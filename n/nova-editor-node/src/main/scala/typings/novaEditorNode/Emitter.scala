package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/emitter/
@js.native
trait Emitter extends Disposable {
  
  def clear(): Unit = js.native
  def clear(eventName: String): Unit = js.native
  
  def emit(eventName: String, args: js.Any*): Unit = js.native
  
  def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  def once(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  def preempt(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}
