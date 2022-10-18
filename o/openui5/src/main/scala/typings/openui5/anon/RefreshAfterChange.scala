package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshAfterChange extends StObject {
  
  /**
    * Deprecated - use `groupId` instead
    */
  var batchGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the `ChangeSet` that this request should belong to
    */
  var changeSetId: js.UndefOr[String] = js.undefined
  
  /**
    * If specified , `sPath` has to be relative to the path given with the context.
    */
  var context: js.UndefOr[js.Object] = js.undefined
  
  /**
    * A callback function which is called when the request failed. The handler can have the parameter `oError`
    * which contains additional error information.
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * ID of a request group; requests belonging to the same group will be bundled in one batch request
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * A map of headers for this request
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Since 1.46; defines whether to update all bindings after submitting this change operation. See {@link
    * #setRefreshAfterChange} If given, this overrules the model-wide `refreshAfterChange` flag for this operation
    * only.
    */
  var refreshAfterChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A callback function which is called when the data has been successfully retrieved. The handler can have
    * the following parameters: `oData` and `response`. The `oData` parameter contains the data of the newly
    * created entry if it is provided by the backend. The `response` parameter contains information about the
    * response of the request.
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A map containing the parameters that will be passed as query strings
    */
  var urlParameters: js.UndefOr[Record[String, String]] = js.undefined
}
object RefreshAfterChange {
  
  inline def apply(): RefreshAfterChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshAfterChange]
  }
  
  extension [Self <: RefreshAfterChange](x: Self) {
    
    inline def setBatchGroupId(value: String): Self = StObject.set(x, "batchGroupId", value.asInstanceOf[js.Any])
    
    inline def setBatchGroupIdUndefined: Self = StObject.set(x, "batchGroupId", js.undefined)
    
    inline def setChangeSetId(value: String): Self = StObject.set(x, "changeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "changeSetId", js.undefined)
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setRefreshAfterChange(value: Boolean): Self = StObject.set(x, "refreshAfterChange", value.asInstanceOf[js.Any])
    
    inline def setRefreshAfterChangeUndefined: Self = StObject.set(x, "refreshAfterChange", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrlParameters(value: Record[String, String]): Self = StObject.set(x, "urlParameters", value.asInstanceOf[js.Any])
    
    inline def setUrlParametersUndefined: Self = StObject.set(x, "urlParameters", js.undefined)
  }
}
