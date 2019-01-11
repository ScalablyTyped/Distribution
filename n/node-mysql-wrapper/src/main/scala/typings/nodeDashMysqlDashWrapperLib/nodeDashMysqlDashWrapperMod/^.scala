package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var EQUAL_TO_PROPERTY_SYMBOL: java.lang.String = js.native
  var TABLE_RULES_PROPERTY: java.lang.String = js.native
  def connect(mysqlUrlOrObjectOrMysqlAlreadyConnection: java.lang.String, useTables: js.Any*): nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.Database = js.native
  /** For meteor js only
    * Same as wrap but it's sync mode - autoconnect to the database without need to use database.ready(callback).
    */
  def connect(mysqlUrlOrObjectOrMysqlAlreadyConnection: mysqlLib.mysqlMod.Connection, useTables: js.Any*): nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.Database = js.native
  def observable[T](obj: T): T with nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.ObservableObject = js.native
  def wrap(mysqlUrlOrObjectOrMysqlAlreadyConnection: java.lang.String, useTables: js.Any*): nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.Database = js.native
  def wrap(mysqlUrlOrObjectOrMysqlAlreadyConnection: mysqlLib.mysqlMod.Connection, useTables: js.Any*): nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.Database = js.native
}

