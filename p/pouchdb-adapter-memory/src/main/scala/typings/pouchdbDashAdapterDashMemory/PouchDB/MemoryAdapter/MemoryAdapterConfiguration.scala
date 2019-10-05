package typings.pouchdbDashAdapterDashMemory.PouchDB.MemoryAdapter

import typings.pouchdbDashAdapterDashMemory.pouchdbDashAdapterDashMemoryStrings.memory
import typings.pouchdbDashCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryAdapterConfiguration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_MemoryAdapterConfiguration: memory
}

object MemoryAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: memory,
    auto_compaction: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prefix: String = null,
    revs_limit: Int | Double = null,
    size: Int | Double = null
  ): MemoryAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter)
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryAdapterConfiguration]
  }
}

