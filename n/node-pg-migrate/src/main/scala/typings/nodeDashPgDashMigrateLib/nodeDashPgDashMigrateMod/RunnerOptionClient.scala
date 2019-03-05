package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunnerOptionClient extends js.Object {
  var dbClient: pgLib.pgMod.Client
}

object RunnerOptionClient {
  @scala.inline
  def apply(dbClient: pgLib.pgMod.Client): RunnerOptionClient = {
    val __obj = js.Dynamic.literal(dbClient = dbClient)
  
    __obj.asInstanceOf[RunnerOptionClient]
  }
}

