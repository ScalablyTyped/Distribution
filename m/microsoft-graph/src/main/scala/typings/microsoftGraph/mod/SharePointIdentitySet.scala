package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharePointIdentitySet
  extends StObject
     with IdentitySet {
  
  // The group associated with this action. Optional.
  var group: js.UndefOr[NullableOption[Identity]] = js.undefined
  
  // The SharePoint group associated with this action. Optional.
  var siteGroup: js.UndefOr[NullableOption[SharePointIdentity]] = js.undefined
  
  // The SharePoint user associated with this action. Optional.
  var siteUser: js.UndefOr[NullableOption[SharePointIdentity]] = js.undefined
}
object SharePointIdentitySet {
  
  inline def apply(): SharePointIdentitySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharePointIdentitySet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharePointIdentitySet] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: NullableOption[Identity]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setSiteGroup(value: NullableOption[SharePointIdentity]): Self = StObject.set(x, "siteGroup", value.asInstanceOf[js.Any])
    
    inline def setSiteGroupNull: Self = StObject.set(x, "siteGroup", null)
    
    inline def setSiteGroupUndefined: Self = StObject.set(x, "siteGroup", js.undefined)
    
    inline def setSiteUser(value: NullableOption[SharePointIdentity]): Self = StObject.set(x, "siteUser", value.asInstanceOf[js.Any])
    
    inline def setSiteUserNull: Self = StObject.set(x, "siteUser", null)
    
    inline def setSiteUserUndefined: Self = StObject.set(x, "siteUser", js.undefined)
  }
}
