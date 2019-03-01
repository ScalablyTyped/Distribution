package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  /**
    * The charset for the connection. This is called "collation" in the SQL-level of MySQL (like utf8_general_ci).
    * If a SQL-level charset is specified (like utf8mb4) then the default collation for that charset is used.
    * (Default: 'UTF8_GENERAL_CI')
    */
  var charset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the database to use for this connection
    */
  var database: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The password of that MySQL user
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of milliseconds
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The MySQL user to authenticate as
    */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    charset: java.lang.String = null,
    database: java.lang.String = null,
    password: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    user: java.lang.String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (database != null) __obj.updateDynamic("database")(database)
    if (password != null) __obj.updateDynamic("password")(password)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

