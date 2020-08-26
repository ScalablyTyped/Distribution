package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplSetOptions
  extends SSLOptions
     with HighAvailabilityOptions {
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.native
  /**
    * The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.native
  /**
    * The name of the replicaset to connect to.
    */
  var replicaSet: js.UndefOr[String] = js.native
  /**
    * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
    */
  var secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.native
  var socketOptions: js.UndefOr[SocketOptions] = js.native
}

object ReplSetOptions {
  @scala.inline
  def apply(): ReplSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplSetOptions]
  }
  @scala.inline
  implicit class ReplSetOptionsOps[Self <: ReplSetOptions] (val x: Self) extends AnyVal {
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
    def setConnectWithNoPrimary(value: Boolean): Self = this.set("connectWithNoPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectWithNoPrimary: Self = this.set("connectWithNoPrimary", js.undefined)
    @scala.inline
    def setMaxStalenessSeconds(value: scala.Double): Self = this.set("maxStalenessSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxStalenessSeconds: Self = this.set("maxStalenessSeconds", js.undefined)
    @scala.inline
    def setReplicaSet(value: String): Self = this.set("replicaSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaSet: Self = this.set("replicaSet", js.undefined)
    @scala.inline
    def setSecondaryAcceptableLatencyMS(value: scala.Double): Self = this.set("secondaryAcceptableLatencyMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryAcceptableLatencyMS: Self = this.set("secondaryAcceptableLatencyMS", js.undefined)
    @scala.inline
    def setSocketOptions(value: SocketOptions): Self = this.set("socketOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketOptions: Self = this.set("socketOptions", js.undefined)
  }
  
}

