package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typescript {
  
  type CompilerOptionsValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[scala.Double | java.lang.String]) | typings.monacoEditor.mod.languages.typescript.MapLike[js.Array[java.lang.String]] | scala.Null
  ]
  
  type IExtraLibs = org.scalablytyped.runtime.StringDictionary[typings.monacoEditor.mod.languages.typescript.IExtraLib]
  
  type MapLike[T] = org.scalablytyped.runtime.StringDictionary[T]
}
