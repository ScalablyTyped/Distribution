package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the primary means of identifying a device.
  */
@js.native
trait ConnectionOptions extends js.Object {
  var token: String = js.native
  var uuid: String = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(token: String, uuid: String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
  
}

