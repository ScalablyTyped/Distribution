package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveServiceRequest extends StObject {
  
  /**
    * Optional. The filter applied to the endpoints of the resolved service. General `filter` string syntax: ` ()` * `` can be `name`, `address`, `port`, or `annotations.` for map field *
    * `` can be `<`, `>`, `<=`, `>=`, `!=`, `=`, `:`. Of which `:` means `HAS`, and is roughly the same as `=` * `` must be the same data type as field * `` can be `AND`, `OR`, `NOT`
    * Examples of valid filters: * `annotations.owner` returns endpoints that have a annotation with the key `owner`, this is the same as `annotations:owner` * `annotations.protocol=gRPC`
    * returns endpoints that have key/value `protocol=gRPC` * `address=192.108.1.105` returns endpoints that have this address * `port>8080` returns endpoints that have port number larger
    * than 8080 * `name>projects/my-project/locations/us-east1/namespaces/my-namespace/services/my-service/endpoints/endpoint-c` returns endpoints that have name that is alphabetically
    * later than the string, so "endpoint-e" is returned but "endpoint-a" is not *
    * `name=projects/my-project/locations/us-central1/namespaces/my-namespace/services/my-service/endpoints/ep-1` returns the endpoint that has an endpoint_id equal to `ep-1` *
    * `annotations.owner!=sd AND annotations.foo=bar` returns endpoints that have `owner` in annotation key but value is not `sd` AND have key/value `foo=bar` * `doesnotexist.foo=bar`
    * returns an empty list. Note that endpoint doesn't have a field called "doesnotexist". Since the filter does not match any endpoint, it returns no results For more information about
    * filtering, see [API Filtering](https://aip.dev/160).
    */
  var endpointFilter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum number of endpoints to return. Defaults to 25. Maximum is 100. If a value less than one is specified, the Default is used. If a value greater than the Maximum
    * is specified, the Maximum is used.
    */
  var maxEndpoints: js.UndefOr[Double] = js.undefined
}
object ResolveServiceRequest {
  
  inline def apply(): ResolveServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveServiceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveServiceRequest] (val x: Self) extends AnyVal {
    
    inline def setEndpointFilter(value: String): Self = StObject.set(x, "endpointFilter", value.asInstanceOf[js.Any])
    
    inline def setEndpointFilterUndefined: Self = StObject.set(x, "endpointFilter", js.undefined)
    
    inline def setMaxEndpoints(value: Double): Self = StObject.set(x, "maxEndpoints", value.asInstanceOf[js.Any])
    
    inline def setMaxEndpointsUndefined: Self = StObject.set(x, "maxEndpoints", js.undefined)
  }
}
