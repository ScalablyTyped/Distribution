package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorDetails extends StObject {
  
  val field: String = js.native
  
  val issue: String = js.native
}
object ErrorDetails {
  
  @scala.inline
  def apply(field: String, issue: String): ErrorDetails = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
  
  @scala.inline
  implicit class ErrorDetailsMutableBuilder[Self <: ErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
  }
}
