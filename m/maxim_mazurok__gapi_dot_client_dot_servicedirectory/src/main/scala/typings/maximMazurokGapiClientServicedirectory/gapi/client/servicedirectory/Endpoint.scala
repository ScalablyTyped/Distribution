package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint extends js.Object {
  
  /** Optional. An IPv4 or IPv6 address. Service Directory will reject bad addresses like: "8.8.8" "8.8.8.8:53" "test:bad:address" "[::1]" "[::1]:8080" Limited to 45 characters. */
  var address: js.UndefOr[String] = js.native
  
  /**
    * Optional. Metadata for the endpoint. This data can be consumed by service clients. Restrictions: - The entire metadata dictionary may contain up to 512 characters, spread accoss all
    * key-value pairs. Metadata that goes beyond any these limits will be rejected. - Valid metadata keys have two segments: an optional prefix and name, separated by a slash (/). The
    * name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
    * alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in
    * total, followed by a slash (/). Metadata that fails to meet these requirements will be rejected. - The '(*.)google.com/' and '(*.)googleapis.com/' prefixes are reserved for system
    * metadata managed by Service Directory. If the user tries to write to these keyspaces, those entries will be silently ignored by the system.
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.Endpoint with TopLevel[js.Any]
  ] = js.native
  
  /** Immutable. The resource name for the endpoint in the format 'projects/∗/locations/∗/namespaces/∗/services/∗/endpoints/ *'. */
  var name: js.UndefOr[String] = js.native
  
  /** Optional. Service Directory will reject values outside of [0, 65535]. */
  var port: js.UndefOr[Double] = js.native
}
object Endpoint {
  
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    
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
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.Endpoint with TopLevel[js.Any]
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
