package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustDeepPath extends StObject {
  
  /**
    * Defines a callback function to adjust the deep path for the resulting entity of the function import call;
    * since 1.82. The deep path of an entity is the resolved path relative to the parent contexts of the binding
    * in the UI hierarchy. For example, for a `ToBusinessPartner` relative context binding with a `/SalesOrder('42')`
    * parent context, the resulting deep path for the `BusinessPartner` is `/SalesOrder('42')/ToBusinessPartner`.
    * This deep path is used to properly assign messages and show them correctly on the UI.
    *
    * The callback function returns a `string` with the deep path for the entity returned by the function import
    * and gets the parameter map `mParameters` containing the following properties:
    * 	 - `{string} mParameters.deepPath`: The deep path of the resulting entity, as far as the framework is
    * 			able to determine from the metadata and the OData response
    * 	 - `{object} mParameters.response`: A copy of the OData response object
    */
  var adjustDeepPath: js.UndefOr[js.Function] = js.undefined
  
  /**
    * **Deprecated - use `groupId` instead**
    */
  var batchGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the `ChangeSet` that this request belongs to
    */
  var changeSetId: js.UndefOr[String] = js.undefined
  
  /**
    * If the function import changes an entity, the ETag for this entity can be passed with this parameter
    */
  var eTag: js.UndefOr[String] = js.undefined
  
  /**
    * A callback function which is called when the request failed. The handler can have the parameter: `oError`
    * which contains additional error information.
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A comma-separated list of navigation properties to be expanded for the entity returned by the function
    * import; since 1.83.0. The navigation properties are requested with an additional GET request in
    * the same `$batch` request as the POST request for the function import. The given `mParameters.headers`
    * are not considered in the GET request. **Note:** The following prerequisites must be fulfilled:
    *
    * 	 - batch mode must be enabled; see constructor parameter `useBatch`,
    * 	 - the HTTP method used for the function import is "POST",
    * 	 - the function import returns a single entity,
    * 	 - the back-end service must support the "Content-ID" header,
    * 	 - the back end must allow GET requests relative to this content ID outside the changeset within the
    * 			`$batch` request.  The success and error callback functions are called only once, even if there
    * 			are two requests in the `$batch` related to a single call of {@link #callFunction}.
    * 	 - If both requests succeed, the success callback is called with the merged data of the POST and the
    * 			GET request and with the response of the POST request.
    * 	 - If the POST request fails, the GET request also fails. In that case the error callback is called
    * 			with the error response of the POST request.
    * 	 - If the POST request succeeds but the GET request for the navigation properties fails, the success
    * 			callback is called with the data and the response of the POST request. The response object of the success
    * 			callback call and the response parameter of the corresponding `requestFailed` and `requestCompleted`
    * 			events have an additional property `expandAfterFunctionCallFailed` set to `true`.
    */
  var expand: js.UndefOr[String] = js.undefined
  
  /**
    * ID of a request group; requests belonging to the same group are bundled in one batch request
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * A map of headers for this request
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * The HTTP method used for the function import call as specified in the metadata definition of the function
    * import
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * Defines whether to update all bindings after submitting this change operation; since 1.46. See {@link
    * #setRefreshAfterChange}. If given, this overrules the model-wide `refreshAfterChange` flag for this operation
    * only.
    */
  var refreshAfterChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A callback function which is called when the data has been successfully retrieved; the handler can have
    * the following parameters: `oData` and `response`.
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Maps the function import parameter name as specified in the function import's metadata to its value;
    * the value is formatted based on the parameter's type as specified in the metadata
    */
  var urlParameters: js.UndefOr[Record[String, Any]] = js.undefined
}
object AdjustDeepPath {
  
  inline def apply(): AdjustDeepPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustDeepPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdjustDeepPath] (val x: Self) extends AnyVal {
    
    inline def setAdjustDeepPath(value: js.Function): Self = StObject.set(x, "adjustDeepPath", value.asInstanceOf[js.Any])
    
    inline def setAdjustDeepPathUndefined: Self = StObject.set(x, "adjustDeepPath", js.undefined)
    
    inline def setBatchGroupId(value: String): Self = StObject.set(x, "batchGroupId", value.asInstanceOf[js.Any])
    
    inline def setBatchGroupIdUndefined: Self = StObject.set(x, "batchGroupId", js.undefined)
    
    inline def setChangeSetId(value: String): Self = StObject.set(x, "changeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "changeSetId", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRefreshAfterChange(value: Boolean): Self = StObject.set(x, "refreshAfterChange", value.asInstanceOf[js.Any])
    
    inline def setRefreshAfterChangeUndefined: Self = StObject.set(x, "refreshAfterChange", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrlParameters(value: Record[String, Any]): Self = StObject.set(x, "urlParameters", value.asInstanceOf[js.Any])
    
    inline def setUrlParametersUndefined: Self = StObject.set(x, "urlParameters", js.undefined)
  }
}
