package typings.phonegap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var available: Boolean
  var capture: Capture
  var cordova: String
  var model: String
  var name: String
  var platform: String
  var uuid: String
  var version: String
}

object Device {
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
  ): Device = {
    val __obj = js.Dynamic.literal(available = available, capture = capture, cordova = cordova, model = model, name = name, platform = platform, uuid = uuid, version = version)
  
    __obj.asInstanceOf[Device]
  }
}

@JSGlobal("device")
@js.native
object device extends TopLevel[Device]

