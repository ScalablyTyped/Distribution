package typings
package pouchdbDashAdapterDashWebsqlLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseInfo extends js.Object {
  var sqlite_plugin: js.UndefOr[scala.Boolean] = js.undefined
  var websql_encoding: js.UndefOr[
    pouchdbDashAdapterDashWebsqlLib.pouchdbDashAdapterDashWebsqlLibStrings.`UTF-8` | pouchdbDashAdapterDashWebsqlLib.pouchdbDashAdapterDashWebsqlLibStrings.`UTF-16`
  ] = js.undefined
}

object DatabaseInfo {
  @scala.inline
  def apply(
    sqlite_plugin: js.UndefOr[scala.Boolean] = js.undefined,
    websql_encoding: pouchdbDashAdapterDashWebsqlLib.pouchdbDashAdapterDashWebsqlLibStrings.`UTF-8` | pouchdbDashAdapterDashWebsqlLib.pouchdbDashAdapterDashWebsqlLibStrings.`UTF-16` = null
  ): DatabaseInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sqlite_plugin)) __obj.updateDynamic("sqlite_plugin")(sqlite_plugin)
    if (websql_encoding != null) __obj.updateDynamic("websql_encoding")(websql_encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInfo]
  }
}

