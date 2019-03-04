package typings
package phonegapLib

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
  var device: Device
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
    device: Device,
    globalization: Globalization,
    notification: PhonegapNotification,
    splashscreen: Splashscreen
  ): Navigator = {
    val __obj = js.Dynamic.literal(accelerometer = accelerometer, camera = camera, capture = capture, compass = compass, connection = connection, contacts = contacts, device = device, globalization = globalization, notification = notification, splashscreen = splashscreen)
  
    __obj.asInstanceOf[Navigator]
  }
}

