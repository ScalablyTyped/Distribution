package typings.pouchdbDashAdapterDashIdb.PouchDB.IdbAdapter

import typings.pouchdbDashAdapterDashIdb.pouchdbDashAdapterDashIdbStrings.idb
import typings.pouchdbDashAdapterDashIdb.pouchdbDashAdapterDashIdbStrings.persistent
import typings.pouchdbDashAdapterDashIdb.pouchdbDashAdapterDashIdbStrings.temporary
import typings.pouchdbDashCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdbAdapterConfiguration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_IdbAdapterConfiguration: idb
  /**
    * Configures storage persistence.
    *
    * Only works in Firefox 26+.
    */
  var storage: js.UndefOr[persistent | temporary] = js.undefined
}

object IdbAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: idb,
    auto_compaction: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prefix: String = null,
    revs_limit: Int | Double = null,
    size: Int | Double = null,
    storage: persistent | temporary = null
  ): IdbAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter)
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdbAdapterConfiguration]
  }
}

