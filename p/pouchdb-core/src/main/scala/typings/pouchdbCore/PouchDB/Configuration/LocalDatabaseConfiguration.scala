package typings.pouchdbCore.PouchDB.Configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalDatabaseConfiguration
  extends CommonDatabaseConfiguration
     with DatabaseConfiguration {
  /**
    * Enables auto compaction, which means compact() is called after
    * every change to the database.
    *
    * Defaults to false.
    */
  var auto_compaction: js.UndefOr[Boolean] = js.native
  /**
    * Use a md5 hash to create a deterministic revision number for documents.
    * Setting it to false will mean that the revision number will be a random UUID.
    * Defaults to true.
    */
  var deterministic_revs: js.UndefOr[Boolean] = js.native
  /**
    * A special constructor option, which appends a prefix to the database name
    * and can be helpful for URL-based or file-based LevelDOWN path names.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * How many old revisions we keep track (not a copy) of.
    */
  var revs_limit: js.UndefOr[Double] = js.native
  /**
    * Size of the database (Most significant for Safari)
    * option to set the max size in MB that Safari will grant to the local database. Valid options are: 10, 50, 100, 500 and 1000
    * ex_ new PouchDB("dbName", {size:100});
    */
  var size: js.UndefOr[Double] = js.native
}

object LocalDatabaseConfiguration {
  @scala.inline
  def apply(): LocalDatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalDatabaseConfiguration]
  }
  @scala.inline
  implicit class LocalDatabaseConfigurationOps[Self <: LocalDatabaseConfiguration] (val x: Self) extends AnyVal {
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
    def setAuto_compaction(value: Boolean): Self = this.set("auto_compaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto_compaction: Self = this.set("auto_compaction", js.undefined)
    @scala.inline
    def setDeterministic_revs(value: Boolean): Self = this.set("deterministic_revs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeterministic_revs: Self = this.set("deterministic_revs", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRevs_limit(value: Double): Self = this.set("revs_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevs_limit: Self = this.set("revs_limit", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

