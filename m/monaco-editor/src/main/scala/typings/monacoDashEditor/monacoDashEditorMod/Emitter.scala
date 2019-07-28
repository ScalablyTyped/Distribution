package typings.monacoDashEditor.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "Emitter")
@js.native
class Emitter[T] () extends js.Object {
  def dispose(): Unit = js.native
  def event(listener: js.Function1[/* e */ T, _]): IDisposable = js.native
  def event(listener: js.Function1[/* e */ T, _], thisArg: js.Any): IDisposable = js.native
  def fire(event: T): Unit = js.native
}

