package typings.migrateMongo.mod.config

import typings.migrateMongo.AnonDatabaseName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * The MongoDB collection where the applied changes are stored.
    */
  var changelogCollectionName: String
  /**
    * The migrations dir, can be an relative or absolute path.
    */
  var migrationsDir: js.UndefOr[String] = js.undefined
  var mongodb: AnonDatabaseName
}

object Config {
  @scala.inline
  def apply(changelogCollectionName: String, mongodb: AnonDatabaseName, migrationsDir: String = null): Config = {
    val __obj = js.Dynamic.literal(changelogCollectionName = changelogCollectionName.asInstanceOf[js.Any], mongodb = mongodb.asInstanceOf[js.Any])
    if (migrationsDir != null) __obj.updateDynamic("migrationsDir")(migrationsDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

