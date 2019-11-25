package typings.pouchdbDashAdapterDashCordovaDashSqlite.PouchDB.AdapterCordovaSqlite

import typings.pouchdbDashAdapterDashCordovaDashSqlite.pouchdbDashAdapterDashCordovaDashSqliteStrings.`cordova-sqlite`
import typings.pouchdbDashCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_Configuration: `cordova-sqlite`
  /**
    * Version of android database to use.
    */
  var androidDatabaseImplementation: js.UndefOr[Double] = js.undefined
  /**
    * Location of database e.g. 'Default'. Only use 'location' or 'iosDatabaseLocation' not both.
    */
  var iosDatabaseLocation: js.UndefOr[String] = js.undefined
  /**
    * Location of database e.g. 'Default'.
    */
  var location: js.UndefOr[String] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    adapter: `cordova-sqlite`,
    androidDatabaseImplementation: Int | Double = null,
    auto_compaction: js.UndefOr[Boolean] = js.undefined,
    deterministic_revs: js.UndefOr[Boolean] = js.undefined,
    iosDatabaseLocation: String = null,
    location: String = null,
    name: String = null,
    prefix: String = null,
    revs_limit: Int | Double = null,
    size: Int | Double = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    if (androidDatabaseImplementation != null) __obj.updateDynamic("androidDatabaseImplementation")(androidDatabaseImplementation.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction.asInstanceOf[js.Any])
    if (!js.isUndefined(deterministic_revs)) __obj.updateDynamic("deterministic_revs")(deterministic_revs.asInstanceOf[js.Any])
    if (iosDatabaseLocation != null) __obj.updateDynamic("iosDatabaseLocation")(iosDatabaseLocation.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

