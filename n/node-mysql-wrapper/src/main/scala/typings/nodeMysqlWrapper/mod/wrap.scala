package typings.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "wrap")
@js.native
object wrap extends js.Object {
  
  def apply(mysqlUrlOrObjectOrMysqlAlreadyConnection: String, useTables: js.Any*): Database = js.native
  def apply(mysqlUrlOrObjectOrMysqlAlreadyConnection: typings.mysql.mod.Connection, useTables: js.Any*): Database = js.native
}
