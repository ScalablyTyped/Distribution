package typings.pouchdbDashAdapterDashLocalstorage.PouchDB.LocalStorageAdapter

import typings.pouchdbDashAdapterDashLocalstorage.pouchdbDashAdapterDashLocalstorageStrings.localstorage
import typings.pouchdbDashCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStorageAdapterConfiguration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_LocalStorageAdapterConfiguration: localstorage
}

object LocalStorageAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: localstorage,
    auto_compaction: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prefix: String = null,
    revs_limit: Int | Double = null,
    size: Int | Double = null
  ): LocalStorageAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter)
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStorageAdapterConfiguration]
  }
}

