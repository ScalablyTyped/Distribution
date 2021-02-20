package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorValue extends StObject {
  
  /** A message with more information about the error (in the spreadsheet's locale). */
  var message: js.UndefOr[String] = js.native
  
  /** The type of error. */
  var `type`: js.UndefOr[String] = js.native
}
object ErrorValue {
  
  @scala.inline
  def apply(): ErrorValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorValue]
  }
  
  @scala.inline
  implicit class ErrorValueMutableBuilder[Self <: ErrorValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
