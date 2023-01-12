package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /** An Android device which must be used with an Android test. */
  var androidDevice: js.UndefOr[AndroidDevice] = js.undefined
  
  /** An iOS device which must be used with an iOS test. */
  var iosDevice: js.UndefOr[IosDevice] = js.undefined
}
object Environment {
  
  inline def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    inline def setAndroidDevice(value: AndroidDevice): Self = StObject.set(x, "androidDevice", value.asInstanceOf[js.Any])
    
    inline def setAndroidDeviceUndefined: Self = StObject.set(x, "androidDevice", js.undefined)
    
    inline def setIosDevice(value: IosDevice): Self = StObject.set(x, "iosDevice", value.asInstanceOf[js.Any])
    
    inline def setIosDeviceUndefined: Self = StObject.set(x, "iosDevice", js.undefined)
  }
}
