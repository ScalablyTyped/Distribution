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
    val __obj = js.Dynamic.literal(available = available, capture = capture, cordova = cordova, model = model, name = name, platform = platform, uuid = uuid, version = version)
  
    __obj.asInstanceOf[Device]
  }
}

