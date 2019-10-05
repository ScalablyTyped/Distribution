package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.onWillDisposeModel")
@js.native
object onWillDisposeModel extends js.Object {
  def apply(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
}

