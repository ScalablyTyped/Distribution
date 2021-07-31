package typings.nodePgMigrate.distTypesMod

import typings.pg.mod.QueryArrayConfig
import typings.pg.mod.QueryArrayResult
import typings.pg.mod.QueryConfig
import typings.pg.mod.QueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DB extends StObject {
  
  def query(queryConfig: QueryArrayConfig[js.Array[js.Any]]): js.Promise[QueryArrayResult[js.Array[js.Any]]] = js.native
  def query(queryConfig: QueryArrayConfig[js.Array[js.Any]], values: js.Array[js.Any]): js.Promise[QueryArrayResult[js.Array[js.Any]]] = js.native
  def query(queryConfig: QueryConfig[js.Array[js.Any]]): js.Promise[QueryResult[js.Any]] = js.native
  def query(queryTextOrConfig: String): js.Promise[QueryResult[js.Any]] = js.native
  def query(queryTextOrConfig: String, values: js.Array[js.Any]): js.Promise[QueryResult[js.Any]] = js.native
  def query(queryTextOrConfig: QueryConfig[js.Array[js.Any]], values: js.Array[js.Any]): js.Promise[QueryResult[js.Any]] = js.native
  
  def select(queryConfig: QueryArrayConfig[js.Array[js.Any]]): js.Promise[js.Array[js.Any]] = js.native
  def select(queryConfig: QueryArrayConfig[js.Array[js.Any]], values: js.Array[js.Any]): js.Promise[js.Array[js.Any]] = js.native
  def select(queryConfig: QueryConfig[js.Array[js.Any]]): js.Promise[js.Array[js.Any]] = js.native
  def select(queryTextOrConfig: String): js.Promise[js.Array[js.Any]] = js.native
  def select(queryTextOrConfig: String, values: js.Array[js.Any]): js.Promise[js.Array[js.Any]] = js.native
  def select(queryTextOrConfig: QueryConfig[js.Array[js.Any]], values: js.Array[js.Any]): js.Promise[js.Array[js.Any]] = js.native
}
