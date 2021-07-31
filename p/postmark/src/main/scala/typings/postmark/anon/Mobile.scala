package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mobile extends StObject {
  
  var Date: String
  
  var Desktop: Double
  
  var Mobile: Double
  
  var Unknown: Double
}
object Mobile {
  
  @scala.inline
  def apply(Date: String, Desktop: Double, Mobile: Double, Unknown: Double): Mobile = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mobile]
  }
  
  @scala.inline
  implicit class MobileMutableBuilder[Self <: Mobile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktop(value: Double): Self = StObject.set(x, "Desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Double): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: Double): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
  }
}
