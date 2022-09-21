package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/emitter/
@js.native
trait Emitter
  extends StObject
     with Disposable {
  
  def clear(): Unit = js.native
  def clear(eventName: String): Unit = js.native
  
  def emit(eventName: String, args: Any*): Unit = js.native
  
  def on(eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  
  def once(eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  
  def preempt(eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
}
