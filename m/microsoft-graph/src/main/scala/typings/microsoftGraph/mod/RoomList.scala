package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomList
  extends StObject
     with Place {
  
  // The email address of the room list.
  var emailAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  var rooms: js.UndefOr[NullableOption[js.Array[Room]]] = js.undefined
}
object RoomList {
  
  inline def apply(): RoomList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoomList] (val x: Self) extends AnyVal {
    
    inline def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setRooms(value: NullableOption[js.Array[Room]]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    
    inline def setRoomsNull: Self = StObject.set(x, "rooms", null)
    
    inline def setRoomsUndefined: Self = StObject.set(x, "rooms", js.undefined)
    
    inline def setRoomsVarargs(value: Room*): Self = StObject.set(x, "rooms", js.Array(value*))
  }
}
