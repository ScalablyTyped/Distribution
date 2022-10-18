package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  /**
    * Error callback gets an objec as argument with the property "xmlDoc" containing the XML-Document that
    * was returned by the request and could not be correctly parsed.
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * If this option is set to true, events are fired as if the annotations were loaded from a URL
    */
  var fireEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Success callback gets an objec as argument with the properties "annotations" containing the parsed annotations
    * and "xmlDoc" containing the XML-Document that was returned by the request.
    */
  var success: js.UndefOr[js.Function] = js.undefined
}
object Error {
  
  inline def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFireEvents(value: Boolean): Self = StObject.set(x, "fireEvents", value.asInstanceOf[js.Any])
    
    inline def setFireEventsUndefined: Self = StObject.set(x, "fireEvents", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
