package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StringDictionary
import typings.monacoEditor.mod.Uri
import typings.monacoEditor.mod.languages.typescript.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getJavaScriptWorker(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJavaScriptWorker")().asInstanceOf[js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]]

inline def getTypeScriptWorker(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeScriptWorker")().asInstanceOf[js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]]

inline def javascriptDefaults: LanguageServiceDefaults = ^.asInstanceOf[js.Dynamic].selectDynamic("javascriptDefaults").asInstanceOf[LanguageServiceDefaults]

inline def typescriptDefaults: LanguageServiceDefaults = ^.asInstanceOf[js.Dynamic].selectDynamic("typescriptDefaults").asInstanceOf[LanguageServiceDefaults]

inline def typescriptVersion: String = ^.asInstanceOf[js.Dynamic].selectDynamic("typescriptVersion").asInstanceOf[String]

type CompilerOptionsValue = js.UndefOr[
String | Double | Boolean | (js.Array[Double | String]) | MapLike[js.Array[String]] | Null]

type IExtraLibs = StringDictionary[IExtraLib]

type MapLike[T] = StringDictionary[T]
