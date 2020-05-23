package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppVersion extends js.Object {
  var appVersion: String
  var batteryLevel: Double
  var deviceDescription: String
  var platform: String
}

object AppVersion {
  @scala.inline
  def apply(appVersion: String, batteryLevel: Double, deviceDescription: String, platform: String): AppVersion = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], batteryLevel = batteryLevel.asInstanceOf[js.Any], deviceDescription = deviceDescription.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppVersion]
  }
}

