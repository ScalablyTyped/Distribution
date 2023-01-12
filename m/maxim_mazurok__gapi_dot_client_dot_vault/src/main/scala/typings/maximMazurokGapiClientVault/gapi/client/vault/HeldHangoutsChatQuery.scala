package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeldHangoutsChatQuery extends StObject {
  
  /** To include messages in Chat spaces the user was a member of, set to **true**. */
  var includeRooms: js.UndefOr[Boolean] = js.undefined
}
object HeldHangoutsChatQuery {
  
  inline def apply(): HeldHangoutsChatQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldHangoutsChatQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeldHangoutsChatQuery] (val x: Self) extends AnyVal {
    
    inline def setIncludeRooms(value: Boolean): Self = StObject.set(x, "includeRooms", value.asInstanceOf[js.Any])
    
    inline def setIncludeRoomsUndefined: Self = StObject.set(x, "includeRooms", js.undefined)
  }
}
