package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
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
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerometer(value: Accelerometer): Self = StObject.set(x, "accelerometer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture(value: Capture): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompass(value: Compass): Self = StObject.set(x, "compass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContacts(value: Contacts): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalization(value: Globalization): Self = StObject.set(x, "globalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: PhonegapNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashscreen(value: Splashscreen): Self = StObject.set(x, "splashscreen", value.asInstanceOf[js.Any])
  }
}
