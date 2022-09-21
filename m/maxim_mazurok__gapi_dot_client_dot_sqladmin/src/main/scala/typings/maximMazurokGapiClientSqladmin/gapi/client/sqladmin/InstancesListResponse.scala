package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesListResponse extends StObject {
  
  /** List of database instance resources. */
  var items: js.UndefOr[js.Array[DatabaseInstance]] = js.undefined
  
  /** This is always `sql#instancesList`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of warnings that occurred while handling the request. */
  var warnings: js.UndefOr[js.Array[ApiWarning]] = js.undefined
}
object InstancesListResponse {
  
  inline def apply(): InstancesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesListResponse]
  }
  
  extension [Self <: InstancesListResponse](x: Self) {
    
    inline def setItems(value: js.Array[DatabaseInstance]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DatabaseInstance*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWarnings(value: js.Array[ApiWarning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: ApiWarning*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
