package typings.pgDashPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pgDashPromiseMod {
  /* Rewritten from type alias, can be one of: 
    - typings.pgDashPromise.pgDashPromiseMod.Column
    - typings.pgDashPromise.pgDashPromiseMod.ColumnSet
    - js.Array[
  java.lang.String | typings.pgDashPromise.pgDashPromiseMod.IColumnConfig | typings.pgDashPromise.pgDashPromiseMod.Column]
  */
  type QueryColumns = _QueryColumns | (js.Array[String | IColumnConfig | Column])
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.pgDashPromise.pgDashPromiseMod.QueryFile
    - typings.pgDashPromise.pgDashPromiseMod.IPreparedStatement
    - typings.pgDashPromise.pgDashPromiseMod.IParameterizedQuery
    - typings.pgDashPromise.pgDashPromiseMod.PreparedStatement
    - typings.pgDashPromise.pgDashPromiseMod.ParameterizedQuery
    - js.Function1[
  / * values * / js.UndefOr[js.Any], 
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias pg-promise.pg-promise.QueryParam * / js.Object]
  */
  type QueryParam = _QueryParam | (js.Function1[
    /* values */ js.UndefOr[js.Any], 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias pg-promise.pg-promise.QueryParam */ js.Object
  ]) | String
  type ValidSchema = String | js.Array[String] | Null | Unit
}
