package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.pg.pgMod.QueryConfig
import typings.pg.pgMod.QueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see ClientBase in @types/pg
@js.native
trait DB extends js.Object {
  def query(queryConfig: QueryConfig): js.Promise[QueryResult] = js.native
  def query(queryTextOrConfig: String): js.Promise[QueryResult] = js.native
  def query(queryTextOrConfig: String, values: js.Array[_]): js.Promise[QueryResult] = js.native
  def query(queryTextOrConfig: QueryConfig, values: js.Array[_]): js.Promise[QueryResult] = js.native
  def select(queryConfig: QueryConfig): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: String): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: String, values: js.Array[_]): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: QueryConfig, values: js.Array[_]): js.Promise[js.Array[_]] = js.native
}

