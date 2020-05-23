package typings.mysqlImport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * The database to connect to.
    */
  var database: String
  /**
    * The MySQL host to connect to.
    */
  var host: String
  /**
    * Function to handle errors. The function will receive the Error. If not provided the error will be thrown.
    */
  var onerror: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.undefined
  /**
    * The password for the user.
    */
  var password: String
  /**
    * The MySQL port to connect to.
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * The MySQL user to connect with.
    */
  var user: String
}

object Settings {
  @scala.inline
  def apply(
    database: String,
    host: String,
    password: String,
    user: String,
    onerror: /* error */ js.Any => Unit = null,
    port: js.UndefOr[Double] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

