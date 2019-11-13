package typings.pouchdbDashAdapterDashWebsql.PouchDB.AdapterWebSql

import typings.pouchdbDashAdapterDashWebsql.pouchdbDashAdapterDashWebsqlStrings.websql
import typings.pouchdbDashCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_Configuration: websql
}

object Configuration {
  @scala.inline
  def apply(
    adapter: websql,
    auto_compaction: js.UndefOr[Boolean] = js.undefined,
    deterministic_revs: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prefix: String = null,
    revs_limit: Int | Double = null,
    size: Int | Double = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(adapter = adapter)
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction)
    if (!js.isUndefined(deterministic_revs)) __obj.updateDynamic("deterministic_revs")(deterministic_revs)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

