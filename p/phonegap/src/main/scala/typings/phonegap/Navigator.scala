package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends js.Object {
  
  var accelerometer: Accelerometer = js.native
  
  var camera: Camera = js.native
  
  var capture: Capture = js.native
  
  var compass: Compass = js.native
  
  var connection: Connection = js.native
  
  var contacts: Contacts = js.native
  
  var device: Device = js.native
  
  var globalization: Globalization = js.native
  
  var notification: PhonegapNotification = js.native
  
  var splashscreen: Splashscreen = js.native
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
    val __obj = js.Dynamic.literal(accelerometer = accelerometer.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], compass = compass.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], contacts = contacts.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], globalization = globalization.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], splashscreen = splashscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccelerometer(value: Accelerometer): Self = this.set("accelerometer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Camera): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture(value: Capture): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompass(value: Compass): Self = this.set("compass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContacts(value: Contacts): Self = this.set("contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: Device): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalization(value: Globalization): Self = this.set("globalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: PhonegapNotification): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashscreen(value: Splashscreen): Self = this.set("splashscreen", value.asInstanceOf[js.Any])
  }
}
