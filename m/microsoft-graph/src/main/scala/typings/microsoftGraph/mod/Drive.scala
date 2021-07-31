package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Drive
  extends StObject
     with BaseItem {
  
  /**
    * Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for
    * Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
    */
  var driveType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The list of items the user is following. Only in OneDrive for Business.
  var following: js.UndefOr[NullableOption[js.Array[DriveItem]]] = js.undefined
  
  // All items contained in the drive. Read-only. Nullable.
  var items: js.UndefOr[NullableOption[js.Array[DriveItem]]] = js.undefined
  
  // For drives in SharePoint, the underlying document library list. Read-only. Nullable.
  var list: js.UndefOr[NullableOption[List]] = js.undefined
  
  // Optional. The user account that owns the drive. Read-only.
  var owner: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Optional. Information about the drive's storage space quota. Read-only.
  var quota: js.UndefOr[NullableOption[Quota]] = js.undefined
  
  // The root folder of the drive. Read-only.
  var root: js.UndefOr[NullableOption[DriveItem]] = js.undefined
  
  var sharePointIds: js.UndefOr[NullableOption[SharepointIds]] = js.undefined
  
  // Collection of common folders available in OneDrive. Read-only. Nullable.
  var special: js.UndefOr[NullableOption[js.Array[DriveItem]]] = js.undefined
  
  // If present, indicates that this is a system-managed drive. Read-only.
  var system: js.UndefOr[NullableOption[SystemFacet]] = js.undefined
}
object Drive {
  
  @scala.inline
  def apply(): Drive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drive]
  }
  
  @scala.inline
  implicit class DriveMutableBuilder[Self <: Drive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveType(value: NullableOption[String]): Self = StObject.set(x, "driveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveTypeNull: Self = StObject.set(x, "driveType", null)
    
    @scala.inline
    def setDriveTypeUndefined: Self = StObject.set(x, "driveType", js.undefined)
    
    @scala.inline
    def setFollowing(value: NullableOption[js.Array[DriveItem]]): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowingNull: Self = StObject.set(x, "following", null)
    
    @scala.inline
    def setFollowingUndefined: Self = StObject.set(x, "following", js.undefined)
    
    @scala.inline
    def setFollowingVarargs(value: DriveItem*): Self = StObject.set(x, "following", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: NullableOption[js.Array[DriveItem]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsNull: Self = StObject.set(x, "items", null)
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DriveItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setList(value: NullableOption[List]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListNull: Self = StObject.set(x, "list", null)
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setOwner(value: NullableOption[IdentitySet]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setQuota(value: NullableOption[Quota]): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaNull: Self = StObject.set(x, "quota", null)
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    @scala.inline
    def setRoot(value: NullableOption[DriveItem]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSharePointIds(value: NullableOption[SharepointIds]): Self = StObject.set(x, "sharePointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharePointIdsNull: Self = StObject.set(x, "sharePointIds", null)
    
    @scala.inline
    def setSharePointIdsUndefined: Self = StObject.set(x, "sharePointIds", js.undefined)
    
    @scala.inline
    def setSpecial(value: NullableOption[js.Array[DriveItem]]): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialNull: Self = StObject.set(x, "special", null)
    
    @scala.inline
    def setSpecialUndefined: Self = StObject.set(x, "special", js.undefined)
    
    @scala.inline
    def setSpecialVarargs(value: DriveItem*): Self = StObject.set(x, "special", js.Array(value :_*))
    
    @scala.inline
    def setSystem(value: NullableOption[SystemFacet]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNull: Self = StObject.set(x, "system", null)
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
