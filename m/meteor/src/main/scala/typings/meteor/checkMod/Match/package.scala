package typings.meteor.checkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Match {
  
  type Pattern = js.UndefOr[
    (typings.std.StringConstructor with org.scalablytyped.runtime.Instantiable0[typings.std.global.String]) | (typings.std.NumberConstructor with org.scalablytyped.runtime.Instantiable0[typings.std.global.Number]) | (typings.std.BooleanConstructor with org.scalablytyped.runtime.Instantiable0[typings.std.global.Boolean]) | (typings.std.ObjectConstructor with org.scalablytyped.runtime.Instantiable0[typings.std.global.Object]) | (typings.std.FunctionConstructor with (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ java.lang.String, typings.std.global.Function])) | (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]) | scala.Null | java.lang.String | scala.Double | scala.Boolean | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.Pattern */ js.Object
    ]) | (org.scalablytyped.runtime.StringDictionary[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.Pattern */ js.Object
    ]) | typings.meteor.checkMod.Match.Matcher[js.Any]
  ]
  
  type PatternMatch[T /* <: typings.meteor.checkMod.Match.Pattern */] = js.Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[K]> * / object}
    */ typings.meteor.meteorStrings.PatternMatch with org.scalablytyped.runtime.TopLevel[js.Any]) | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[0]> */ js.Object
  ]) | T | js.Function | scala.Boolean | scala.Double | java.lang.String
}
