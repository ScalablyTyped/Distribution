package typings.pouchdbAdapterWebsql.PouchDB.Core

import typings.pouchdbAdapterWebsql.pouchdbAdapterWebsqlStrings.`UTF-16`
import typings.pouchdbAdapterWebsql.pouchdbAdapterWebsqlStrings.`UTF-8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseInfo extends js.Object {
  var sqlite_plugin: js.UndefOr[Boolean] = js.undefined
  var websql_encoding: js.UndefOr[`UTF-8` | `UTF-16`] = js.undefined
}

object DatabaseInfo {
  @scala.inline
  def apply(sqlite_plugin: js.UndefOr[Boolean] = js.undefined, websql_encoding: `UTF-8` | `UTF-16` = null): DatabaseInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sqlite_plugin)) __obj.updateDynamic("sqlite_plugin")(sqlite_plugin.asInstanceOf[js.Any])
    if (websql_encoding != null) __obj.updateDynamic("websql_encoding")(websql_encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInfo]
  }
}

