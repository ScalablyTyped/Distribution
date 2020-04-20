package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device_ extends js.Object {
  var available: Boolean
  var capture: Capture
  var cordova: String
  var model: String
  var name: String
  var platform: String
  var uuid: String
  var version: String
}

object Device_ {
  @scala.inline
  def apply(
    available: Boolean,
    capture: Capture,
    cordova: String,
    model: String,
    name: String,
    platform: String,
    uuid: String,
    version: String
  ): Device_ = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device_]
  }
}

