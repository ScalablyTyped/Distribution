package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /** Optional. An IPv4 or IPv6 address. Service Directory will reject bad addresses like: "8.8.8" "8.8.8.8:53" "test:bad:address" "[::1]" "[::1]:8080" Limited to 45 characters. */
  var address: js.UndefOr[String] = js.undefined
  
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
    */ typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.Endpoint & TopLevel[js.Any]
  ] = js.undefined
  
  /** Immutable. The resource name for the endpoint in the format 'projects/∗/locations/∗/namespaces/∗/services/∗/endpoints/ *'. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Optional. Service Directory will reject values outside of [0, 65535]. */
  var port: js.UndefOr[Double] = js.undefined
}
object Endpoint {
  
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.Endpoint & TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
