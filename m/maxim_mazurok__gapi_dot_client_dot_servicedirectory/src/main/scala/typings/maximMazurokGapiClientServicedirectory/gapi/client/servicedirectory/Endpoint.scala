package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /** Optional. An IPv4 or IPv6 address. Service Directory rejects bad addresses like: * `8.8.8` * `8.8.8.8:53` * `test:bad:address` * `[::1]` * `[::1]:8080` Limited to 45 characters. */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Annotations for the endpoint. This data can be consumed by service clients. Restrictions: * The entire annotations dictionary may contain up to 512 characters, spread
    * accoss all key-value pairs. Annotations that go beyond this limit are rejected * Valid annotation keys have two segments: an optional prefix and name, separated by a slash (/). The
    * name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
    * alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in
    * total, followed by a slash (/) Annotations that fails to meet these requirements are rejected. Note: This field is equivalent to the `metadata` field in the v1beta1 API. They have
    * the same syntax and read/write to the same location in Service Directory.
    */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Immutable. The resource name for the endpoint in the format `projects/ *‍/locations/ *‍/namespaces/ *‍/services/ *‍/endpoints/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. The Google Compute Engine network (VPC) of the endpoint in the format `projects//locations/global/networks/ *`. The project must be specified by project number (project id
    * is rejected). Incorrectly formatted networks are rejected, we also check to make sure that you have the servicedirectory.networks.attach permission on the project specified.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /** Optional. Service Directory rejects values outside of `[0, 65535]`. */
  var port: js.UndefOr[Double] = js.undefined
}
object Endpoint {
  
  inline def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
