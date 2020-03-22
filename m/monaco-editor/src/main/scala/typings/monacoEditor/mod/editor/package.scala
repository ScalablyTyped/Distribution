package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object editor {
  type ComputedEditorOptionValue[T /* <: typings.monacoEditor.mod.editor.IEditorOption[_, _] */] = js.Any
  type FindComputedEditorOptionValueById[T /* <: typings.monacoEditor.mod.editor.EditorOption */] = typings.std.NonNullable[
    typings.monacoEditor.mod.editor.ComputedEditorOptionValue[
      /* import warning: importer.ImportType#apply Failed type conversion: monaco-editor.monaco-editor.editor.EditorOptionsType[monaco-editor.monaco-editor.editor.FindEditorOptionsKeyById<T>] */ js.Any
    ]
  ]
  type FindEditorOptionsKeyById[T /* <: typings.monacoEditor.mod.editor.EditorOption */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof monaco-editor.monaco-editor.editor.EditorOptionsType ]: monaco-editor.monaco-editor.editor.EditorOptionsType[K]['id'] extends T? K : never}[keyof monaco-editor.monaco-editor.editor.EditorOptionsType] */ js.Any
  type IColors = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ICommandHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  type ICursorStateComputer = js.Function1[
    /* inverseEditOperations */ js.Array[typings.monacoEditor.mod.editor.IIdentifiedSingleEditOperation], 
    js.Array[typings.monacoEditor.mod.Selection] | scala.Null
  ]
  type IEditorOverrideServices = org.scalablytyped.runtime.StringDictionary[js.Any]
  type IModel = typings.monacoEditor.mod.editor.ITextModel
  type IReadOnlyModel = typings.monacoEditor.mod.editor.ITextModel
  /* Rewritten from type alias, can be one of: 
    - typings.monacoEditor.monacoEditorStrings.on
    - typings.monacoEditor.monacoEditorStrings.off
    - typings.monacoEditor.monacoEditorStrings.relative
    - typings.monacoEditor.monacoEditorStrings.interval
    - js.Function1[/ * lineNumber * / scala.Double, java.lang.String]
  */
  type LineNumbersType = typings.monacoEditor.mod.editor._LineNumbersType | (js.Function1[/* lineNumber */ scala.Double, java.lang.String])
  type ValidQuickSuggestionsOptions = scala.Boolean | typings.monacoEditor.ReadonlyRequiredIQuickSug
}
