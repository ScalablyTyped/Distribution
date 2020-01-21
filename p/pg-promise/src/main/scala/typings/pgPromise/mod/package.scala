package typings.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.pgPromise.mod.Column
    - typings.pgPromise.mod.ColumnSet
    - js.Array[
  java.lang.String | typings.pgPromise.mod.IColumnConfig | typings.pgPromise.mod.Column]
  */
  type QueryColumns = typings.pgPromise.mod._QueryColumns | (js.Array[
    java.lang.String | typings.pgPromise.mod.IColumnConfig | typings.pgPromise.mod.Column
  ])
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.pgPromise.mod.QueryFile
    - typings.pgPromise.mod.IPreparedStatement
    - typings.pgPromise.mod.IParameterizedQuery
    - typings.pgPromise.mod.PreparedStatement
    - typings.pgPromise.mod.ParameterizedQuery
    - js.Function1[
  / * values * / js.UndefOr[js.Any], 
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias pg-promise.pg-promise.QueryParam * / js.Object]
  */
  type QueryParam = typings.pgPromise.mod._QueryParam | (js.Function1[
    /* values */ js.UndefOr[js.Any], 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias pg-promise.pg-promise.QueryParam */ js.Object
  ]) | java.lang.String
  type ValidSchema = java.lang.String | js.Array[java.lang.String] | scala.Null | scala.Unit
  type XPromise[T] = js.Promise[T]
}
