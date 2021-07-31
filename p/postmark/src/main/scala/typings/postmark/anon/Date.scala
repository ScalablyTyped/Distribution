package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var Date: String
  
  var Sent: Double
}
object Date {
  
  @scala.inline
  def apply(Date: String, Sent: Double): Date = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSent(value: Double): Self = StObject.set(x, "Sent", value.asInstanceOf[js.Any])
  }
}
