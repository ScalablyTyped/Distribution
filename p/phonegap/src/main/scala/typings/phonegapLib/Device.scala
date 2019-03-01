package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var available: scala.Boolean
  var capture: Capture
  var cordova: java.lang.String
  var model: java.lang.String
  var name: java.lang.String
  var platform: java.lang.String
  var uuid: java.lang.String
  var version: java.lang.String
}

object Device {
  @scala.inline
  def apply(
    available: scala.Boolean,
    capture: Capture,
    cordova: java.lang.String,
    model: java.lang.String,
    name: java.lang.String,
    platform: java.lang.String,
    uuid: java.lang.String,
    version: java.lang.String
  ): Device = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("capture")(capture)
    __obj.updateDynamic("cordova")(cordova)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("platform")(platform)
    __obj.updateDynamic("uuid")(uuid)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Device]
  }
}

