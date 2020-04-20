package typings.nodePgMigrate.migrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunMigration extends js.Object {
  val name: String
  val path: String
  val timestamp: Double
}

object RunMigration {
  @scala.inline
  def apply(name: String, path: String, timestamp: Double): RunMigration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunMigration]
  }
}

