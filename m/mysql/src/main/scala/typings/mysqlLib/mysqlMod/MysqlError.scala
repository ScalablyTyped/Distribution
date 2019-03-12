package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MysqlError
  extends stdLib.Error {
  /**
    * Either a MySQL server error (e.g. 'ER_ACCESS_DENIED_ERROR'),
    * a node.js error (e.g. 'ECONNREFUSED') or an internal error
    * (e.g. 'PROTOCOL_CONNECTION_LOST').
    */
  var code: java.lang.String
  /**
    * The error number for the error code
    */
  var errno: scala.Double
  /**
    * Boolean, indicating if this error is terminal to the connection object.
    */
  var fatal: scala.Boolean
  /**
    * The field count
    */
  var fieldCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * SQL of failed query
    */
  var sql: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Error message from MySQL
    */
  var sqlMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The sql state
    */
  var sqlState: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The sql state marker
    */
  var sqlStateMarker: js.UndefOr[java.lang.String] = js.undefined
}

object MysqlError {
  @scala.inline
  def apply(
    code: java.lang.String,
    errno: scala.Double,
    fatal: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    fieldCount: scala.Int | scala.Double = null,
    sql: java.lang.String = null,
    sqlMessage: java.lang.String = null,
    sqlState: java.lang.String = null,
    sqlStateMarker: java.lang.String = null,
    stack: java.lang.String = null
  ): MysqlError = {
    val __obj = js.Dynamic.literal(code = code, errno = errno, fatal = fatal, message = message, name = name)
    if (fieldCount != null) __obj.updateDynamic("fieldCount")(fieldCount.asInstanceOf[js.Any])
    if (sql != null) __obj.updateDynamic("sql")(sql)
    if (sqlMessage != null) __obj.updateDynamic("sqlMessage")(sqlMessage)
    if (sqlState != null) __obj.updateDynamic("sqlState")(sqlState)
    if (sqlStateMarker != null) __obj.updateDynamic("sqlStateMarker")(sqlStateMarker)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MysqlError]
  }
}

