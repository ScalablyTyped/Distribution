package typings.openui5.anon

import typings.openui5.sapUiModelBindingModeMod.BindingMode
import typings.openui5.sapUiModelOdataOperationModeMod.OperationMode
import typings.openui5.sapUiModelOdataUpdateMethodMod.UpdateMethod
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindableResponseHeaders extends StObject {
  
  /**
    * The URL (or an array of URLs) from which the annotation metadata should be loaded
    */
  var annotationURI: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Set this array to make custom response headers bindable via the entity's "__metadata/headers" property
    */
  var bindableResponseHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the model tries to calculate canonical URLs to request the data.
    *
    * **For example:** An application displays the details of a sales order in a form with an absolute binding
    * path `/SalesOrderSet("1")`. The form embeds a table for the sales order line items with a relative binding
    * path `ToLineItems`. If the user selects a sales order line item (e.g. Item "10"), the details of this
    * sales order line item are displayed in another form, which also contains a table for the sales order
    * line item's schedules with a relative binding path `ToSchedules`.
    *
    * If the `canonicalRequests` parameter has the default value `false`, then the OData model would request
    * the data for the sales order line item's details form with the following requests:
    * ```javascript
    *
    *   GET /<serviceUrl>/SalesOrderSet("1")/ToLineItems(SalesOrderID="1",ItemPosition="10")
    *   GET /<serviceUrl>/SalesOrderSet("1")/ToLineItems(SalesOrderID="1",ItemPosition="10")/ToSchedules```
    *
    *
    * Some back-end implementations do not support more than one navigation property in the resource URL. In
    * this case, set the `canonicalRequests` parameter to `true`. The OData model then converts the long resource
    * URLs to canonical URLs and requests the data for the sales order line item's details form with the following
    * requests:
    * ```javascript
    *
    *   GET /<serviceUrl>/SalesOrderLineItemsSet(SalesOrderID="1",ItemPosition="10")
    *   GET /<serviceUrl>/SalesOrderLineItemsSet(SalesOrderID="1",ItemPosition="10")/ToSchedules```
    */
  var canonicalRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the default binding mode for the model
    */
  var defaultBindingMode: js.UndefOr[
    BindingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String)
  ] = js.undefined
  
  /**
    * Sets the default count mode for the model
    */
  var defaultCountMode: js.UndefOr[
    typings.openui5.sapUiModelOdataCountModeMod.CountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String)
  ] = js.undefined
  
  /**
    * Sets the default operation mode for the model
    */
  var defaultOperationMode: js.UndefOr[
    OperationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperationMode * / any */ String)
  ] = js.undefined
  
  /**
    * Default update method which is used for all update requests
    */
  var defaultUpdateMethod: js.UndefOr[UpdateMethod] = js.undefined
  
  /**
    * Set this flag to `true` if your service does not support `HEAD` requests for fetching the service document
    * (and thus the security token) to avoid sending a `HEAD`-request before falling back to `GET`
    */
  var disableHeadRequestForToken: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set this flag to `true` if you don´t want to start a new soft state session with context ID (`SID`) through
    * header mechanism. This is useful if you want to share a `SID` between different browser windows
    */
  var disableSoftStateHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the security token is requested at the earliest convenience, if parameter `tokenHandling` is
    * `true`; supported since 1.79.0.
    */
  var earlyTokenRequest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Map of custom headers (name/value pairs) like {"myHeader":"myHeaderValue",...}
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * **Experimental** as of version 1.112.0; may change behavior or be removed in future versions. Whether
    * to ignore all annotations from service metadata, so that they are not available as V4 annotations in
    * this model's metamodel; see {@link #getMetaModel}. Only annotations from annotation files are loaded;
    * see the `annotationURI` parameter.
    */
  var ignoreAnnotationsFromMetadata: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to `true`, request payloads will be JSON, XML for `false`
    */
  var json: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the `metadataLoaded` event will be fired only after all annotations have been loaded as well
    */
  var loadAnnotationsJoined: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Please use the following string format e.g. '2.0' or '3.0'. OData version supported by the ODataModel:
    * '2.0'
    */
  var maxDataServiceVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Map of namespace aliases (alias => URI) that can be used in metadata binding paths; each alias is mapped
    * to a corresponding namespace URI; when an alias is used in a metadata binding path, it addresses a metadata
    * extension that belongs to the corresponding namespace URI; if `metadataNamespaces` is not given, the
    * following default mappings will be used:
    * 	 - `"sap": "sap:"http://www.sap.com/Protocols/SAPData"`
    * 	 - `"m": "http://schemas.microsoft.com/ado/2007/08/dataservices/metadata"`
    * 	 - `"": "http://schemas.microsoft.com/ado/2007/06/edmx`
    */
  var metadataNamespaces: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Map of URL parameters for metadata requests - only attached to a `$metadata` request
    */
  var metadataUrlParams: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * **Deprecated** for security reasons. Use strong server side authentication instead. Password for the
    * service.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * Whether technical messages should always be treated as persistent, since 1.83.0
    */
  var persistTechnicalMessages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether a preliminary context will be created/used by a binding. When set to `true`, the model can bundle
    * the OData calls for dependent bindings into fewer $batch requests. For more information, see {@link topic:6c47b2b39db9404582994070ec3d57a2#loio62149734b5c24507868e722fe87a75db
    * Optimizing Dependent Bindings}
    */
  var preliminaryContext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable/disable automatic refresh after change operations
    */
  var refreshAfterChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to sequentialize all requests, needed in case the service cannot handle parallel requests
    */
  var sequentializeRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Base URI of the service to request data from; this property is mandatory when the first method parameter
    * `serviceUrl` is omitted, but ignored otherwise
    */
  var serviceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Map of URL parameters (name/value pairs) - these parameters will be attached to all requests, except
    * for the `$metadata` request
    */
  var serviceUrlParams: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * **Deprecated** This parameter does not prevent creation of annotations from the metadata document in
    * this model's metamodel. Whether to skip the automated loading of annotations from the metadata document.
    * Loading annotations from metadata does not have any effects (except the lost performance by invoking
    * the parser) if there are no annotations inside the metadata document
    */
  var skipMetadataAnnotationParsing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable/disable security token handling
    */
  var tokenHandling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Send security token for GET requests in case read access logging is activated for the OData Service in
    * the backend.
    */
  var tokenHandlingForGet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether all requests should be sent in batch requests
    */
  var useBatch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * **Deprecated** for security reasons. Use strong server side authentication instead. UserID for the service.
    */
  var user: js.UndefOr[String] = js.undefined
  
  /**
    * Experimental - `true` when user credentials are to be included in a cross-origin request; please note
    * that this only works if all requests are asynchronous
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object BindableResponseHeaders {
  
  inline def apply(): BindableResponseHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindableResponseHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindableResponseHeaders] (val x: Self) extends AnyVal {
    
    inline def setAnnotationURI(value: String | js.Array[String]): Self = StObject.set(x, "annotationURI", value.asInstanceOf[js.Any])
    
    inline def setAnnotationURIUndefined: Self = StObject.set(x, "annotationURI", js.undefined)
    
    inline def setAnnotationURIVarargs(value: String*): Self = StObject.set(x, "annotationURI", js.Array(value*))
    
    inline def setBindableResponseHeaders(value: js.Array[String]): Self = StObject.set(x, "bindableResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setBindableResponseHeadersUndefined: Self = StObject.set(x, "bindableResponseHeaders", js.undefined)
    
    inline def setBindableResponseHeadersVarargs(value: String*): Self = StObject.set(x, "bindableResponseHeaders", js.Array(value*))
    
    inline def setCanonicalRequests(value: Boolean): Self = StObject.set(x, "canonicalRequests", value.asInstanceOf[js.Any])
    
    inline def setCanonicalRequestsUndefined: Self = StObject.set(x, "canonicalRequests", js.undefined)
    
    inline def setDefaultBindingMode(
      value: BindingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String)
    ): Self = StObject.set(x, "defaultBindingMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultBindingModeUndefined: Self = StObject.set(x, "defaultBindingMode", js.undefined)
    
    inline def setDefaultCountMode(
      value: typings.openui5.sapUiModelOdataCountModeMod.CountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String)
    ): Self = StObject.set(x, "defaultCountMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultCountModeUndefined: Self = StObject.set(x, "defaultCountMode", js.undefined)
    
    inline def setDefaultOperationMode(
      value: OperationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperationMode * / any */ String)
    ): Self = StObject.set(x, "defaultOperationMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultOperationModeUndefined: Self = StObject.set(x, "defaultOperationMode", js.undefined)
    
    inline def setDefaultUpdateMethod(value: UpdateMethod): Self = StObject.set(x, "defaultUpdateMethod", value.asInstanceOf[js.Any])
    
    inline def setDefaultUpdateMethodUndefined: Self = StObject.set(x, "defaultUpdateMethod", js.undefined)
    
    inline def setDisableHeadRequestForToken(value: Boolean): Self = StObject.set(x, "disableHeadRequestForToken", value.asInstanceOf[js.Any])
    
    inline def setDisableHeadRequestForTokenUndefined: Self = StObject.set(x, "disableHeadRequestForToken", js.undefined)
    
    inline def setDisableSoftStateHeader(value: Boolean): Self = StObject.set(x, "disableSoftStateHeader", value.asInstanceOf[js.Any])
    
    inline def setDisableSoftStateHeaderUndefined: Self = StObject.set(x, "disableSoftStateHeader", js.undefined)
    
    inline def setEarlyTokenRequest(value: Boolean): Self = StObject.set(x, "earlyTokenRequest", value.asInstanceOf[js.Any])
    
    inline def setEarlyTokenRequestUndefined: Self = StObject.set(x, "earlyTokenRequest", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIgnoreAnnotationsFromMetadata(value: Boolean): Self = StObject.set(x, "ignoreAnnotationsFromMetadata", value.asInstanceOf[js.Any])
    
    inline def setIgnoreAnnotationsFromMetadataUndefined: Self = StObject.set(x, "ignoreAnnotationsFromMetadata", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setLoadAnnotationsJoined(value: Boolean): Self = StObject.set(x, "loadAnnotationsJoined", value.asInstanceOf[js.Any])
    
    inline def setLoadAnnotationsJoinedUndefined: Self = StObject.set(x, "loadAnnotationsJoined", js.undefined)
    
    inline def setMaxDataServiceVersion(value: String): Self = StObject.set(x, "maxDataServiceVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxDataServiceVersionUndefined: Self = StObject.set(x, "maxDataServiceVersion", js.undefined)
    
    inline def setMetadataNamespaces(value: Record[String, String]): Self = StObject.set(x, "metadataNamespaces", value.asInstanceOf[js.Any])
    
    inline def setMetadataNamespacesUndefined: Self = StObject.set(x, "metadataNamespaces", js.undefined)
    
    inline def setMetadataUrlParams(value: Record[String, String]): Self = StObject.set(x, "metadataUrlParams", value.asInstanceOf[js.Any])
    
    inline def setMetadataUrlParamsUndefined: Self = StObject.set(x, "metadataUrlParams", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPersistTechnicalMessages(value: Boolean): Self = StObject.set(x, "persistTechnicalMessages", value.asInstanceOf[js.Any])
    
    inline def setPersistTechnicalMessagesUndefined: Self = StObject.set(x, "persistTechnicalMessages", js.undefined)
    
    inline def setPreliminaryContext(value: Boolean): Self = StObject.set(x, "preliminaryContext", value.asInstanceOf[js.Any])
    
    inline def setPreliminaryContextUndefined: Self = StObject.set(x, "preliminaryContext", js.undefined)
    
    inline def setRefreshAfterChange(value: Boolean): Self = StObject.set(x, "refreshAfterChange", value.asInstanceOf[js.Any])
    
    inline def setRefreshAfterChangeUndefined: Self = StObject.set(x, "refreshAfterChange", js.undefined)
    
    inline def setSequentializeRequests(value: Boolean): Self = StObject.set(x, "sequentializeRequests", value.asInstanceOf[js.Any])
    
    inline def setSequentializeRequestsUndefined: Self = StObject.set(x, "sequentializeRequests", js.undefined)
    
    inline def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
    
    inline def setServiceUrlParams(value: Record[String, String]): Self = StObject.set(x, "serviceUrlParams", value.asInstanceOf[js.Any])
    
    inline def setServiceUrlParamsUndefined: Self = StObject.set(x, "serviceUrlParams", js.undefined)
    
    inline def setServiceUrlUndefined: Self = StObject.set(x, "serviceUrl", js.undefined)
    
    inline def setSkipMetadataAnnotationParsing(value: Boolean): Self = StObject.set(x, "skipMetadataAnnotationParsing", value.asInstanceOf[js.Any])
    
    inline def setSkipMetadataAnnotationParsingUndefined: Self = StObject.set(x, "skipMetadataAnnotationParsing", js.undefined)
    
    inline def setTokenHandling(value: Boolean): Self = StObject.set(x, "tokenHandling", value.asInstanceOf[js.Any])
    
    inline def setTokenHandlingForGet(value: Boolean): Self = StObject.set(x, "tokenHandlingForGet", value.asInstanceOf[js.Any])
    
    inline def setTokenHandlingForGetUndefined: Self = StObject.set(x, "tokenHandlingForGet", js.undefined)
    
    inline def setTokenHandlingUndefined: Self = StObject.set(x, "tokenHandling", js.undefined)
    
    inline def setUseBatch(value: Boolean): Self = StObject.set(x, "useBatch", value.asInstanceOf[js.Any])
    
    inline def setUseBatchUndefined: Self = StObject.set(x, "useBatch", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
