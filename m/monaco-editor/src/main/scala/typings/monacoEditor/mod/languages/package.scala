package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object languages {
  
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  
  type Definition = typings.monacoEditor.mod.languages.Location | (js.Array[
    typings.monacoEditor.mod.languages.Location | typings.monacoEditor.mod.languages.LocationLink
  ])
  
  type IMonarchLanguageAction = typings.monacoEditor.mod.languages.IShortMonarchLanguageAction | typings.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | (js.Array[
    typings.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | typings.monacoEditor.mod.languages.IShortMonarchLanguageAction
  ])
  
  type IMonarchLanguageRule = typings.monacoEditor.mod.languages.IShortMonarchLanguageRule1 | typings.monacoEditor.mod.languages.IShortMonarchLanguageRule2 | typings.monacoEditor.mod.languages.IExpandedMonarchLanguageRule
  
  type IShortMonarchLanguageAction = java.lang.String
  
  type IShortMonarchLanguageRule1 = js.Tuple2[
    java.lang.String | typings.std.RegExp, 
    typings.monacoEditor.mod.languages.IMonarchLanguageAction
  ]
  
  type IShortMonarchLanguageRule2 = js.Tuple3[
    java.lang.String | typings.std.RegExp, 
    typings.monacoEditor.mod.languages.IMonarchLanguageAction, 
    java.lang.String
  ]
  
  type ProviderResult[T] = js.UndefOr[T | scala.Null | (typings.monacoEditor.mod.Thenable[js.UndefOr[T | scala.Null]])]
}
