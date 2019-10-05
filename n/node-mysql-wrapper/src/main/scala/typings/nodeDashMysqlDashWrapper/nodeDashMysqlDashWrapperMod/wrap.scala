package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "wrap")
@js.native
object wrap extends js.Object {
  def apply(mysqlUrlOrObjectOrMysqlAlreadyConnection: String, useTables: js.Any*): Database = js.native
  def apply(mysqlUrlOrObjectOrMysqlAlreadyConnection: typings.mysql.mysqlMod.Connection, useTables: js.Any*): Database = js.native
}

