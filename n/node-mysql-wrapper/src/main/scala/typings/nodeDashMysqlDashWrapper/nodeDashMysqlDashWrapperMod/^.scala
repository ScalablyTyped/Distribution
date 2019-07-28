package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var EQUAL_TO_PROPERTY_SYMBOL: String = js.native
  var TABLE_RULES_PROPERTY: String = js.native
  def connect(mysqlUrlOrObjectOrMysqlAlreadyConnection: String, useTables: js.Any*): Database = js.native
  /** For meteor js only
    * Same as wrap but it's sync mode - autoconnect to the database without need to use database.ready(callback).
    */
  def connect(mysqlUrlOrObjectOrMysqlAlreadyConnection: typings.mysql.mysqlMod.Connection, useTables: js.Any*): Database = js.native
  def observable[T](obj: T): T with ObservableObject = js.native
  def wrap(mysqlUrlOrObjectOrMysqlAlreadyConnection: String, useTables: js.Any*): Database = js.native
  def wrap(mysqlUrlOrObjectOrMysqlAlreadyConnection: typings.mysql.mysqlMod.Connection, useTables: js.Any*): Database = js.native
}

