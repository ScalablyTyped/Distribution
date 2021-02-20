package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HangoutsChatOptions extends StObject {
  
  /** Set to true to include rooms. */
  var includeRooms: js.UndefOr[Boolean] = js.native
}
object HangoutsChatOptions {
  
  @scala.inline
  def apply(): HangoutsChatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HangoutsChatOptions]
  }
  
  @scala.inline
  implicit class HangoutsChatOptionsMutableBuilder[Self <: HangoutsChatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeRooms(value: Boolean): Self = StObject.set(x, "includeRooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRoomsUndefined: Self = StObject.set(x, "includeRooms", js.undefined)
  }
}
