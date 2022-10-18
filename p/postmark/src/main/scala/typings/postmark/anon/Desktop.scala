package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desktop extends StObject {
  
  var Date: String
  
  var Desktop: Double
  
  var Mobile: Double
  
  var Unknown: Double
}
object Desktop {
  
  inline def apply(Date: String, Desktop: Double, Mobile: Double, Unknown: Double): Desktop = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desktop]
  }
  
  extension [Self <: Desktop](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDesktop(value: Double): Self = StObject.set(x, "Desktop", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: Double): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: Double): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
  }
}
