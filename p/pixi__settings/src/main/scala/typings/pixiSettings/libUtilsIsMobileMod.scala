package typings.pixiSettings

import typings.pixiSettings.anon.Blackberry
import typings.pixiSettings.anon.Device
import typings.pixiSettings.anon.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsIsMobileMod {
  
  @JSImport("@pixi/settings/lib/utils/isMobile", "isMobile")
  @js.native
  val isMobile: isMobileResult = js.native
  
  trait isMobileResult extends StObject {
    
    var amazon: Phone
    
    var android: Phone
    
    var any: Boolean
    
    var apple: Device
    
    var other: Blackberry
    
    var phone: Boolean
    
    var tablet: Boolean
    
    var windows: Phone
  }
  object isMobileResult {
    
    inline def apply(
      amazon: Phone,
      android: Phone,
      any: Boolean,
      apple: Device,
      other: Blackberry,
      phone: Boolean,
      tablet: Boolean,
      windows: Phone
    ): isMobileResult = {
      val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
      __obj.asInstanceOf[isMobileResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: isMobileResult] (val x: Self) extends AnyVal {
      
      inline def setAmazon(value: Phone): Self = StObject.set(x, "amazon", value.asInstanceOf[js.Any])
      
      inline def setAndroid(value: Phone): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAny(value: Boolean): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      inline def setApple(value: Device): Self = StObject.set(x, "apple", value.asInstanceOf[js.Any])
      
      inline def setOther(value: Blackberry): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setWindows(value: Phone): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    }
  }
}
