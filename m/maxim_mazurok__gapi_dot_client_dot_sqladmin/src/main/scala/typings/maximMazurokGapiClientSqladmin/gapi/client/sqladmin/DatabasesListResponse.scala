package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabasesListResponse extends StObject {
  
  /** List of database resources in the instance. */
  var items: js.UndefOr[js.Array[Database]] = js.undefined
  
  /** This is always *sql#databasesList*. */
  var kind: js.UndefOr[String] = js.undefined
}
object DatabasesListResponse {
  
  @scala.inline
  def apply(): DatabasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabasesListResponse]
  }
  
  @scala.inline
  implicit class DatabasesListResponseMutableBuilder[Self <: DatabasesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Database]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Database*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
