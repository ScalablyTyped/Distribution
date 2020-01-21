package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object editor {
  type ICodeActionsOnSaveOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type IColors = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ICommandHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  type ICursorStateComputer = js.Function1[
    /* inverseEditOperations */ js.Array[typings.monacoEditor.mod.editor.IIdentifiedSingleEditOperation], 
    js.Array[typings.monacoEditor.mod.Selection] | scala.Null
  ]
  type IEditorOverrideServices = org.scalablytyped.runtime.StringDictionary[js.Any]
  type IModel = typings.monacoEditor.mod.editor.ITextModel
  type IReadOnlyModel = typings.monacoEditor.mod.editor.ITextModel
}
