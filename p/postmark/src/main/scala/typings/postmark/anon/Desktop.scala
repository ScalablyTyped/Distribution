package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Desktop extends StObject {
  
  var Date: String = js.native
  
  var Desktop: js.UndefOr[Double] = js.native
  
  var Mobile: js.UndefOr[Double] = js.native
  
  var Unknown: js.UndefOr[Double] = js.native
  
  var WebMail: js.UndefOr[Double] = js.native
}
object Desktop {
  
  @scala.inline
  def apply(Date: String): Desktop = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desktop]
  }
  
  @scala.inline
  implicit class DesktopMutableBuilder[Self <: Desktop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktop(value: Double): Self = StObject.set(x, "Desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopUndefined: Self = StObject.set(x, "Desktop", js.undefined)
    
    @scala.inline
    def setMobile(value: Double): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "Mobile", js.undefined)
    
    @scala.inline
    def setUnknown(value: Double): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownUndefined: Self = StObject.set(x, "Unknown", js.undefined)
    
    @scala.inline
    def setWebMail(value: Double): Self = StObject.set(x, "WebMail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebMailUndefined: Self = StObject.set(x, "WebMail", js.undefined)
  }
}
