package typings.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type QueryColumns = typings.pgPromise.mod.Column[js.Any] | typings.pgPromise.mod.ColumnSet[js.Any] | (js.Array[
    java.lang.String | typings.pgPromise.mod.IColumnConfig[js.Any] | typings.pgPromise.mod.Column[js.Any]
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
