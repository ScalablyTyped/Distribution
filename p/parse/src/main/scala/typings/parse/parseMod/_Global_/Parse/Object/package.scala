package typings.parse.parseMod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Object {
  import typings.std.ReturnType

  // From https://github.com/parse-community/Parse-SDK-JS/blob/master/src/encode.js
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.parse.parseMod._Global_.Parse.Object.ToJSON[T]
    - js.Array[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias parse.parse._Global_.Parse.Object.Encode<R> * / js.Object]
    - java.lang.String
    - typings.parse.Anon_Date
    - typings.std.ReturnType[
  / * import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] * / js.Any]
    - typings.parse.parseMod._Global_.Parse.Pointer
  */
  type Encode[T] = _Encode[T] | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias parse.parse._Global_.Parse.Object.Encode<R> */ js.Object
  ]) | (ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] */ js.Any
  ]) | T | ToJSON[T] | String
  type ToJSON[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: parse.parse._Global_.Parse.Object.Encode<T[K]>}
    */ typings.parse.parseStrings.ToJSON with T
}
