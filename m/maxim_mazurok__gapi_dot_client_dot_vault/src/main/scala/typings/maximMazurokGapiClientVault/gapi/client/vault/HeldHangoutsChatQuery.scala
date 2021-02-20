package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeldHangoutsChatQuery extends StObject {
  
  /** If true, include rooms the user has participated in. */
  var includeRooms: js.UndefOr[Boolean] = js.native
}
object HeldHangoutsChatQuery {
  
  @scala.inline
  def apply(): HeldHangoutsChatQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldHangoutsChatQuery]
  }
  
  @scala.inline
  implicit class HeldHangoutsChatQueryMutableBuilder[Self <: HeldHangoutsChatQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeRooms(value: Boolean): Self = StObject.set(x, "includeRooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRoomsUndefined: Self = StObject.set(x, "includeRooms", js.undefined)
  }
}
