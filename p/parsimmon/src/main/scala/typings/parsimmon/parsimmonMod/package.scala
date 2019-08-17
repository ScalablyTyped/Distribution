package typings.parsimmon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parsimmonMod {
  import org.scalablytyped.runtime.StringDictionary

  type FailureFunctionType[U] = js.Function2[/* index */ Double, /* msg */ String, Reply[U]]
  type Language = StringDictionary[Parser[js.Any]]
  type ParseFunctionType[U] = js.Function2[/* stream */ StreamType, /* index */ Double, Reply[U]]
  type Rule = StringDictionary[js.Function1[/* r */ Language, Parser[js.Any]]]
  type StreamType = String
  type SuccessFunctionType[U] = js.Function2[/* index */ Double, /* result */ U, Reply[U]]
  type TypedLanguage[TLanguageSpec] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typings.parsimmon.parsimmonStrings.TypedLanguage with TLanguageSpec
  type TypedRule[TLanguageSpec] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: (r : parsimmon.parsimmon.TypedLanguage<TLanguageSpec>): parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typings.parsimmon.parsimmonStrings.TypedRule with TLanguageSpec
}
