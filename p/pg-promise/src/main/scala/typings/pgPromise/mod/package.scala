package typings.pgPromise.mod

import typings.pgMinify.mod.IMinifyOptions
import typings.pgPromise.mod.^
import typings.pgPromise.typescriptPgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Default library interface (before initialization)
// API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
inline def apply[Ext, C /* <: IClient */](): IMain[Ext, C] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[IMain[Ext, C]]
inline def apply[Ext, C /* <: IClient */](options: IInitOptions[Ext, C]): IMain[Ext, C] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMain[Ext, C]]

inline def as: IFormatting = ^.asInstanceOf[js.Dynamic].selectDynamic("as").asInstanceOf[IFormatting]

inline def minify(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
inline def minify(sql: String, options: IMinifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(sql.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def utils: IUtils = ^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[IUtils]

/* Rewritten from type alias, can be one of: 
  - typings.pgPromise.mod.Column[T]
  - typings.pgPromise.mod.ColumnSet[T]
  - js.Array[
java.lang.String | typings.pgPromise.mod.IColumnConfig[T] | typings.pgPromise.mod.Column[T]]
*/
type QueryColumns[T] = _QueryColumns[T] | (js.Array[String | IColumnConfig[T] | Column[T]])

/** 
NOTE: Rewritten from type alias:
{{{
type QueryParam = string | pg-promise.pg-promise.QueryFile | pg-promise.pg-promise.IPreparedStatement | pg-promise.pg-promise.IParameterizedQuery | pg-promise.pg-promise.PreparedStatement | pg-promise.pg-promise.ParameterizedQuery | (values : any | undefined): pg-promise.pg-promise.QueryParam
}}}
to avoid circular code involving: 
- pg-promise.pg-promise.QueryParam
*/
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.pgPromise.mod.QueryFile
  - typings.pgPromise.mod.IPreparedStatement
  - typings.pgPromise.mod.IParameterizedQuery
  - typings.pgPromise.mod.PreparedStatement
  - typings.pgPromise.mod.ParameterizedQuery
  - js.Function1[/ * values * / js.UndefOr[scala.Any], scala.Any]
*/
type QueryParam = _QueryParam | (js.Function1[/* values */ js.UndefOr[Any], Any]) | String

type ValidSchema = String | js.Array[String] | Null | Unit

type XPromise[T] = js.Promise[T]
