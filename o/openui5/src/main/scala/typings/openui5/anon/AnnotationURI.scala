package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationURI extends StObject {
  
  /**
    * The URL (or an array of URLs) from which the annotation metadata should be loaded,
    */
  var annotationURI: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * sets the default count mode for the model. If not set, sap.ui.model.odata.CountMode.Both is used.
    */
  var defaultCountMode: js.UndefOr[String] = js.undefined
  
  /**
    * a map of custom headers like {"myHeader":"myHeaderValue",...},
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * if set true request payloads will be JSON, XML for false (default = false),
    */
  var json: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to fire the metadataLoaded-event only after annotations have been loaded as well,
    */
  var loadAnnotationsJoined: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (optional) determined if the service metadata request is sent synchronous or asynchronous. Default is
    * false.
    */
  var loadMetadataAsync: js.UndefOr[js.Object] = js.undefined
  
  /**
    * (default = '2.0') please use the following string format e.g. '2.0' or '3.0'. OData version supported
    * by the ODataModel: '2.0',
    */
  var maxDataServiceVersion: Unit
  
  /**
    * a map of namespaces (name => URI) used for parsing the service metadata.
    */
  var metadataNamespaces: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * map of URL parameters for metadata requests - only attached to $metadata request.
    */
  var metadataUrlParams: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * **Deprecated** for security reasons. Use strong server side authentication instead. Password for the
    * service.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * enable/disable automatic refresh after change operations: default = true,
    */
  var refreshAfterChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * map of URL parameters - these parameters will be attached to all requests,
    */
  var serviceUrlParams: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Whether to skip the automated loading of annotations from the metadata document. Loading annotations
    * from metadata does not have any effects (except the lost performance by invoking the parser) if there
    * are not annotations inside the metadata document
    */
  var skipMetadataAnnotationParsing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * enable/disable XCSRF-Token handling (default = true),
    */
  var tokenHandling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when true all requests will be sent in batch requests (default = false),
    */
  var useBatch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * **Deprecated** for security reasons. Use strong server side authentication instead. UserID for the service.
    */
  var user: js.UndefOr[String] = js.undefined
  
  /**
    * experimental - true when user credentials are to be included in a cross-origin request. Please note that
    * this works only if all requests are asynchronous.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object AnnotationURI {
  
  inline def apply(maxDataServiceVersion: Unit): AnnotationURI = {
    val __obj = js.Dynamic.literal(maxDataServiceVersion = maxDataServiceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationURI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationURI] (val x: Self) extends AnyVal {
    
    inline def setAnnotationURI(value: String | js.Array[String]): Self = StObject.set(x, "annotationURI", value.asInstanceOf[js.Any])
    
    inline def setAnnotationURIUndefined: Self = StObject.set(x, "annotationURI", js.undefined)
    
    inline def setAnnotationURIVarargs(value: String*): Self = StObject.set(x, "annotationURI", js.Array(value*))
    
    inline def setDefaultCountMode(value: String): Self = StObject.set(x, "defaultCountMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultCountModeUndefined: Self = StObject.set(x, "defaultCountMode", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setLoadAnnotationsJoined(value: Boolean): Self = StObject.set(x, "loadAnnotationsJoined", value.asInstanceOf[js.Any])
    
    inline def setLoadAnnotationsJoinedUndefined: Self = StObject.set(x, "loadAnnotationsJoined", js.undefined)
    
    inline def setLoadMetadataAsync(value: js.Object): Self = StObject.set(x, "loadMetadataAsync", value.asInstanceOf[js.Any])
    
    inline def setLoadMetadataAsyncUndefined: Self = StObject.set(x, "loadMetadataAsync", js.undefined)
    
    inline def setMaxDataServiceVersion(value: Unit): Self = StObject.set(x, "maxDataServiceVersion", value.asInstanceOf[js.Any])
    
    inline def setMetadataNamespaces(value: Record[String, String]): Self = StObject.set(x, "metadataNamespaces", value.asInstanceOf[js.Any])
    
    inline def setMetadataNamespacesUndefined: Self = StObject.set(x, "metadataNamespaces", js.undefined)
    
    inline def setMetadataUrlParams(value: Record[String, String]): Self = StObject.set(x, "metadataUrlParams", value.asInstanceOf[js.Any])
    
    inline def setMetadataUrlParamsUndefined: Self = StObject.set(x, "metadataUrlParams", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRefreshAfterChange(value: Boolean): Self = StObject.set(x, "refreshAfterChange", value.asInstanceOf[js.Any])
    
    inline def setRefreshAfterChangeUndefined: Self = StObject.set(x, "refreshAfterChange", js.undefined)
    
    inline def setServiceUrlParams(value: Record[String, String]): Self = StObject.set(x, "serviceUrlParams", value.asInstanceOf[js.Any])
    
    inline def setServiceUrlParamsUndefined: Self = StObject.set(x, "serviceUrlParams", js.undefined)
    
    inline def setSkipMetadataAnnotationParsing(value: Boolean): Self = StObject.set(x, "skipMetadataAnnotationParsing", value.asInstanceOf[js.Any])
    
    inline def setSkipMetadataAnnotationParsingUndefined: Self = StObject.set(x, "skipMetadataAnnotationParsing", js.undefined)
    
    inline def setTokenHandling(value: Boolean): Self = StObject.set(x, "tokenHandling", value.asInstanceOf[js.Any])
    
    inline def setTokenHandlingUndefined: Self = StObject.set(x, "tokenHandling", js.undefined)
    
    inline def setUseBatch(value: Boolean): Self = StObject.set(x, "useBatch", value.asInstanceOf[js.Any])
    
    inline def setUseBatchUndefined: Self = StObject.set(x, "useBatch", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
