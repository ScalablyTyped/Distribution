package typings.nodePgMigrate.migrationMod

import typings.nodePgMigrate.distTypesMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/migration", "getTimestamp")
@js.native
object getTimestamp extends js.Object {
  def apply(logger: Logger, filename: String): Double = js.native
}

