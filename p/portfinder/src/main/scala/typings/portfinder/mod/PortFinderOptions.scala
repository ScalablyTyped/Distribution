package typings.portfinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortFinderOptions extends js.Object {
  /**
    * Host to find available port on.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Minimum port (takes precedence over `basePort`).
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * search start port (equals to port when not provided)
    * This exists because getPort and getPortPromise mutates port state in
    * recursive calls and doesn't have a way to retrieve begininng port while
    * searching.
    */
  var startPort: js.UndefOr[Double] = js.native
  /**
    * Maximum port
    */
  var stopPort: js.UndefOr[Double] = js.native
}

object PortFinderOptions {
  @scala.inline
  def apply(): PortFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortFinderOptions]
  }
  @scala.inline
  implicit class PortFinderOptionsOps[Self <: PortFinderOptions] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setStartPort(value: Double): Self = this.set("startPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPort: Self = this.set("startPort", js.undefined)
    @scala.inline
    def setStopPort(value: Double): Self = this.set("stopPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopPort: Self = this.set("stopPort", js.undefined)
  }
  
}

