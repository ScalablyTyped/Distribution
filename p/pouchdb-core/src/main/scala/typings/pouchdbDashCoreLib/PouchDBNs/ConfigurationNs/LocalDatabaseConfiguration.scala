package typings
package pouchdbDashCoreLib.PouchDBNs.ConfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalDatabaseConfiguration extends CommonDatabaseConfiguration {
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

