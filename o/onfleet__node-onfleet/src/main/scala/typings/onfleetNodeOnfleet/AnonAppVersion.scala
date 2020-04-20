package typings.onfleetNodeOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppVersion extends js.Object {
  var appVersion: String
  var batteryLevel: Double
  var deviceDescription: String
  var platform: String
}

object AnonAppVersion {
  @scala.inline
  def apply(appVersion: String, batteryLevel: Double, deviceDescription: String, platform: String): AnonAppVersion = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], batteryLevel = batteryLevel.asInstanceOf[js.Any], deviceDescription = deviceDescription.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppVersion]
  }
}

