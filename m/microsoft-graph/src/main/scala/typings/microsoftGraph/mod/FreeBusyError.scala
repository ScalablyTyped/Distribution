package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeBusyError extends StObject {
  
  // Describes the error.
  var message: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The response code from querying for the availability of the user, distribution list, or resource.
  var responseCode: js.UndefOr[NullableOption[String]] = js.undefined
}
object FreeBusyError {
  
  @scala.inline
  def apply(): FreeBusyError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyError]
  }
  
  @scala.inline
  implicit class FreeBusyErrorMutableBuilder[Self <: FreeBusyError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setResponseCode(value: NullableOption[String]): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCodeNull: Self = StObject.set(x, "responseCode", null)
    
    @scala.inline
    def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
  }
}
