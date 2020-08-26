package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongosOptions
  extends SSLOptions
     with HighAvailabilityOptions {
  /**
    * Default: 15; Cutoff latency point in MS for MongoS proxy selection
    */
  var acceptableLatencyMS: js.UndefOr[scala.Double] = js.native
  /**
    * Socket Options
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.native
}

object MongosOptions {
  @scala.inline
  def apply(): MongosOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongosOptions]
  }
  @scala.inline
  implicit class MongosOptionsOps[Self <: MongosOptions] (val x: Self) extends AnyVal {
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
    def setAcceptableLatencyMS(value: scala.Double): Self = this.set("acceptableLatencyMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptableLatencyMS: Self = this.set("acceptableLatencyMS", js.undefined)
    @scala.inline
    def setSocketOptions(value: SocketOptions): Self = this.set("socketOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketOptions: Self = this.set("socketOptions", js.undefined)
  }
  
}

