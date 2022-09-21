package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "Emitter")
@js.native
open class Emitter[T] () extends StObject {
  
  def dispose(): Unit = js.native
  
  def event(listener: js.Function1[/* e */ T, Any]): IDisposable = js.native
  def event(listener: js.Function1[/* e */ T, Any], thisArg: Any): IDisposable = js.native
  
  def fire(event: T): Unit = js.native
}
