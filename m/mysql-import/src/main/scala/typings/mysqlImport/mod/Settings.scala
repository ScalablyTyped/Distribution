package typings.mysqlImport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * The database to connect to.
    */
  var database: String = js.native
  /**
    * The MySQL host to connect to.
    */
  var host: String = js.native
  /**
    * Function to handle errors. The function will receive the Error. If not provided the error will be thrown.
    */
  var onerror: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
  /**
    * The password for the user.
    */
  var password: String = js.native
  /**
    * The MySQL port to connect to.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * The MySQL user to connect with.
    */
  var user: String = js.native
}

object Settings {
  @scala.inline
  def apply(database: String, host: String, password: String, user: String): Settings = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnerror(value: /* error */ js.Any => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

