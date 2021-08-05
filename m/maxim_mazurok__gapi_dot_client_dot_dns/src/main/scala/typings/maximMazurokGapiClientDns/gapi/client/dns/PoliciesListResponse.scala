package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoliciesListResponse extends StObject {
  
  var header: js.UndefOr[ResponseHeader] = js.undefined
  
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another list request using this value
    * as your page token. In this way you can retrieve the complete contents of even very large collections one page at a time. However, if the contents of the collection change between
    * the first and last paginated list request, the set of all elements returned will be an inconsistent view of the collection. There is no way to retrieve a consistent snapshot of a
    * collection larger than the maximum page size.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The policy resources. */
  var policies: js.UndefOr[js.Array[Policy]] = js.undefined
}
object PoliciesListResponse {
  
  inline def apply(): PoliciesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoliciesListResponse]
  }
  
  extension [Self <: PoliciesListResponse](x: Self) {
    
    inline def setHeader(value: ResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicies(value: js.Array[Policy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
