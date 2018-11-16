package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see ClientBase in @types/pg
@js.native
trait DB extends js.Object {
  def query(queryConfig: pgLib.pgMod.QueryConfig): stdLib.Promise[pgLib.pgMod.QueryResult] = js.native
  def query(queryText: java.lang.String): stdLib.Promise[pgLib.pgMod.QueryResult] = js.native
  def query(queryText: java.lang.String, values: js.Array[_]): stdLib.Promise[pgLib.pgMod.QueryResult] = js.native
  def select(queryConfig: pgLib.pgMod.QueryConfig): stdLib.Promise[js.Array[_]] = js.native
  def select(queryText: java.lang.String): stdLib.Promise[js.Array[_]] = js.native
  def select(queryText: java.lang.String, values: js.Array[_]): stdLib.Promise[js.Array[_]] = js.native
}

