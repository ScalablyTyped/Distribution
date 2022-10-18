package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGroupIdError extends StObject {
  
  /**
    * Deprecated - use `groupId` instead
    */
  var batchGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * A callback function which is called when the request failed. The handler can have the parameter: `oError`
    * which contains additional error information
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Defines the group that should be submitted. If not specified, all deferred groups will be submitted.
    * Requests belonging to the same group will be bundled in one batch request.
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * A callback function which is called when the data has been successfully updated. The handler can have
    * the following parameters: `oData`. `oData` contains the parsed response data as a Javascript object.
    * The batch response is in the `__batchResponses` property which may contain further `__changeResponses`
    * in an array depending on the amount of changes and change sets of the actual batch request which was
    * sent to the backend. The changeResponses contain the actual response of that change set in the `response`
    * property. For each change set there is also a `__changeResponse` property.
    */
  var success: js.UndefOr[js.Function] = js.undefined
}
object BatchGroupIdError {
  
  inline def apply(): BatchGroupIdError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGroupIdError]
  }
  
  extension [Self <: BatchGroupIdError](x: Self) {
    
    inline def setBatchGroupId(value: String): Self = StObject.set(x, "batchGroupId", value.asInstanceOf[js.Any])
    
    inline def setBatchGroupIdUndefined: Self = StObject.set(x, "batchGroupId", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
