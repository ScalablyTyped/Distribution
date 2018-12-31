package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MysqlError
  extends nodeLib.Error {
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

