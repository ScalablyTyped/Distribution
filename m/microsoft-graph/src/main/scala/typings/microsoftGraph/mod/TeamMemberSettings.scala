package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamMemberSettings extends StObject {
  
  // If set to true, members can add and remove apps.
  var allowAddRemoveApps: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, members can add and update private channels.
  var allowCreatePrivateChannels: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, members can add and update channels.
  var allowCreateUpdateChannels: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, members can add, update, and remove connectors.
  var allowCreateUpdateRemoveConnectors: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, members can add, update, and remove tabs.
  var allowCreateUpdateRemoveTabs: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, members can delete channels.
  var allowDeleteChannels: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object TeamMemberSettings {
  
  inline def apply(): TeamMemberSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamMemberSettings]
  }
  
  extension [Self <: TeamMemberSettings](x: Self) {
    
    inline def setAllowAddRemoveApps(value: NullableOption[Boolean]): Self = StObject.set(x, "allowAddRemoveApps", value.asInstanceOf[js.Any])
    
    inline def setAllowAddRemoveAppsNull: Self = StObject.set(x, "allowAddRemoveApps", null)
    
    inline def setAllowAddRemoveAppsUndefined: Self = StObject.set(x, "allowAddRemoveApps", js.undefined)
    
    inline def setAllowCreatePrivateChannels(value: NullableOption[Boolean]): Self = StObject.set(x, "allowCreatePrivateChannels", value.asInstanceOf[js.Any])
    
    inline def setAllowCreatePrivateChannelsNull: Self = StObject.set(x, "allowCreatePrivateChannels", null)
    
    inline def setAllowCreatePrivateChannelsUndefined: Self = StObject.set(x, "allowCreatePrivateChannels", js.undefined)
    
    inline def setAllowCreateUpdateChannels(value: NullableOption[Boolean]): Self = StObject.set(x, "allowCreateUpdateChannels", value.asInstanceOf[js.Any])
    
    inline def setAllowCreateUpdateChannelsNull: Self = StObject.set(x, "allowCreateUpdateChannels", null)
    
    inline def setAllowCreateUpdateChannelsUndefined: Self = StObject.set(x, "allowCreateUpdateChannels", js.undefined)
    
    inline def setAllowCreateUpdateRemoveConnectors(value: NullableOption[Boolean]): Self = StObject.set(x, "allowCreateUpdateRemoveConnectors", value.asInstanceOf[js.Any])
    
    inline def setAllowCreateUpdateRemoveConnectorsNull: Self = StObject.set(x, "allowCreateUpdateRemoveConnectors", null)
    
    inline def setAllowCreateUpdateRemoveConnectorsUndefined: Self = StObject.set(x, "allowCreateUpdateRemoveConnectors", js.undefined)
    
    inline def setAllowCreateUpdateRemoveTabs(value: NullableOption[Boolean]): Self = StObject.set(x, "allowCreateUpdateRemoveTabs", value.asInstanceOf[js.Any])
    
    inline def setAllowCreateUpdateRemoveTabsNull: Self = StObject.set(x, "allowCreateUpdateRemoveTabs", null)
    
    inline def setAllowCreateUpdateRemoveTabsUndefined: Self = StObject.set(x, "allowCreateUpdateRemoveTabs", js.undefined)
    
    inline def setAllowDeleteChannels(value: NullableOption[Boolean]): Self = StObject.set(x, "allowDeleteChannels", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteChannelsNull: Self = StObject.set(x, "allowDeleteChannels", null)
    
    inline def setAllowDeleteChannelsUndefined: Self = StObject.set(x, "allowDeleteChannels", js.undefined)
  }
}
