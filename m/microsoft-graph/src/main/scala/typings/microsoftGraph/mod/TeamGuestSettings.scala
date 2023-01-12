package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamGuestSettings extends StObject {
  
  // If set to true, guests can add and update channels.
  var allowCreateUpdateChannels: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, guests can delete channels.
  var allowDeleteChannels: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object TeamGuestSettings {
  
  inline def apply(): TeamGuestSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamGuestSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamGuestSettings] (val x: Self) extends AnyVal {
    
    inline def setAllowCreateUpdateChannels(value: NullableOption[Boolean]): Self = StObject.set(x, "allowCreateUpdateChannels", value.asInstanceOf[js.Any])
    
    inline def setAllowCreateUpdateChannelsNull: Self = StObject.set(x, "allowCreateUpdateChannels", null)
    
    inline def setAllowCreateUpdateChannelsUndefined: Self = StObject.set(x, "allowCreateUpdateChannels", js.undefined)
    
    inline def setAllowDeleteChannels(value: NullableOption[Boolean]): Self = StObject.set(x, "allowDeleteChannels", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteChannelsNull: Self = StObject.set(x, "allowDeleteChannels", null)
    
    inline def setAllowDeleteChannelsUndefined: Self = StObject.set(x, "allowDeleteChannels", js.undefined)
  }
}
