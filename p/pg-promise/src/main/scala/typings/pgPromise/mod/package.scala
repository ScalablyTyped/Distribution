package typings.pgPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Default library interface (before initialization)
  // API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
  @scala.inline
  def apply[Ext, C /* <: typings.pgPromise.pgSubsetMod.IClient */](): typings.pgPromise.mod.IMain[Ext, C] = typings.pgPromise.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.pgPromise.mod.IMain[Ext, C]]
  @scala.inline
  def apply[Ext, C /* <: typings.pgPromise.pgSubsetMod.IClient */](options: typings.pgPromise.mod.IInitOptions[Ext, C]): typings.pgPromise.mod.IMain[Ext, C] = typings.pgPromise.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.pgPromise.mod.IMain[Ext, C]]
  
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
  
  @scala.inline
  def as: typings.pgPromise.mod.IFormatting = typings.pgPromise.mod.^.asInstanceOf[js.Dynamic].selectDynamic("as").asInstanceOf[typings.pgPromise.mod.IFormatting]
  
  @scala.inline
  def minify(sql: java.lang.String): java.lang.String = typings.pgPromise.mod.^.asInstanceOf[js.Dynamic].applyDynamic("minify")(sql.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def minify(sql: java.lang.String, options: typings.pgMinify.mod.IMinifyOptions): java.lang.String = (typings.pgPromise.mod.^.asInstanceOf[js.Dynamic].applyDynamic("minify")(sql.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def utils: typings.pgPromise.mod.IUtils = typings.pgPromise.mod.^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[typings.pgPromise.mod.IUtils]
}
