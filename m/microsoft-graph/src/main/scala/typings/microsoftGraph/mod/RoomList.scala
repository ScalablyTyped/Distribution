package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomList extends Place {
  
  // The email address of the room list.
  var emailAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Nullable.
  var rooms: js.UndefOr[NullableOption[js.Array[Room]]] = js.native
}
object RoomList {
  
  @scala.inline
  def apply(): RoomList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomList]
  }
  
  @scala.inline
  implicit class RoomListMutableBuilder[Self <: RoomList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setRooms(value: NullableOption[js.Array[Room]]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomsNull: Self = StObject.set(x, "rooms", null)
    
    @scala.inline
    def setRoomsUndefined: Self = StObject.set(x, "rooms", js.undefined)
    
    @scala.inline
    def setRoomsVarargs(value: Room*): Self = StObject.set(x, "rooms", js.Array(value :_*))
  }
}
