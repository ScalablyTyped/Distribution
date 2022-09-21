package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePoliciesListResponse extends StObject {
  
  var header: js.UndefOr[ResponseHeader] = js.undefined
  
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another list request using this value
    * as your page token. This lets you the complete contents of even very large collections one page at a time. However, if the contents of the collection change between the first and
    * last paginated list request, the set of all elements returned are an inconsistent view of the collection. You cannot retrieve a consistent snapshot of a collection larger than the
    * maximum page size.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The Response Policy resources. */
  var responsePolicies: js.UndefOr[js.Array[ResponsePolicy]] = js.undefined
}
object ResponsePoliciesListResponse {
  
  inline def apply(): ResponsePoliciesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsePoliciesListResponse]
  }
  
  extension [Self <: ResponsePoliciesListResponse](x: Self) {
    
    inline def setHeader(value: ResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResponsePolicies(value: js.Array[ResponsePolicy]): Self = StObject.set(x, "responsePolicies", value.asInstanceOf[js.Any])
    
    inline def setResponsePoliciesUndefined: Self = StObject.set(x, "responsePolicies", js.undefined)
    
    inline def setResponsePoliciesVarargs(value: ResponsePolicy*): Self = StObject.set(x, "responsePolicies", js.Array(value*))
  }
}
