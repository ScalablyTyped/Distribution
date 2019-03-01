package typings
package pouchdbDashAdapterDashIdbLib.PouchDBNs.IdbAdapterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdbAdapterConfiguration
  extends pouchdbDashCoreLib.PouchDBNs.ConfigurationNs.LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_IdbAdapterConfiguration: pouchdbDashAdapterDashIdbLib.pouchdbDashAdapterDashIdbLibStrings.idb
  /**
    * Configures storage persistence.
    *
    * Only works in Firefox 26+.
    */
  var storage: js.UndefOr[
    pouchdbDashAdapterDashIdbLib.pouchdbDashAdapterDashIdbLibStrings.persistent | pouchdbDashAdapterDashIdbLib.pouchdbDashAdapterDashIdbLibStrings.temporary
  ] = js.undefined
}

object IdbAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: pouchdbDashAdapterDashIdbLib.pouchdbDashAdapterDashIdbLibStrings.idb,
    auto_compaction: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    prefix: java.lang.String = null,
    revs_limit: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    storage: pouchdbDashAdapterDashIdbLib.pouchdbDashAdapterDashIdbLibStrings.persistent | pouchdbDashAdapterDashIdbLib.pouchdbDashAdapterDashIdbLibStrings.temporary = null
  ): IdbAdapterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adapter")(adapter)
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdbAdapterConfiguration]
  }
}

