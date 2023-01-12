package typings.openui5.anon

import typings.openui5.sapUiModelContextMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created extends StObject {
  
  /**
    * Deprecated - use `groupId` instead
    */
  var batchGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the `ChangeSet` that this request should belong to
    */
  var changeSetId: js.UndefOr[String] = js.undefined
  
  /**
    * The binding context
    */
  var context: js.UndefOr[default] = js.undefined
  
  /**
    * The callback function that is called after the metadata of the service is loaded and the {@link sap.ui.model.odata.v2.Context}
    * instance for the newly created entry is available; The {@link sap.ui.model.odata.v2.Context} instance
    * for the newly created entry is passed as the first and only parameter.
    */
  var created: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The error callback function
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A comma-separated list of navigation properties to be expanded for the newly created entity; since 1.78.0. The navigation properties are requested with an additional GET request in the same `$batch` request
    * as the POST request for the entity creation; the given `mParameters.headers` are not considered in the
    * GET request. **Note:** The following prerequisites must be fulfilled:
    * 	 - batch mode must be enabled; see constructor parameter `useBatch`,
    * 	 - the back-end service must support the "Content-ID" header,
    * 	 - the back end must allow GET requests relative to this content ID outside the changeset within the
    * 			`$batch` request.
    */
  var expand: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a request group; requests belonging to the same group will be bundled in one batch request
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * A map of headers
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Whether the created context is inactive. An inactive context will only be sent to the server after the
    * first property update. From then on it behaves like any other created context. Supported since 1.98.0
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array that specifies a set of properties or the entry
    */
  var properties: js.UndefOr[js.Array[Any] | js.Object] = js.undefined
  
  /**
    * Whether to update all bindings after submitting this change operation, see {@link #setRefreshAfterChange};
    * if given, this overrules the model-wide `refreshAfterChange` flag for this operation only; since 1.46
    */
  var refreshAfterChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The success callback function
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A map of URL parameters
    */
  var urlParameters: js.UndefOr[Record[String, String]] = js.undefined
}
object Created {
  
  inline def apply(): Created = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Created]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
    
    inline def setBatchGroupId(value: String): Self = StObject.set(x, "batchGroupId", value.asInstanceOf[js.Any])
    
    inline def setBatchGroupIdUndefined: Self = StObject.set(x, "batchGroupId", js.undefined)
    
    inline def setChangeSetId(value: String): Self = StObject.set(x, "changeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "changeSetId", js.undefined)
    
    inline def setContext(value: default): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCreated(value: js.Function): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setProperties(value: js.Array[Any] | js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: Any*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setRefreshAfterChange(value: Boolean): Self = StObject.set(x, "refreshAfterChange", value.asInstanceOf[js.Any])
    
    inline def setRefreshAfterChangeUndefined: Self = StObject.set(x, "refreshAfterChange", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrlParameters(value: Record[String, String]): Self = StObject.set(x, "urlParameters", value.asInstanceOf[js.Any])
    
    inline def setUrlParametersUndefined: Self = StObject.set(x, "urlParameters", js.undefined)
  }
}
