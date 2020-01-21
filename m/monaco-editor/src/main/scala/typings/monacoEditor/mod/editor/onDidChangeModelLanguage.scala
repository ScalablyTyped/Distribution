package typings.monacoEditor.mod.editor

import typings.monacoEditor.AnonModel
import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.onDidChangeModelLanguage")
@js.native
object onDidChangeModelLanguage extends js.Object {
  def apply(listener: js.Function1[/* e */ AnonModel, Unit]): IDisposable = js.native
}

