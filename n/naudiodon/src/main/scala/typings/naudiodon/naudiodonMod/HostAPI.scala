package typings.naudiodon.naudiodonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostAPI extends js.Object {
  var defaultInput: Double
  var defaultOutput: Double
  var deviceCount: Double
  var id: Double
  var name: String
  var `type`: String
}

object HostAPI {
  @scala.inline
  def apply(
    defaultInput: Double,
    defaultOutput: Double,
    deviceCount: Double,
    id: Double,
    name: String,
    `type`: String
  ): HostAPI = {
    val __obj = js.Dynamic.literal(defaultInput = defaultInput.asInstanceOf[js.Any], defaultOutput = defaultOutput.asInstanceOf[js.Any], deviceCount = deviceCount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostAPI]
  }
}

