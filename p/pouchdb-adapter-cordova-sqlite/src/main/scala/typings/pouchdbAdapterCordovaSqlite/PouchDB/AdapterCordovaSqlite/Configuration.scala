package typings.pouchdbAdapterCordovaSqlite.PouchDB.AdapterCordovaSqlite

import typings.pouchdbAdapterCordovaSqlite.pouchdbAdapterCordovaSqliteStrings.`cordova-sqlite`
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
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
    androidDatabaseImplementation: js.UndefOr[Double] = js.undefined,
    auto_compaction: js.UndefOr[Boolean] = js.undefined,
    deterministic_revs: js.UndefOr[Boolean] = js.undefined,
    iosDatabaseLocation: String = null,
    location: String = null,
    name: String = null,
    prefix: String = null,
    revs_limit: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): Configuration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    if (!js.isUndefined(androidDatabaseImplementation)) __obj.updateDynamic("androidDatabaseImplementation")(androidDatabaseImplementation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deterministic_revs)) __obj.updateDynamic("deterministic_revs")(deterministic_revs.get.asInstanceOf[js.Any])
    if (iosDatabaseLocation != null) __obj.updateDynamic("iosDatabaseLocation")(iosDatabaseLocation.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(revs_limit)) __obj.updateDynamic("revs_limit")(revs_limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

