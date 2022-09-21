package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HangoutsChatOptions extends StObject {
  
  /** For searches by account or organizational unit, set to **true** to include rooms. */
  var includeRooms: js.UndefOr[Boolean] = js.undefined
}
object HangoutsChatOptions {
  
  inline def apply(): HangoutsChatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HangoutsChatOptions]
  }
  
  extension [Self <: HangoutsChatOptions](x: Self) {
    
    inline def setIncludeRooms(value: Boolean): Self = StObject.set(x, "includeRooms", value.asInstanceOf[js.Any])
    
    inline def setIncludeRoomsUndefined: Self = StObject.set(x, "includeRooms", js.undefined)
  }
}
