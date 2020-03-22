package typings.nodePgMigrate.migrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/migration", "loadMigrationFiles")
@js.native
object loadMigrationFiles extends js.Object {
  def apply(dir: String): js.Promise[js.Array[String]] = js.native
  def apply(dir: String, ignorePattern: String): js.Promise[js.Array[String]] = js.native
}

