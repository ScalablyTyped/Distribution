package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesListResponse extends StObject {
  
  /** List of database instance resources. */
  var items: js.UndefOr[js.Array[DatabaseInstance]] = js.native
  
  /** This is always *sql#instancesList*. */
  var kind: js.UndefOr[String] = js.native
  
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of warnings that occurred while handling the request. */
  var warnings: js.UndefOr[js.Array[ApiWarning]] = js.native
}
object InstancesListResponse {
  
  @scala.inline
  def apply(): InstancesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesListResponse]
  }
  
  @scala.inline
  implicit class InstancesListResponseMutableBuilder[Self <: InstancesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[DatabaseInstance]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DatabaseInstance*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[ApiWarning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: ApiWarning*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
