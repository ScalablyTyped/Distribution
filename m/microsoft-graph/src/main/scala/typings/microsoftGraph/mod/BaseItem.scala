package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseItem
  extends StObject
     with Entity {
  
  // Identity of the user, device, or application which created the item. Read-only.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Identity of the user who created the item. Read-only.
  var createdByUser: js.UndefOr[NullableOption[User]] = js.undefined
  
  // Date and time of item creation. Read-only.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Provides a user-visible description of the item. Optional.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ETag for the item. Read-only.
  var eTag: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identity of the user, device, and application which last modified the item. Read-only.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Identity of the user who last modified the item. Read-only.
  var lastModifiedByUser: js.UndefOr[NullableOption[User]] = js.undefined
  
  // Date and time the item was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // The name of the item. Read-write.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Parent information, if the item has a parent. Read-write.
  var parentReference: js.UndefOr[NullableOption[ItemReference]] = js.undefined
  
  // URL that displays the resource in the browser. Read-only.
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object BaseItem {
  
  inline def apply(): BaseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseItem]
  }
  
  extension [Self <: BaseItem](x: Self) {
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedByUser(value: NullableOption[User]): Self = StObject.set(x, "createdByUser", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUserNull: Self = StObject.set(x, "createdByUser", null)
    
    inline def setCreatedByUserUndefined: Self = StObject.set(x, "createdByUser", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setETag(value: NullableOption[String]): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setETagNull: Self = StObject.set(x, "eTag", null)
    
    inline def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedByUser(value: NullableOption[User]): Self = StObject.set(x, "lastModifiedByUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUserNull: Self = StObject.set(x, "lastModifiedByUser", null)
    
    inline def setLastModifiedByUserUndefined: Self = StObject.set(x, "lastModifiedByUser", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentReference(value: NullableOption[ItemReference]): Self = StObject.set(x, "parentReference", value.asInstanceOf[js.Any])
    
    inline def setParentReferenceNull: Self = StObject.set(x, "parentReference", null)
    
    inline def setParentReferenceUndefined: Self = StObject.set(x, "parentReference", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
