package typings.parsimmon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FailureFunctionType[U] = js.Function2[/* index */ scala.Double, /* msg */ java.lang.String, typings.parsimmon.mod.Reply[U]]
  type Language = org.scalablytyped.runtime.StringDictionary[typings.parsimmon.mod.Parser[js.Any]]
  type ParseFunctionType[U] = js.Function2[
    /* stream */ typings.parsimmon.mod.StreamType, 
    /* index */ scala.Double, 
    typings.parsimmon.mod.Reply[U]
  ]
  type Rule = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* r */ typings.parsimmon.mod.Language, typings.parsimmon.mod.Parser[js.Any]]
  ]
  type StreamType = java.lang.String
  type SuccessFunctionType[U] = js.Function2[/* index */ scala.Double, /* result */ U, typings.parsimmon.mod.Reply[U]]
  type TypedLanguage[TLanguageSpec] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typings.parsimmon.parsimmonStrings.TypedLanguage with TLanguageSpec
  type TypedRule[TLanguageSpec] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: (r : parsimmon.parsimmon.TypedLanguage<TLanguageSpec>): parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typings.parsimmon.parsimmonStrings.TypedRule with TLanguageSpec
}
