package typings
package nodemailerDashDirectDashTransportLib.nodemailerDashDirectDashTransportMod.directTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectOptions extends js.Object {
  /**
    * if true, the connection emits all traffic between client and server as 'log' events
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional hostname of the client, used for identifying to the server
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object DirectOptions {
  @scala.inline
  def apply(debug: js.UndefOr[scala.Boolean] = js.undefined, name: java.lang.String = null): DirectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DirectOptions]
  }
}

