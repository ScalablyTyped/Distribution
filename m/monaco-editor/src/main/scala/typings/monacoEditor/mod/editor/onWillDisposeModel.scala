package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.onWillDisposeModel")
@js.native
object onWillDisposeModel extends js.Object {
  
  def apply(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
}
