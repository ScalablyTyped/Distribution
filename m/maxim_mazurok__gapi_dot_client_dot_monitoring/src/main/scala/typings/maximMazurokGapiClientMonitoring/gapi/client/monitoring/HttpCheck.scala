package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpCheck extends StObject {
  
  /** The authentication information. Optional when creating an HTTP check; defaults to empty. */
  var authInfo: js.UndefOr[BasicAuthentication] = js.native
  
  /**
    * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the
    * headers field or the API will do so. If the request_method is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte. Note: As with all bytes
    * fields, JSON representations are base64 encoded. e.g.: "foo=bar" in URL-encoded form is "foo%3Dbar" and in base64 encoding is "Zm9vJTI1M0RiYXI=".
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * The content type header to use for the check. The following configurations result in errors: 1. Content type is specified in both the headers field and the content_type field. 2.
    * Request method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a "Content-Type" header
    * is provided via headers field. The content_type field should be used instead.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * The list of headers to send as part of the Uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value
    * being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in
    * a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
    */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.HttpCheck with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when
    * retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to true then the headers will be obscured with
    * ******.
    */
  var maskHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional (defaults to "/"). The path to the page against which to run the check. Will be combined with the host (specified within the monitored_resource) and port to construct the
    * full URL. If the provided path does not begin with "/", a "/" will be prepended automatically.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on the HTTP server against which to run the check. Will be combined with host (specified
    * within the monitored_resource) and path to construct the full URL.
    */
  var port: js.UndefOr[Double] = js.native
  
  /** The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method defaults to GET. */
  var requestMethod: js.UndefOr[String] = js.native
  
  /** If true, use HTTPS instead of HTTP to run the check. */
  var useSsl: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is
    * false, setting validate_ssl to true has no effect.
    */
  var validateSsl: js.UndefOr[Boolean] = js.native
}
object HttpCheck {
  
  @scala.inline
  def apply(): HttpCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpCheck]
  }
  
  @scala.inline
  implicit class HttpCheckMutableBuilder[Self <: HttpCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthInfo(value: BasicAuthentication): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthInfoUndefined: Self = StObject.set(x, "authInfo", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.HttpCheck with TopLevel[js.Any]
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMaskHeaders(value: Boolean): Self = StObject.set(x, "maskHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskHeadersUndefined: Self = StObject.set(x, "maskHeaders", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
    
    @scala.inline
    def setUseSsl(value: Boolean): Self = StObject.set(x, "useSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSslUndefined: Self = StObject.set(x, "useSsl", js.undefined)
    
    @scala.inline
    def setValidateSsl(value: Boolean): Self = StObject.set(x, "validateSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateSslUndefined: Self = StObject.set(x, "validateSsl", js.undefined)
  }
}
