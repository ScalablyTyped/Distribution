package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion REST Object Information
//#region API Properties Interfaces
/**
  * 'Properties' object passed into the WL.api method.
  */
trait IAPIProperties extends StObject {
  
  /**
    * A JSON object that specifies the REST API request body. The body
    * property is used only for "POST" and "PUT" requests.
    */
  var body: js.UndefOr[js.Any] = js.undefined
  
  /**
    * An HTTP method that specifies the action required for the API call.
    * These actions are standard REST API actions: "COPY", "GET", "MOVE",
    * "PUT", "POST", and "DELETE".
    * @default "GET"
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the path to the REST API object. For information on
    * specifying paths for REST objects, see REST reference.
    * http://msdn.microsoft.com/en-us/library/live/hh243648.aspx
    */
  var path: String
}
object IAPIProperties {
  
  inline def apply(path: String): IAPIProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPIProperties]
  }
  
  extension [Self <: IAPIProperties](x: Self) {
    
    inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
