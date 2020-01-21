package typings.portfinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortFinderOptions extends js.Object {
  /**
    * Host to find available port on.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Minimum port (takes precedence over `basePort`).
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * search start port (equals to port when not provided)
    * This exists because getPort and getPortPromise mutates port state in
    * recursive calls and doesn't have a way to retrieve begininng port while
    * searching.
    */
  var startPort: js.UndefOr[Double] = js.undefined
  /**
    * Maximum port
    */
  var stopPort: js.UndefOr[Double] = js.undefined
}

object PortFinderOptions {
  @scala.inline
  def apply(
    host: String = null,
    port: Int | Double = null,
    startPort: Int | Double = null,
    stopPort: Int | Double = null
  ): PortFinderOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (startPort != null) __obj.updateDynamic("startPort")(startPort.asInstanceOf[js.Any])
    if (stopPort != null) __obj.updateDynamic("stopPort")(stopPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortFinderOptions]
  }
}

