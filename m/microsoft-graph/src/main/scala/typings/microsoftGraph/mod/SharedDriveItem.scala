package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedDriveItem
  extends StObject
     with BaseItem {
  
  // Used to access the underlying driveItem
  var driveItem: js.UndefOr[NullableOption[DriveItem]] = js.undefined
  
  // All driveItems contained in the sharing root. This collection cannot be enumerated.
  var items: js.UndefOr[NullableOption[js.Array[DriveItem]]] = js.undefined
  
  // Used to access the underlying list
  var list: js.UndefOr[NullableOption[List]] = js.undefined
  
  // Used to access the underlying listItem
  var listItem: js.UndefOr[NullableOption[ListItem]] = js.undefined
  
  // Information about the owner of the shared item being referenced.
  var owner: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Used to access the permission representing the underlying sharing link
  var permission: js.UndefOr[NullableOption[Permission]] = js.undefined
  
  // Used to access the underlying driveItem. Deprecated -- use driveItem instead.
  var root: js.UndefOr[NullableOption[DriveItem]] = js.undefined
  
  // Used to access the underlying site
  var site: js.UndefOr[NullableOption[Site]] = js.undefined
}
object SharedDriveItem {
  
  inline def apply(): SharedDriveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDriveItem]
  }
  
  extension [Self <: SharedDriveItem](x: Self) {
    
    inline def setDriveItem(value: NullableOption[DriveItem]): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    inline def setDriveItemNull: Self = StObject.set(x, "driveItem", null)
    
    inline def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    inline def setItems(value: NullableOption[js.Array[DriveItem]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsNull: Self = StObject.set(x, "items", null)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DriveItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setList(value: NullableOption[List]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListItem(value: NullableOption[ListItem]): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setListItemNull: Self = StObject.set(x, "listItem", null)
    
    inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    
    inline def setListNull: Self = StObject.set(x, "list", null)
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setOwner(value: NullableOption[IdentitySet]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPermission(value: NullableOption[Permission]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionNull: Self = StObject.set(x, "permission", null)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setRoot(value: NullableOption[DriveItem]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSite(value: NullableOption[Site]): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteNull: Self = StObject.set(x, "site", null)
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
  }
}
