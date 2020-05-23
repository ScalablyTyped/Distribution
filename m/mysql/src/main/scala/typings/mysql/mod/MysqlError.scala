package typings.mysql.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MysqlError extends Error {
  /**
    * Either a MySQL server error (e.g. 'ER_ACCESS_DENIED_ERROR'),
    * a node.js error (e.g. 'ECONNREFUSED') or an internal error
    * (e.g. 'PROTOCOL_CONNECTION_LOST').
    */
  var code: String
  /**
    * The error number for the error code
    */
  var errno: Double
  /**
    * Boolean, indicating if this error is terminal to the connection object.
    */
  var fatal: Boolean
  /**
    * The field count
    */
  var fieldCount: js.UndefOr[Double] = js.undefined
  /**
    * SQL of failed query
    */
  var sql: js.UndefOr[String] = js.undefined
  /**
    * Error message from MySQL
    */
  var sqlMessage: js.UndefOr[String] = js.undefined
  /**
    * The sql state
    */
  var sqlState: js.UndefOr[String] = js.undefined
  /**
    * The sql state marker
    */
  var sqlStateMarker: js.UndefOr[String] = js.undefined
}

object MysqlError {
  @scala.inline
  def apply(
    code: String,
    errno: Double,
    fatal: Boolean,
    message: String,
    name: String,
    fieldCount: js.UndefOr[Double] = js.undefined,
    sql: String = null,
    sqlMessage: String = null,
    sqlState: String = null,
    sqlStateMarker: String = null,
    stack: String = null
  ): MysqlError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldCount)) __obj.updateDynamic("fieldCount")(fieldCount.get.asInstanceOf[js.Any])
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    if (sqlMessage != null) __obj.updateDynamic("sqlMessage")(sqlMessage.asInstanceOf[js.Any])
    if (sqlState != null) __obj.updateDynamic("sqlState")(sqlState.asInstanceOf[js.Any])
    if (sqlStateMarker != null) __obj.updateDynamic("sqlStateMarker")(sqlStateMarker.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MysqlError]
  }
}

