package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var accelerometer: Accelerometer
  
  var camera: Camera
  
  var capture: Capture
  
  var compass: Compass
  
  val connection: Connection
  
  var contacts: Contacts
  
  var device: Device
  
  var globalization: Globalization
  
  var notification: PhonegapNotification
  
  var splashscreen: Splashscreen
}
object Navigator {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    inline def setAccelerometer(value: Accelerometer): Self = StObject.set(x, "accelerometer", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCapture(value: Capture): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCompass(value: Compass): Self = StObject.set(x, "compass", value.asInstanceOf[js.Any])
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setContacts(value: Contacts): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setGlobalization(value: Globalization): Self = StObject.set(x, "globalization", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: PhonegapNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setSplashscreen(value: Splashscreen): Self = StObject.set(x, "splashscreen", value.asInstanceOf[js.Any])
  }
}
