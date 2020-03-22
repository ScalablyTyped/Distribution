package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.create")
@js.native
object create extends js.Object {
  def apply(domElement: HTMLElement): IStandaloneCodeEditor = js.native
  def apply(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def apply(
    domElement: HTMLElement,
    options: IStandaloneEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneCodeEditor = js.native
}

