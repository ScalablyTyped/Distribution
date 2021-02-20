package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends StObject {
  
  /** Output only. Endpoints associated with this service. Returned on LookupService.Resolve. Control plane clients should use RegistrationService.ListEndpoints. */
  var endpoints: js.UndefOr[js.Array[Endpoint]] = js.native
  
  /**
    * Optional. Metadata for the service. This data can be consumed by service clients. Restrictions: - The entire metadata dictionary may contain up to 2000 characters, spread accoss all
    * key-value pairs. Metadata that goes beyond any these limits will be rejected. - Valid metadata keys have two segments: an optional prefix and name, separated by a slash (/). The
    * name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
    * alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in
    * total, followed by a slash (/). Metadata that fails to meet these requirements will be rejected. - The '(*.)google.com/' and '(*.)googleapis.com/' prefixes are reserved for system
    * metadata managed by Service Directory. If the user tries to write to these keyspaces, those entries will be silently ignored by the system.
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.Service with TopLevel[js.Any]
  ] = js.native
  
  /** Immutable. The resource name for the service in the format 'projects/∗/locations/∗/namespaces/∗/services/ *'. */
  var name: js.UndefOr[String] = js.native
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoints(value: js.Array[Endpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.Service with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
