package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseItem extends Entity {
  
  // Identity of the user, device, or application which created the item. Read-only.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Identity of the user who created the item. Read-only.
  var createdByUser: js.UndefOr[NullableOption[User]] = js.native
  
  // Date and time of item creation. Read-only.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Provides a user-visible description of the item. Optional.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // ETag for the item. Read-only.
  var eTag: js.UndefOr[NullableOption[String]] = js.native
  
  // Identity of the user, device, and application which last modified the item. Read-only.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Identity of the user who last modified the item. Read-only.
  var lastModifiedByUser: js.UndefOr[NullableOption[User]] = js.native
  
  // Date and time the item was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  // The name of the item. Read-write.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Parent information, if the item has a parent. Read-write.
  var parentReference: js.UndefOr[NullableOption[ItemReference]] = js.native
  
  // URL that displays the resource in the browser. Read-only.
  var webUrl: js.UndefOr[NullableOption[String]] = js.native
}
object BaseItem {
  
  @scala.inline
  def apply(): BaseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseItem]
  }
  
  @scala.inline
  implicit class BaseItemMutableBuilder[Self <: BaseItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setCreatedByUser(value: NullableOption[User]): Self = StObject.set(x, "createdByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUserNull: Self = StObject.set(x, "createdByUser", null)
    
    @scala.inline
    def setCreatedByUserUndefined: Self = StObject.set(x, "createdByUser", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setETag(value: NullableOption[String]): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagNull: Self = StObject.set(x, "eTag", null)
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedByUser(value: NullableOption[User]): Self = StObject.set(x, "lastModifiedByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUserNull: Self = StObject.set(x, "lastModifiedByUser", null)
    
    @scala.inline
    def setLastModifiedByUserUndefined: Self = StObject.set(x, "lastModifiedByUser", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentReference(value: NullableOption[ItemReference]): Self = StObject.set(x, "parentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentReferenceNull: Self = StObject.set(x, "parentReference", null)
    
    @scala.inline
    def setParentReferenceUndefined: Self = StObject.set(x, "parentReference", js.undefined)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
