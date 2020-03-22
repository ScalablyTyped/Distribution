package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Match {
  type Pattern = js.UndefOr[
    typings.std.StringConstructor | typings.std.NumberConstructor | typings.std.BooleanConstructor | typings.std.ObjectConstructor | typings.std.FunctionConstructor | (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]) | scala.Null | java.lang.String | scala.Double | scala.Boolean | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.Pattern */ js.Object
    ]) | (org.scalablytyped.runtime.StringDictionary[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.Pattern */ js.Object
    ]) | typings.meteor.Match.Matcher[js.Any]
  ]
  type PatternMatch[T /* <: typings.meteor.Match.Pattern */] = js.Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.PatternMatch<T[K]> * / object}
    */ typings.meteor.meteorStrings.PatternMatch with js.Any) | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.PatternMatch<T[0]> */ js.Object
  ]) | T | js.Function | scala.Boolean | scala.Double | java.lang.String
}
