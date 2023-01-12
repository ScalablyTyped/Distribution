package typings.openui5.anon

import typings.openui5.sapUiModelOdataOperationModeMod.OperationMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoExpandSelect extends StObject {
  
  /**
    * The URL (or an array of URLs) from which the annotation metadata are loaded. The annotation files are
    * merged into the service metadata in the given order (last one wins). The same annotations are overwritten;
    * if an annotation file contains other elements (like a type definition) that are already merged, an error
    * is thrown. Supported since 1.41.0
    */
  var annotationURI: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Whether the OData model's bindings automatically generate $select and $expand system query options from
    * the binding hierarchy. Note: Dynamic changes to the binding hierarchy are not supported. This parameter
    * is supported since 1.47.0, and since 1.75.0 it also enables property paths containing navigation properties
    * in `$select`.
    */
  var autoExpandSelect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the following is requested at the earliest convenience:
    * 	 root $metadata document and annotation files;  the security token.  Note: The root $metadata
    * document and annotation files are just requested but not yet converted from XML to JSON unless really
    * needed. Supported since 1.53.0. **BEWARE:** The default value may change to `true` in later releases.
    * You may also set {@link topic:26ba6a5c1e5c417f8b21cce1411dba2c Manifest Model Preload} in order to further
    * speed up the start of a UI5 component.
    */
  var earlyRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls the model's use of batch requests: '$auto' bundles requests from the model in a batch request
    * which is sent automatically before rendering; '$direct' sends requests directly without batch; other
    * values result in an error
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * Controls the use of batch requests for application groups. A map of application group IDs having an object
    * with exactly one property `submit`. Valid values are 'API', 'Auto', 'Direct' see {@link sap.ui.model.odata.v4.SubmitMode}.
    * Supported since 1.51.0
    */
  var groupProperties: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Map of HTTP header names to their values, see {@link #changeHttpHeaders}
    */
  var httpHeaders: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Additional map of URL parameters used specifically for $metadata requests. Note that "sap-context-token"
    * applies only to the service's root $metadata, but not to "cross-service references". Supported since
    * 1.81.0
    */
  var metadataUrlParams: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The version of the OData service. Supported values are "2.0" and "4.0".
    */
  var odataVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The operation mode for filtering and sorting. Since 1.39.0, the operation mode {@link sap.ui.model.odata.OperationMode.Server}
    * is supported. All other operation modes including `undefined` lead to an error if 'vFilters' or 'vSorters'
    * are given or if {@link sap.ui.model.odata.v4.ODataListBinding#filter} or {@link sap.ui.model.odata.v4.ODataListBinding#sort}
    * is called.
    */
  var operationMode: js.UndefOr[
    OperationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperationMode * / any */ String)
  ] = js.undefined
  
  /**
    * Root URL of the service to request data from. The path part of the URL must end with a forward slash
    * according to OData V4 specification ABNF, rule "serviceRoot". You may append OData custom query options
    * to the service root URL separated with a "?", for example "/MyService/?custom=foo". See specification
    * "OData Version 4.0 Part 2: URL Conventions", "5.2 Custom Query Options". OData system query options
    * and OData parameter aliases lead to an error.
    */
  var serviceUrl: String
  
  /**
    * Whether all list bindings for the same resource path share their data, so that it is requested only once;
    * only the value `true` is allowed; see parameter "$$sharedRequest" of {@link #bindList}. Additionally,
    * {@link sap.ui.model.BindingMode.OneWay} becomes the default binding mode and {@link sap.ui.model.BindingMode.TwoWay}
    * is forbidden. Note: This makes all bindings read-only, so it may be especially useful for value list
    * models. Supported since 1.80.0
    */
  var sharedRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether `<edmx:Reference>` and `<edmx:Include>` directives are supported in order to load schemas
    * on demand from other $metadata documents and include them into the current service ("cross-service references").
    */
  var supportReferences: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls synchronization between different bindings which refer to the same data for the case data changes
    * in one binding. Must be set to 'None' which means bindings are not synchronized at all; all other values
    * are not supported and lead to an error.
    */
  var synchronizationMode: String
  
  /**
    * The group ID that is used for update requests. If no update group ID is specified, `mParameters.groupId`
    * is used. Valid update group IDs are `undefined`, '$auto', '$direct' or an application group ID.
    */
  var updateGroupId: js.UndefOr[String] = js.undefined
}
object AutoExpandSelect {
  
  inline def apply(serviceUrl: String, synchronizationMode: String): AutoExpandSelect = {
    val __obj = js.Dynamic.literal(serviceUrl = serviceUrl.asInstanceOf[js.Any], synchronizationMode = synchronizationMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoExpandSelect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoExpandSelect] (val x: Self) extends AnyVal {
    
    inline def setAnnotationURI(value: String | js.Array[String]): Self = StObject.set(x, "annotationURI", value.asInstanceOf[js.Any])
    
    inline def setAnnotationURIUndefined: Self = StObject.set(x, "annotationURI", js.undefined)
    
    inline def setAnnotationURIVarargs(value: String*): Self = StObject.set(x, "annotationURI", js.Array(value*))
    
    inline def setAutoExpandSelect(value: Boolean): Self = StObject.set(x, "autoExpandSelect", value.asInstanceOf[js.Any])
    
    inline def setAutoExpandSelectUndefined: Self = StObject.set(x, "autoExpandSelect", js.undefined)
    
    inline def setEarlyRequests(value: Boolean): Self = StObject.set(x, "earlyRequests", value.asInstanceOf[js.Any])
    
    inline def setEarlyRequestsUndefined: Self = StObject.set(x, "earlyRequests", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setGroupProperties(value: js.Object): Self = StObject.set(x, "groupProperties", value.asInstanceOf[js.Any])
    
    inline def setGroupPropertiesUndefined: Self = StObject.set(x, "groupProperties", js.undefined)
    
    inline def setHttpHeaders(value: js.Object): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    inline def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
    
    inline def setMetadataUrlParams(value: js.Object): Self = StObject.set(x, "metadataUrlParams", value.asInstanceOf[js.Any])
    
    inline def setMetadataUrlParamsUndefined: Self = StObject.set(x, "metadataUrlParams", js.undefined)
    
    inline def setOdataVersion(value: String): Self = StObject.set(x, "odataVersion", value.asInstanceOf[js.Any])
    
    inline def setOdataVersionUndefined: Self = StObject.set(x, "odataVersion", js.undefined)
    
    inline def setOperationMode(
      value: OperationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperationMode * / any */ String)
    ): Self = StObject.set(x, "operationMode", value.asInstanceOf[js.Any])
    
    inline def setOperationModeUndefined: Self = StObject.set(x, "operationMode", js.undefined)
    
    inline def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
    
    inline def setSharedRequests(value: Boolean): Self = StObject.set(x, "sharedRequests", value.asInstanceOf[js.Any])
    
    inline def setSharedRequestsUndefined: Self = StObject.set(x, "sharedRequests", js.undefined)
    
    inline def setSupportReferences(value: Boolean): Self = StObject.set(x, "supportReferences", value.asInstanceOf[js.Any])
    
    inline def setSupportReferencesUndefined: Self = StObject.set(x, "supportReferences", js.undefined)
    
    inline def setSynchronizationMode(value: String): Self = StObject.set(x, "synchronizationMode", value.asInstanceOf[js.Any])
    
    inline def setUpdateGroupId(value: String): Self = StObject.set(x, "updateGroupId", value.asInstanceOf[js.Any])
    
    inline def setUpdateGroupIdUndefined: Self = StObject.set(x, "updateGroupId", js.undefined)
  }
}
