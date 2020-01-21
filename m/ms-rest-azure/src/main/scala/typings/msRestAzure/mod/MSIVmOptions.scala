package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSIVmOptions extends MSIOptions {
  /**
    * @prop {number} [port] - port on which the MSI service is running on the host VM. Default port is 50342
    */
  var port: js.UndefOr[Double] = js.undefined
}

object MSIVmOptions {
  @scala.inline
  def apply(port: Int | Double = null, resource: String = null): MSIVmOptions = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSIVmOptions]
  }
}

