package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mobile extends StObject {
  
  var Date: String
  
  var Desktop: js.UndefOr[Double] = js.undefined
  
  var Mobile: js.UndefOr[Double] = js.undefined
  
  var Unknown: js.UndefOr[Double] = js.undefined
  
  var WebMail: js.UndefOr[Double] = js.undefined
}
object Mobile {
  
  inline def apply(Date: String): Mobile = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mobile]
  }
  
  extension [Self <: Mobile](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDesktop(value: Double): Self = StObject.set(x, "Desktop", value.asInstanceOf[js.Any])
    
    inline def setDesktopUndefined: Self = StObject.set(x, "Desktop", js.undefined)
    
    inline def setMobile(value: Double): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "Mobile", js.undefined)
    
    inline def setUnknown(value: Double): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "Unknown", js.undefined)
    
    inline def setWebMail(value: Double): Self = StObject.set(x, "WebMail", value.asInstanceOf[js.Any])
    
    inline def setWebMailUndefined: Self = StObject.set(x, "WebMail", js.undefined)
  }
}
