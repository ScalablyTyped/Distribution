package typings.nodeSsdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDescriptionLocation extends js.Object {
  /**
    * Location path.
    */
  var path: String
  /**
    * Location port.
    */
  var port: Double
  /**
    * Location protocol.
    * @default 'http://'
    */
  var protocol: js.UndefOr[String] = js.undefined
}

object ServiceDescriptionLocation {
  @scala.inline
  def apply(path: String, port: Double, protocol: String = null): ServiceDescriptionLocation = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDescriptionLocation]
  }
}

