package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    /* inverseEditOperations */ js.Array[typings.monacoEditor.mod.editor.IValidEditOperation], 
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
  
  type ValidQuickSuggestionsOptions = scala.Boolean | typings.monacoEditor.anon.ReadonlyRequiredIQuickSug
  
  @scala.inline
  def colorize(
    text: java.lang.String,
    languageId: java.lang.String,
    options: typings.monacoEditor.mod.editor.IColorizerOptions
  ): js.Promise[java.lang.String] = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorize")(text.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def colorizeElement(
    domNode: typings.std.HTMLElement,
    options: typings.monacoEditor.mod.editor.IColorizerElementOptions
  ): js.Promise[scala.Unit] = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorizeElement")(domNode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def colorizeModelLine(model: typings.monacoEditor.mod.editor.ITextModel, lineNumber: scala.Double): java.lang.String = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorizeModelLine")(model.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def colorizeModelLine(model: typings.monacoEditor.mod.editor.ITextModel, lineNumber: scala.Double, tabSize: scala.Double): java.lang.String = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorizeModelLine")(model.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def create(domElement: typings.std.HTMLElement): typings.monacoEditor.mod.editor.IStandaloneCodeEditor = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.editor.IStandaloneCodeEditor]
  @scala.inline
  def create(
    domElement: typings.std.HTMLElement,
    options: js.UndefOr[scala.Nothing],
    `override`: typings.monacoEditor.mod.editor.IEditorOverrideServices
  ): typings.monacoEditor.mod.editor.IStandaloneCodeEditor = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.editor.IStandaloneCodeEditor]
  @scala.inline
  def create(
    domElement: typings.std.HTMLElement,
    options: typings.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
  ): typings.monacoEditor.mod.editor.IStandaloneCodeEditor = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.editor.IStandaloneCodeEditor]
  @scala.inline
  def create(
    domElement: typings.std.HTMLElement,
    options: typings.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions,
    `override`: typings.monacoEditor.mod.editor.IEditorOverrideServices
  ): typings.monacoEditor.mod.editor.IStandaloneCodeEditor = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.editor.IStandaloneCodeEditor]
  
  @scala.inline
  def createDiffEditor(domElement: typings.std.HTMLElement): typings.monacoEditor.mod.editor.IStandaloneDiffEditor = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.editor.IStandaloneDiffEditor]
  @scala.inline
  def createDiffEditor(
    domElement: typings.std.HTMLElement,
    options: js.UndefOr[scala.Nothing],
    `override`: typings.monacoEditor.mod.editor.IEditorOverrideServices
  ): typings.monacoEditor.mod.editor.IStandaloneDiffEditor = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.editor.IStandaloneDiffEditor]
  @scala.inline
  def createDiffEditor(
    domElement: typings.std.HTMLElement,
    options: typings.monacoEditor.mod.editor.IDiffEditorConstructionOptions
  ): typings.monacoEditor.mod.editor.IStandaloneDiffEditor = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.editor.IStandaloneDiffEditor]
  @scala.inline
  def createDiffEditor(
    domElement: typings.std.HTMLElement,
    options: typings.monacoEditor.mod.editor.IDiffEditorConstructionOptions,
    `override`: typings.monacoEditor.mod.editor.IEditorOverrideServices
  ): typings.monacoEditor.mod.editor.IStandaloneDiffEditor = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.editor.IStandaloneDiffEditor]
  
  @scala.inline
  def createDiffNavigator(diffEditor: typings.monacoEditor.mod.editor.IStandaloneDiffEditor): typings.monacoEditor.mod.editor.IDiffNavigator = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffNavigator")(diffEditor.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.editor.IDiffNavigator]
  @scala.inline
  def createDiffNavigator(
    diffEditor: typings.monacoEditor.mod.editor.IStandaloneDiffEditor,
    opts: typings.monacoEditor.mod.editor.IDiffNavigatorOptions
  ): typings.monacoEditor.mod.editor.IDiffNavigator = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffNavigator")(diffEditor.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.editor.IDiffNavigator]
  
  @scala.inline
  def createModel(value: java.lang.String): typings.monacoEditor.mod.editor.ITextModel = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.editor.ITextModel]
  @scala.inline
  def createModel(value: java.lang.String, language: js.UndefOr[scala.Nothing], uri: typings.monacoEditor.mod.Uri): typings.monacoEditor.mod.editor.ITextModel = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.editor.ITextModel]
  @scala.inline
  def createModel(value: java.lang.String, language: java.lang.String): typings.monacoEditor.mod.editor.ITextModel = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.editor.ITextModel]
  @scala.inline
  def createModel(value: java.lang.String, language: java.lang.String, uri: typings.monacoEditor.mod.Uri): typings.monacoEditor.mod.editor.ITextModel = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.editor.ITextModel]
  
  @scala.inline
  def createWebWorker[T](opts: typings.monacoEditor.mod.editor.IWebWorkerOptions): typings.monacoEditor.mod.editor.MonacoWebWorker[T] = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createWebWorker")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.editor.MonacoWebWorker[T]]
  
  @scala.inline
  def defineTheme(themeName: java.lang.String, themeData: typings.monacoEditor.mod.editor.IStandaloneThemeData): scala.Unit = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("defineTheme")(themeName.asInstanceOf[js.Any], themeData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getModel(uri: typings.monacoEditor.mod.Uri): typings.monacoEditor.mod.editor.ITextModel | scala.Null = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("getModel")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.editor.ITextModel | scala.Null]
  
  @scala.inline
  def getModelMarkers(filter: typings.monacoEditor.anon.Owner): js.Array[typings.monacoEditor.mod.editor.IMarker] = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("getModelMarkers")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.monacoEditor.mod.editor.IMarker]]
  
  @scala.inline
  def getModels(): js.Array[typings.monacoEditor.mod.editor.ITextModel] = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("getModels")().asInstanceOf[js.Array[typings.monacoEditor.mod.editor.ITextModel]]
  
  @scala.inline
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ typings.monacoEditor.anon.Model, scala.Unit]): typings.monacoEditor.mod.IDisposable = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onDidChangeModelLanguage")(listener.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def onDidCreateEditor(listener: js.Function1[/* codeEditor */ typings.monacoEditor.mod.editor.ICodeEditor, scala.Unit]): typings.monacoEditor.mod.IDisposable = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateEditor")(listener.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def onDidCreateModel(listener: js.Function1[/* model */ typings.monacoEditor.mod.editor.ITextModel, scala.Unit]): typings.monacoEditor.mod.IDisposable = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateModel")(listener.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def onWillDisposeModel(listener: js.Function1[/* model */ typings.monacoEditor.mod.editor.ITextModel, scala.Unit]): typings.monacoEditor.mod.IDisposable = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onWillDisposeModel")(listener.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def remeasureFonts(): scala.Unit = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("remeasureFonts")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def setModelLanguage(model: typings.monacoEditor.mod.editor.ITextModel, languageId: java.lang.String): scala.Unit = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("setModelLanguage")(model.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setModelMarkers(
    model: typings.monacoEditor.mod.editor.ITextModel,
    owner: java.lang.String,
    markers: js.Array[typings.monacoEditor.mod.editor.IMarkerData]
  ): scala.Unit = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("setModelMarkers")(model.asInstanceOf[js.Any], owner.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setTheme(themeName: java.lang.String): scala.Unit = typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("setTheme")(themeName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def tokenize(text: java.lang.String, languageId: java.lang.String): js.Array[js.Array[typings.monacoEditor.mod.Token]] = (typings.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[typings.monacoEditor.mod.Token]]]
}
