package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see ClientBase in @types/pg
@js.native
trait DB extends js.Object {
  def query(queryConfig: pgLib.pgMod.QueryConfig): js.Promise[pgLib.pgMod.QueryResult] = js.native
  def query(queryTextOrConfig: java.lang.String): js.Promise[pgLib.pgMod.QueryResult] = js.native
  def query(queryTextOrConfig: java.lang.String, values: js.Array[_]): js.Promise[pgLib.pgMod.QueryResult] = js.native
  def query(queryTextOrConfig: pgLib.pgMod.QueryConfig, values: js.Array[_]): js.Promise[pgLib.pgMod.QueryResult] = js.native
  def select(queryConfig: pgLib.pgMod.QueryConfig): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: java.lang.String): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: java.lang.String, values: js.Array[_]): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: pgLib.pgMod.QueryConfig, values: js.Array[_]): js.Promise[js.Array[_]] = js.native
}

