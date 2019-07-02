package typings
package pouchdbDashAdapterDashCordovaDashSqliteLib.PouchDBNs.AdapterCordovaSqliteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration
  extends pouchdbDashCoreLib.PouchDBNs.ConfigurationNs.LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_Configuration: pouchdbDashAdapterDashCordovaDashSqliteLib.pouchdbDashAdapterDashCordovaDashSqliteLibStrings.`cordova-sqlite`
  /**
    * Version of android database to use.
    */
  var androidDatabaseImplementation: js.UndefOr[scala.Double] = js.undefined
  /**
    * Location of database e.g. 'Default'. Only use 'location' or 'iosDatabaseLocation' not both.
    */
  var iosDatabaseLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Location of database e.g. 'Default'.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    adapter: pouchdbDashAdapterDashCordovaDashSqliteLib.pouchdbDashAdapterDashCordovaDashSqliteLibStrings.`cordova-sqlite`,
    androidDatabaseImplementation: scala.Int | scala.Double = null,
    auto_compaction: js.UndefOr[scala.Boolean] = js.undefined,
    iosDatabaseLocation: java.lang.String = null,
    location: java.lang.String = null,
    name: java.lang.String = null,
    prefix: java.lang.String = null,
    revs_limit: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null
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

