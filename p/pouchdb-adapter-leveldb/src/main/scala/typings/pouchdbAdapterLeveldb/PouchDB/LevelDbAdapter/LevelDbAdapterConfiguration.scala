package typings.pouchdbAdapterLeveldb.PouchDB.LevelDbAdapter

import typings.pouchdbAdapterLeveldb.pouchdbAdapterLeveldbStrings.leveldb
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDbAdapterConfiguration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_LevelDbAdapterConfiguration: leveldb
}

object LevelDbAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: leveldb,
    auto_compaction: js.UndefOr[Boolean] = js.undefined,
    deterministic_revs: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prefix: String = null,
    revs_limit: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): LevelDbAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deterministic_revs)) __obj.updateDynamic("deterministic_revs")(deterministic_revs.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(revs_limit)) __obj.updateDynamic("revs_limit")(revs_limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDbAdapterConfiguration]
  }
}

