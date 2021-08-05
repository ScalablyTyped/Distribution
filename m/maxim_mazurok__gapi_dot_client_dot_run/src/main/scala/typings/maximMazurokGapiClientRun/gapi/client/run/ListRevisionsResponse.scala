package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRevisionsResponse extends StObject {
  
  /** The API version for this call such as "serving.knative.dev/v1". */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /** List of Revisions. */
  var items: js.UndefOr[js.Array[Revision]] = js.undefined
  
  /** The kind of this resource, in this case "RevisionList". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Metadata associated with this revision list. */
  var metadata: js.UndefOr[ListMeta] = js.undefined
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListRevisionsResponse {
  
  inline def apply(): ListRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRevisionsResponse]
  }
  
  extension [Self <: ListRevisionsResponse](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setItems(value: js.Array[Revision]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Revision*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: ListMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
