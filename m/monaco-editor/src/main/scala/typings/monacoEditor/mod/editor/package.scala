package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StringDictionary
import typings.monacoEditor.anon.Model
import typings.monacoEditor.anon.Owner
import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.Selection
import typings.monacoEditor.mod.Token
import typings.monacoEditor.mod.Uri
import typings.monacoEditor.mod.editor.^
import typings.monacoEditor.monacoEditorStrings.inUntrustedWorkspace
import typings.std.HTMLElement
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addCommand(descriptor: ICommandDescriptor): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("addCommand")(descriptor.asInstanceOf[js.Any]).asInstanceOf[IDisposable]

inline def addEditorAction(descriptor: IActionDescriptor): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("addEditorAction")(descriptor.asInstanceOf[js.Any]).asInstanceOf[IDisposable]

inline def addKeybindingRule(rule: IKeybindingRule): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("addKeybindingRule")(rule.asInstanceOf[js.Any]).asInstanceOf[IDisposable]

inline def addKeybindingRules(rules: js.Array[IKeybindingRule]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("addKeybindingRules")(rules.asInstanceOf[js.Any]).asInstanceOf[IDisposable]

inline def colorize(text: String, languageId: String, options: IColorizerOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("colorize")(text.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def colorizeElement(domNode: HTMLElement, options: IColorizerElementOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizeElement")(domNode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def colorizeModelLine(model: ITextModel, lineNumber: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizeModelLine")(model.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any])).asInstanceOf[String]
inline def colorizeModelLine(model: ITextModel, lineNumber: Double, tabSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizeModelLine")(model.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[String]

inline def create(domElement: HTMLElement): IStandaloneCodeEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any]).asInstanceOf[IStandaloneCodeEditor]
inline def create(domElement: HTMLElement, options: Unit, `override`: IEditorOverrideServices): IStandaloneCodeEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[IStandaloneCodeEditor]
inline def create(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IStandaloneCodeEditor]
inline def create(
  domElement: HTMLElement,
  options: IStandaloneEditorConstructionOptions,
  `override`: IEditorOverrideServices
): IStandaloneCodeEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[IStandaloneCodeEditor]

inline def createDiffEditor(domElement: HTMLElement): IStandaloneDiffEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any]).asInstanceOf[IStandaloneDiffEditor]
inline def createDiffEditor(domElement: HTMLElement, options: Unit, `override`: IEditorOverrideServices): IStandaloneDiffEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[IStandaloneDiffEditor]
inline def createDiffEditor(domElement: HTMLElement, options: IStandaloneDiffEditorConstructionOptions): IStandaloneDiffEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IStandaloneDiffEditor]
inline def createDiffEditor(
  domElement: HTMLElement,
  options: IStandaloneDiffEditorConstructionOptions,
  `override`: IEditorOverrideServices
): IStandaloneDiffEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[IStandaloneDiffEditor]

inline def createDiffNavigator(diffEditor: IStandaloneDiffEditor): IDiffNavigator = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffNavigator")(diffEditor.asInstanceOf[js.Any]).asInstanceOf[IDiffNavigator]
inline def createDiffNavigator(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffNavigator")(diffEditor.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IDiffNavigator]

inline def createModel(value: String): ITextModel = ^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any]).asInstanceOf[ITextModel]
inline def createModel(value: String, language: String): ITextModel = (^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[ITextModel]
inline def createModel(value: String, language: String, uri: Uri): ITextModel = (^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[ITextModel]
inline def createModel(value: String, language: Unit, uri: Uri): ITextModel = (^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[ITextModel]

inline def createWebWorker[T /* <: js.Object */](opts: IWebWorkerOptions): MonacoWebWorker[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebWorker")(opts.asInstanceOf[js.Any]).asInstanceOf[MonacoWebWorker[T]]

inline def defineTheme(themeName: String, themeData: IStandaloneThemeData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineTheme")(themeName.asInstanceOf[js.Any], themeData.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def getDiffEditors(): js.Array[IDiffEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiffEditors")().asInstanceOf[js.Array[IDiffEditor]]

inline def getEditors(): js.Array[ICodeEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditors")().asInstanceOf[js.Array[ICodeEditor]]

inline def getModel(uri: Uri): ITextModel | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getModel")(uri.asInstanceOf[js.Any]).asInstanceOf[ITextModel | Null]

inline def getModelMarkers(filter: Owner): js.Array[IMarker] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModelMarkers")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[IMarker]]

inline def getModels(): js.Array[ITextModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModels")().asInstanceOf[js.Array[ITextModel]]

inline def onDidChangeMarkers(listener: js.Function1[/* e */ js.Array[Uri], Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidChangeMarkers")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]

inline def onDidChangeModelLanguage(listener: js.Function1[/* e */ Model, Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidChangeModelLanguage")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]

inline def onDidCreateDiffEditor(listener: js.Function1[/* diffEditor */ IDiffEditor, Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateDiffEditor")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]

inline def onDidCreateEditor(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateEditor")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]

inline def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateModel")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]

inline def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onWillDisposeModel")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]

inline def registerCommand(id: String, handler: js.Function2[/* accessor */ Any, /* repeated */ Any, Unit]): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCommand")(id.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def remeasureFonts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remeasureFonts")().asInstanceOf[Unit]

inline def removeAllMarkers(owner: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllMarkers")(owner.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setModelLanguage(model: ITextModel, languageId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setModelLanguage")(model.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setModelMarkers(model: ITextModel, owner: String, markers: js.Array[IMarkerData]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setModelMarkers")(model.asInstanceOf[js.Any], owner.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setTheme(themeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTheme")(themeName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def tokenize(text: String, languageId: String): js.Array[js.Array[Token]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Token]]]

type ContextKeyValue = js.UndefOr[
Null | Boolean | Double | String | (js.Array[js.UndefOr[Null | Boolean | Double | String]]) | (Record[String, js.UndefOr[Null | Boolean | Double | String]])]

type FindComputedEditorOptionValueById[T /* <: EditorOption */] = NonNullable[
ComputedEditorOptionValue[
  /* import warning: importer.ImportType#apply Failed type conversion: monaco-editor.monaco-editor.editor.EditorOptionsType[monaco-editor.monaco-editor.editor.FindEditorOptionsKeyById<T>] */ js.Any
]]

type FindEditorOptionsKeyById[T /* <: EditorOption */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof monaco-editor.monaco-editor.editor.EditorOptionsType ]: monaco-editor.monaco-editor.editor.EditorOptionsType[K]['id'] extends T? K : never}[keyof monaco-editor.monaco-editor.editor.EditorOptionsType] */ js.Any

type IColors = StringDictionary[String]

type ICommandHandler = js.Function1[/* repeated */ Any, Unit]

type ICursorStateComputer = js.Function1[
/* inverseEditOperations */ js.Array[IValidEditOperation], 
js.Array[Selection] | Null]

type IEditorOverrideServices = StringDictionary[Any]

type IIdentifiedSingleEditOperation = ISingleEditOperation

type IModel = ITextModel

type IReadOnlyModel = ITextModel

type InUntrustedWorkspace = inUntrustedWorkspace

/* Rewritten from type alias, can be one of: 
  - typings.monacoEditor.monacoEditorStrings.on
  - typings.monacoEditor.monacoEditorStrings.off
  - typings.monacoEditor.monacoEditorStrings.relative
  - typings.monacoEditor.monacoEditorStrings.interval
  - js.Function1[/ * lineNumber * / scala.Double, java.lang.String]
*/
type LineNumbersType = _LineNumbersType | (js.Function1[/* lineNumber */ Double, String])
