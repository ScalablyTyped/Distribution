package typings.nodePgMigrate

import typings.pg.mod.Client
import typings.pg.mod.ClientConfig
import typings.pg.mod.QueryArrayConfig
import typings.pg.mod.QueryArrayResult
import typings.pg.mod.QueryConfig
import typings.pg.mod.QueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/db", JSImport.Namespace)
@js.native
object dbMod extends js.Object {
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
  
  @js.native
  trait DBConnection extends DB {
    def addBeforeCloseListener(listener: js.Any): Double = js.native
    def close(): js.Promise[Unit] = js.native
    def column(columnName: String, queryConfig: QueryArrayConfig[js.Array[_]]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryConfig: QueryArrayConfig[js.Array[_]], values: js.Array[_]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryConfig: QueryConfig[js.Array[_]]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryTextOrConfig: String): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryTextOrConfig: String, values: js.Array[_]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryTextOrConfig: QueryConfig[js.Array[_]], values: js.Array[_]): js.Promise[js.Array[_]] = js.native
    def createConnection(): js.Promise[Unit] = js.native
  }
  
  def default(connection: String): DBConnection = js.native
  def default(
    connection: String,
    log: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  ): DBConnection = js.native
  def default(connection: Client): DBConnection = js.native
  def default(connection: ClientConfig): DBConnection = js.native
  def default(
    connection: ClientConfig,
    log: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  ): DBConnection = js.native
  def default(
    connection: Client,
    log: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  ): DBConnection = js.native
}

