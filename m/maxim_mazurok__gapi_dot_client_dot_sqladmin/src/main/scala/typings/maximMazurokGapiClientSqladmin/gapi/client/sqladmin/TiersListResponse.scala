package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TiersListResponse extends StObject {
  
  /** List of tiers. */
  var items: js.UndefOr[js.Array[Tier]] = js.undefined
  
  /** This is always *sql#tiersList*. */
  var kind: js.UndefOr[String] = js.undefined
}
object TiersListResponse {
  
  @scala.inline
  def apply(): TiersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiersListResponse]
  }
  
  @scala.inline
  implicit class TiersListResponseMutableBuilder[Self <: TiersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Tier]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Tier*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
