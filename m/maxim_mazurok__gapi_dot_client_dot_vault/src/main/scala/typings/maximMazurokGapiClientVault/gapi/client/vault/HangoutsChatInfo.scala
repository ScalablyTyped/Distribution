package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HangoutsChatInfo extends StObject {
  
  /** A list of Chat spaces IDs, as provided by the [Chat API](https://developers.google.com/hangouts/chat). */
  var roomId: js.UndefOr[js.Array[String]] = js.undefined
}
object HangoutsChatInfo {
  
  inline def apply(): HangoutsChatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HangoutsChatInfo]
  }
  
  extension [Self <: HangoutsChatInfo](x: Self) {
    
    inline def setRoomId(value: js.Array[String]): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    
    inline def setRoomIdUndefined: Self = StObject.set(x, "roomId", js.undefined)
    
    inline def setRoomIdVarargs(value: String*): Self = StObject.set(x, "roomId", js.Array(value*))
  }
}
