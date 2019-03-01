package typings
package pouchdbDashCoreLib.PouchDBNs.ConfigurationNs

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
  var auto_compaction: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A special constructor option, which appends a prefix to the database name
    * and can be helpful for URL-based or file-based LevelDOWN path names.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How many old revisions we keep track (not a copy) of.
    */
  var revs_limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of the database (Most significant for Safari)
    * option to set the max size in MB that Safari will grant to the local database. Valid options are: 10, 50, 100, 500 and 1000
    * ex_ new PouchDB("dbName", {size:100});
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object LocalDatabaseConfiguration {
  @scala.inline
  def apply(
    adapter: java.lang.String = null,
    auto_compaction: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    prefix: java.lang.String = null,
    revs_limit: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null
  ): LocalDatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter)
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalDatabaseConfiguration]
  }
}

