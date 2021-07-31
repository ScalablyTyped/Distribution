package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpamComplaint extends StObject {
  
  var Date: String
  
  var SpamComplaint: Double
}
object SpamComplaint {
  
  @scala.inline
  def apply(Date: String, SpamComplaint: Double): SpamComplaint = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpamComplaint]
  }
  
  @scala.inline
  implicit class SpamComplaintMutableBuilder[Self <: SpamComplaint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpamComplaint(value: Double): Self = StObject.set(x, "SpamComplaint", value.asInstanceOf[js.Any])
  }
}
