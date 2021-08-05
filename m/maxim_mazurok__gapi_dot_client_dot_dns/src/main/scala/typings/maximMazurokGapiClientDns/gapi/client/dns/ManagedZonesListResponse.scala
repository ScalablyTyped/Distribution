package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedZonesListResponse extends StObject {
  
  var header: js.UndefOr[ResponseHeader] = js.undefined
  
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The managed zone resources. */
  var managedZones: js.UndefOr[js.Array[ManagedZone]] = js.undefined
  
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another list request using this value
    * as your page token. In this way you can retrieve the complete contents of even very large collections one page at a time. However, if the contents of the collection change between
    * the first and last paginated list request, the set of all elements returned will be an inconsistent view of the collection. There is no way to retrieve a consistent snapshot of a
    * collection larger than the maximum page size.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ManagedZonesListResponse {
  
  inline def apply(): ManagedZonesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZonesListResponse]
  }
  
  extension [Self <: ManagedZonesListResponse](x: Self) {
    
    inline def setHeader(value: ResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setManagedZones(value: js.Array[ManagedZone]): Self = StObject.set(x, "managedZones", value.asInstanceOf[js.Any])
    
    inline def setManagedZonesUndefined: Self = StObject.set(x, "managedZones", js.undefined)
    
    inline def setManagedZonesVarargs(value: ManagedZone*): Self = StObject.set(x, "managedZones", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
