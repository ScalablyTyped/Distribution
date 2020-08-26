package typings.memjs.mod

import typings.memjs.anon.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  /**
    * The default expiration in seconds to use. A `0` means never expire,
    * if it is greater than 30 days (60 x 60 x 24 x 30), it is
    * treated as a UNIX time (number of seconds since January 1, 1970).
    * @default 0
    */
  var expires: js.UndefOr[Double] = js.native
  /**
    * How many seconds to wait until retrying a failed server.
    * @default 60
    */
  var failoverTime: js.UndefOr[Double] = js.native
  /**
    * A logger object that responds to `log(string)` method calls.
    * @default console
    */
  var logger: js.UndefOr[Log] = js.native
  /**
    * The number of times to retry an operation in lieu of failures.
    * @default 2
    */
  var retries: js.UndefOr[Double] = js.native
  /**
    * @default 0.2
    */
  var retry_delay: js.UndefOr[Double] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
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
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setFailoverTime(value: Double): Self = this.set("failoverTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailoverTime: Self = this.set("failoverTime", js.undefined)
    @scala.inline
    def setLogger(value: Log): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setRetry_delay(value: Double): Self = this.set("retry_delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry_delay: Self = this.set("retry_delay", js.undefined)
  }
  
}

