package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BounceID extends StObject {
  
  var BounceID: Double
  
  var Summary: String
}
object BounceID {
  
  @scala.inline
  def apply(BounceID: Double, Summary: String): BounceID = {
    val __obj = js.Dynamic.literal(BounceID = BounceID.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceID]
  }
  
  @scala.inline
  implicit class BounceIDMutableBuilder[Self <: BounceID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounceID(value: Double): Self = StObject.set(x, "BounceID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
