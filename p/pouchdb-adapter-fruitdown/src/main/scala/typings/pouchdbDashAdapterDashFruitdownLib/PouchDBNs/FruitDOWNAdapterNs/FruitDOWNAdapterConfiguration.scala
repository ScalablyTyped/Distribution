package typings
package pouchdbDashAdapterDashFruitdownLib.PouchDBNs.FruitDOWNAdapterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FruitDOWNAdapterConfiguration
  extends pouchdbDashCoreLib.PouchDBNs.ConfigurationNs.LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_FruitDOWNAdapterConfiguration: pouchdbDashAdapterDashFruitdownLib.pouchdbDashAdapterDashFruitdownLibStrings.fruitdown
}

object FruitDOWNAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: pouchdbDashAdapterDashFruitdownLib.pouchdbDashAdapterDashFruitdownLibStrings.fruitdown,
    auto_compaction: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    prefix: java.lang.String = null,
    revs_limit: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null
  ): FruitDOWNAdapterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adapter")(adapter)
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FruitDOWNAdapterConfiguration]
  }
}

