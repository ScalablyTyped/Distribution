package typings.pgPromise.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.pgMinify.mod.IMinifyOptions
import typings.pgPromise.anon.TypeofTxMode
import typings.pgPromise.anon.Typeoferrors
import typings.pgPromise.anon.Typeofpg
import typings.pgPromise.typescriptPgSubsetMod.IClient
import typings.pgPromise.typescriptPgSubsetMod.IConnectionParameters
import typings.spex.mod.ISpex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Post-initialization interface;
// API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
@js.native
trait IMain[Ext, C /* <: IClient */] extends StObject {
  
  def apply[T, C /* <: IClient */](cn: String): (IDatabase[T, C]) & T = js.native
  def apply[T, C /* <: IClient */](cn: String, dc: Any): (IDatabase[T, C]) & T = js.native
  def apply[T, C /* <: IClient */](cn: IConnectionParameters[C]): (IDatabase[T, C]) & T = js.native
  def apply[T, C /* <: IClient */](cn: IConnectionParameters[C], dc: Any): (IDatabase[T, C]) & T = js.native
  
  val ParameterizedQuery: Instantiable1[
    /* options */ js.UndefOr[String | typings.pgPromise.mod.QueryFile | IParameterizedQuery], 
    typings.pgPromise.mod.ParameterizedQuery
  ] = js.native
  
  val PreparedStatement: Instantiable1[
    /* options */ js.UndefOr[IPreparedStatement], 
    typings.pgPromise.mod.PreparedStatement
  ] = js.native
  
  val PromiseAdapter: Instantiable1[/* api */ IPromiseConfig, typings.pgPromise.mod.PromiseAdapter] = js.native
  
  val QueryFile: Instantiable2[
    /* file */ String, 
    /* options */ js.UndefOr[IQueryFileOptions], 
    typings.pgPromise.mod.QueryFile
  ] = js.native
  
  val as: IFormatting = js.native
  
  def end(): Unit = js.native
  
  val errors: Typeoferrors = js.native
  
  val helpers: IHelpers = js.native
  
  def minify(sql: String): String = js.native
  def minify(sql: String, options: IMinifyOptions): String = js.native
  
  val pg: Typeofpg = js.native
  
  val queryResult: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof queryResult */ Any = js.native
  
  val spex: ISpex = js.native
  
  val txMode: TypeofTxMode = js.native
  
  val utils: IUtils = js.native
}
