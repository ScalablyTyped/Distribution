package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersListResponse extends StObject {
  
  /** List of user resources in the instance. */
  var items: js.UndefOr[js.Array[User]] = js.undefined
  
  /** This is always *sql#usersList*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** An identifier that uniquely identifies the operation. You can use this identifier to retrieve the Operations resource that has information about the operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object UsersListResponse {
  
  @scala.inline
  def apply(): UsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersListResponse]
  }
  
  @scala.inline
  implicit class UsersListResponseMutableBuilder[Self <: UsersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[User]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: User*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
