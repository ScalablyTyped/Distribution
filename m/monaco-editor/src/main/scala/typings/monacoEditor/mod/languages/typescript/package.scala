package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def getJavaScriptWorker(): js.Promise[
js.Function1[
  /* repeated */ typings.monacoEditor.mod.Uri, 
  js.Promise[typings.monacoEditor.mod.languages.typescript.TypeScriptWorker]
]] = typings.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].applyDynamic("getJavaScriptWorker")().asInstanceOf[js.Promise[
js.Function1[
  /* repeated */ typings.monacoEditor.mod.Uri, 
  js.Promise[typings.monacoEditor.mod.languages.typescript.TypeScriptWorker]
]]]

@scala.inline
def getTypeScriptWorker(): js.Promise[
js.Function1[
  /* repeated */ typings.monacoEditor.mod.Uri, 
  js.Promise[typings.monacoEditor.mod.languages.typescript.TypeScriptWorker]
]] = typings.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].applyDynamic("getTypeScriptWorker")().asInstanceOf[js.Promise[
js.Function1[
  /* repeated */ typings.monacoEditor.mod.Uri, 
  js.Promise[typings.monacoEditor.mod.languages.typescript.TypeScriptWorker]
]]]

@scala.inline
def javascriptDefaults: typings.monacoEditor.mod.languages.typescript.LanguageServiceDefaults = typings.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].selectDynamic("javascriptDefaults").asInstanceOf[typings.monacoEditor.mod.languages.typescript.LanguageServiceDefaults]

@scala.inline
def typescriptDefaults: typings.monacoEditor.mod.languages.typescript.LanguageServiceDefaults = typings.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].selectDynamic("typescriptDefaults").asInstanceOf[typings.monacoEditor.mod.languages.typescript.LanguageServiceDefaults]

@scala.inline
def typescriptVersion: java.lang.String = typings.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].selectDynamic("typescriptVersion").asInstanceOf[java.lang.String]

type CompilerOptionsValue = js.UndefOr[
java.lang.String | scala.Double | scala.Boolean | (js.Array[scala.Double | java.lang.String]) | typings.monacoEditor.mod.languages.typescript.MapLike[js.Array[java.lang.String]] | scala.Null]

type IExtraLibs = org.scalablytyped.runtime.StringDictionary[typings.monacoEditor.mod.languages.typescript.IExtraLib]

type MapLike[T] = org.scalablytyped.runtime.StringDictionary[T]
