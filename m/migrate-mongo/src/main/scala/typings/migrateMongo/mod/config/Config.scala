package typings.migrateMongo.mod.config

import typings.migrateMongo.anon.DatabaseName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * The MongoDB collection where the applied changes are stored.
    */
  var changelogCollectionName: String = js.native
  /**
    * The migrations dir, can be an relative or absolute path.
    */
  var migrationsDir: js.UndefOr[String] = js.native
  var mongodb: DatabaseName = js.native
}

object Config {
  @scala.inline
  def apply(changelogCollectionName: String, mongodb: DatabaseName): Config = {
    val __obj = js.Dynamic.literal(changelogCollectionName = changelogCollectionName.asInstanceOf[js.Any], mongodb = mongodb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangelogCollectionName(value: String): Self = this.set("changelogCollectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMongodb(value: DatabaseName): Self = this.set("mongodb", value.asInstanceOf[js.Any])
    @scala.inline
    def setMigrationsDir(value: String): Self = this.set("migrationsDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMigrationsDir: Self = this.set("migrationsDir", js.undefined)
  }
  
}

