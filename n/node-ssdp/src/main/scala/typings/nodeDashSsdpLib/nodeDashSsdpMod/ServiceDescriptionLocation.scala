package typings
package nodeDashSsdpLib.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDescriptionLocation extends js.Object {
  /**
  	 * Location path.
  	 */
  var path: java.lang.String
  /**
  	 * Location port.
  	 */
  var port: scala.Double
  /**
  	 * Location protocol.
  	 * @default 'http://'
  	 */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceDescriptionLocation {
  @scala.inline
  def apply(path: java.lang.String, port: scala.Double, protocol: java.lang.String = null): ServiceDescriptionLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[ServiceDescriptionLocation]
  }
}

