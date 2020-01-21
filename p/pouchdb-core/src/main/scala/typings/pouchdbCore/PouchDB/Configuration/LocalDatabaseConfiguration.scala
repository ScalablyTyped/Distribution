package typings.pouchdbCore.PouchDB.Configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalDatabaseConfiguration
  extends CommonDatabaseConfiguration
     with DatabaseConfiguration {
  /**
    * Enables auto compaction, which means compact() is called after
    * every change to the database.
    *
    * Defaults to false.
    */
  var auto_compaction: js.UndefOr[Boolean] = js.undefined
  /**
    * Use a md5 hash to create a deterministic revision number for documents.
    * Setting it to false will mean that the revision number will be a random UUID.
    * Defaults to true.
    */
  var deterministic_revs: js.UndefOr[Boolean] = js.undefined
  /**
    * A special constructor option, which appends a prefix to the database name
    * and can be helpful for URL-based or file-based LevelDOWN path names.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * How many old revisions we keep track (not a copy) of.
    */
  var revs_limit: js.UndefOr[Double] = js.undefined
  /**
    * Size of the database (Most significant for Safari)
    * option to set the max size in MB that Safari will grant to the local database. Valid options are: 10, 50, 100, 500 and 1000
    * ex_ new PouchDB("dbName", {size:100});
    */
  var size: js.UndefOr[Double] = js.undefined
}

object LocalDatabaseConfiguration {
  @scala.inline
  def apply(
    adapter: String = null,
    auto_compaction: js.UndefOr[Boolean] = js.undefined,
    deterministic_revs: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prefix: String = null,
    revs_limit: Int | Double = null,
    size: Int | Double = null
  ): LocalDatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction.asInstanceOf[js.Any])
    if (!js.isUndefined(deterministic_revs)) __obj.updateDynamic("deterministic_revs")(deterministic_revs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalDatabaseConfiguration]
  }
}

