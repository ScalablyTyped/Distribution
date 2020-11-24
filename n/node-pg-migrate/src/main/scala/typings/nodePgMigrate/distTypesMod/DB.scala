package typings.nodePgMigrate.distTypesMod

import typings.pg.mod.QueryArrayConfig
import typings.pg.mod.QueryArrayResult
import typings.pg.mod.QueryConfig
import typings.pg.mod.QueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DB extends js.Object {
  
  def query(queryConfig: QueryArrayConfig[js.Array[_]]): js.Promise[QueryArrayResult[js.Array[_]]] = js.native
  def query(queryConfig: QueryArrayConfig[js.Array[_]], values: js.Array[_]): js.Promise[QueryArrayResult[js.Array[_]]] = js.native
  def query(queryConfig: QueryConfig[js.Array[_]]): js.Promise[QueryResult[_]] = js.native
  def query(queryTextOrConfig: String): js.Promise[QueryResult[_]] = js.native
  def query(queryTextOrConfig: String, values: js.Array[_]): js.Promise[QueryResult[_]] = js.native
  def query(queryTextOrConfig: QueryConfig[js.Array[_]], values: js.Array[_]): js.Promise[QueryResult[_]] = js.native
  
  def select(queryConfig: QueryArrayConfig[js.Array[_]]): js.Promise[js.Array[_]] = js.native
  def select(queryConfig: QueryArrayConfig[js.Array[_]], values: js.Array[_]): js.Promise[js.Array[_]] = js.native
  def select(queryConfig: QueryConfig[js.Array[_]]): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: String): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: String, values: js.Array[_]): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: QueryConfig[js.Array[_]], values: js.Array[_]): js.Promise[js.Array[_]] = js.native
}
