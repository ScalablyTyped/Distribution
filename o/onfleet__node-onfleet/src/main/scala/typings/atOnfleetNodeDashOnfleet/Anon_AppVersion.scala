package typings.atOnfleetNodeDashOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppVersion extends js.Object {
  var appVersion: String
  var batteryLevel: Double
  var deviceDescription: String
  var platform: String
}

object Anon_AppVersion {
  @scala.inline
  def apply(appVersion: String, batteryLevel: Double, deviceDescription: String, platform: String): Anon_AppVersion = {
    val __obj = js.Dynamic.literal(appVersion = appVersion, batteryLevel = batteryLevel, deviceDescription = deviceDescription, platform = platform)
  
    __obj.asInstanceOf[Anon_AppVersion]
  }
}

