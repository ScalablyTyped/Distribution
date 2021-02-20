package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlagsListResponse extends StObject {
  
  /** List of flags. */
  var items: js.UndefOr[js.Array[Flag]] = js.native
  
  /** This is always *sql#flagsList*. */
  var kind: js.UndefOr[String] = js.native
}
object FlagsListResponse {
  
  @scala.inline
  def apply(): FlagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlagsListResponse]
  }
  
  @scala.inline
  implicit class FlagsListResponseMutableBuilder[Self <: FlagsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Flag]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Flag*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
