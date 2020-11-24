package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.createDiffNavigator")
@js.native
object createDiffNavigator extends js.Object {
  
  def apply(diffEditor: IStandaloneDiffEditor): IDiffNavigator = js.native
  def apply(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = js.native
}
