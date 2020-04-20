package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var accelerometer: Accelerometer
  var camera: Camera
  var capture: Capture
  var compass: Compass
  var connection: Connection
  var contacts: Contacts
  var device: Device_
  var globalization: Globalization
  var notification: PhonegapNotification
  var splashscreen: Splashscreen
}

object Navigator {
  @scala.inline
  def apply(
    accelerometer: Accelerometer,
    camera: Camera,
    capture: Capture,
    compass: Compass,
    connection: Connection,
    contacts: Contacts,
    device: Device_,
    globalization: Globalization,
    notification: PhonegapNotification,
    splashscreen: Splashscreen
  ): Navigator = {
    val __obj = js.Dynamic.literal(accelerometer = accelerometer.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], compass = compass.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], contacts = contacts.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], globalization = globalization.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], splashscreen = splashscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
}

