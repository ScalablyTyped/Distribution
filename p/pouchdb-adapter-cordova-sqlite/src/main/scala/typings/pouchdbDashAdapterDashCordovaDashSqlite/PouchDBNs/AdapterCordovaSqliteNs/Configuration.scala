package typings.pouchdbDashAdapterDashCordovaDashSqlite.PouchDBNs.AdapterCordovaSqliteNs

import typings.pouchdbDashAdapterDashCordovaDashSqlite.pouchdbDashAdapterDashCordovaDashSqliteStrings.`cordova-sqlite`
import typings.pouchdbDashCore.PouchDBNs.ConfigurationNs.LocalDatabaseConfiguration
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
    iosDatabaseLocation: String = null,
    location: String = null,
    name: String = null,
    prefix: String = null,
    revs_limit: Int | Double = null,
    size: Int | Double = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(adapter = adapter)
    if (androidDatabaseImplementation != null) __obj.updateDynamic("androidDatabaseImplementation")(androidDatabaseImplementation.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction)
    if (iosDatabaseLocation != null) __obj.updateDynamic("iosDatabaseLocation")(iosDatabaseLocation)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

