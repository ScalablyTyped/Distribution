package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorValue extends StObject {
  
  /** A message with more information about the error (in the spreadsheet's locale). */
  var message: js.UndefOr[String] = js.undefined
  
  /** The type of error. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ErrorValue {
  
  inline def apply(): ErrorValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorValue] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
