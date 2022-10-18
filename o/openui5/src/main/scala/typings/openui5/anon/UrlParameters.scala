package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlParameters extends StObject {
  
  /**
    * Deprecated - use `groupId` instead
    */
  var batchGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the `ChangeSet` that this request should belong to
    */
  var changeSetId: js.UndefOr[String] = js.undefined
  
  /**
    * If specified the sPath has to be is relative to the path given with the context.
    */
  var context: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If specified, the `If-Match` header will be set to this ETag. Caution: This feature in not officially
    * supported as using asynchronous requests can lead to data inconsistencies. If you decide to use this
    * feature nevertheless, you have to make sure that the request is completed before the data is processed
    * any further.
    */
  var eTag: js.UndefOr[String] = js.undefined
  
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
    * A callback function which is called when the data has been successfully updated.
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A map containing the parameters that will be passed as query strings
    */
  var urlParameters: js.UndefOr[Record[String, String]] = js.undefined
}
object UrlParameters {
  
  inline def apply(): UrlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlParameters]
  }
  
  extension [Self <: UrlParameters](x: Self) {
    
    inline def setBatchGroupId(value: String): Self = StObject.set(x, "batchGroupId", value.asInstanceOf[js.Any])
    
    inline def setBatchGroupIdUndefined: Self = StObject.set(x, "batchGroupId", js.undefined)
    
    inline def setChangeSetId(value: String): Self = StObject.set(x, "changeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "changeSetId", js.undefined)
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
    
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
