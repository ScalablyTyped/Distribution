package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  /**
    * The charset for the connection. This is called "collation" in the SQL-level of MySQL (like utf8_general_ci).
    * If a SQL-level charset is specified (like utf8mb4) then the default collation for that charset is used.
    * (Default: 'UTF8_GENERAL_CI')
    */
  var charset: js.UndefOr[String] = js.undefined
  /**
    * Name of the database to use for this connection
    */
  var database: js.UndefOr[String] = js.undefined
  /**
    * The password of that MySQL user
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Number of milliseconds
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * The MySQL user to authenticate as
    */
  var user: js.UndefOr[String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    charset: String = null,
    database: String = null,
    password: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    user: String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

