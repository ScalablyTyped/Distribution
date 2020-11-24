package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendRule extends js.Object {
  
  /**
    * The address of the API backend. The scheme is used to determine the backend protocol and security. The following schemes are accepted: SCHEME PROTOCOL SECURITY http:// HTTP None
    * https:// HTTP TLS grpc:// gRPC None grpcs:// gRPC TLS It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting behaviors across platforms. If
    * the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with TLS For HTTP backends, use protocol to specify the protocol version.
    */
  var address: js.UndefOr[String] = js.native
  
  /** The number of seconds to wait for a response from a request. The default varies based on the request protocol and deployment environment. */
  var deadline: js.UndefOr[Double] = js.native
  
  /**
    * When disable_auth is true, a JWT ID token won't be generated and the original "Authorization" HTTP header will be preserved. If the header is used to carry the original token and is
    * expected by the backend, this field must be set to true to preserve the header.
    */
  var disableAuth: js.UndefOr[Boolean] = js.native
  
  /** The JWT audience is used when generating a JWT ID token for the backend. This ID token will be added in the HTTP "authorization" header, and sent to the backend. */
  var jwtAudience: js.UndefOr[String] = js.native
  
  /** Minimum deadline in seconds needed for this method. Calls having deadline value lower than this will be rejected. */
  var minDeadline: js.UndefOr[Double] = js.native
  
  /** The number of seconds to wait for the completion of a long running operation. The default is no deadline. */
  var operationDeadline: js.UndefOr[Double] = js.native
  
  var pathTranslation: js.UndefOr[String] = js.native
  
  /**
    * The protocol used for sending a request to the backend. The supported values are "http/1.1" and "h2". The default value is inferred from the scheme in the address field: SCHEME
    * PROTOCOL http:// http/1.1 https:// http/1.1 grpc:// h2 grpcs:// h2 For secure HTTP backends (https://) that support HTTP/2, set this field to "h2" for improved performance.
    * Configuring this field to non-default values is only supported for secure HTTP backends. This field will be ignored for all other backends. See
    * https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids for more details on the supported values.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /** Selects the methods to which this rule applies. Refer to selector for syntax details. */
  var selector: js.UndefOr[String] = js.native
}
object BackendRule {
  
  @scala.inline
  def apply(): BackendRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendRule]
  }
  
  @scala.inline
  implicit class BackendRuleOps[Self <: BackendRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setDeadline(value: Double): Self = this.set("deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadline: Self = this.set("deadline", js.undefined)
    
    @scala.inline
    def setDisableAuth(value: Boolean): Self = this.set("disableAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAuth: Self = this.set("disableAuth", js.undefined)
    
    @scala.inline
    def setJwtAudience(value: String): Self = this.set("jwtAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwtAudience: Self = this.set("jwtAudience", js.undefined)
    
    @scala.inline
    def setMinDeadline(value: Double): Self = this.set("minDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDeadline: Self = this.set("minDeadline", js.undefined)
    
    @scala.inline
    def setOperationDeadline(value: Double): Self = this.set("operationDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationDeadline: Self = this.set("operationDeadline", js.undefined)
    
    @scala.inline
    def setPathTranslation(value: String): Self = this.set("pathTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathTranslation: Self = this.set("pathTranslation", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
