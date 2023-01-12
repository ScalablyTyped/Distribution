package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyNotebookModel extends StObject {
  
  var createdBy: js.UndefOr[NullableOption[String]] = js.undefined
  
  var createdByIdentity: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  var createdTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isShared: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var lastModifiedBy: js.UndefOr[NullableOption[String]] = js.undefined
  
  var lastModifiedByIdentity: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  var lastModifiedTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var links: js.UndefOr[NullableOption[NotebookLinks]] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var sectionGroupsUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var sectionsUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var self: js.UndefOr[NullableOption[String]] = js.undefined
  
  var userRole: js.UndefOr[NullableOption[OnenoteUserRole]] = js.undefined
}
object CopyNotebookModel {
  
  inline def apply(): CopyNotebookModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyNotebookModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyNotebookModel] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: NullableOption[String]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByIdentity(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdByIdentity", value.asInstanceOf[js.Any])
    
    inline def setCreatedByIdentityNull: Self = StObject.set(x, "createdByIdentity", null)
    
    inline def setCreatedByIdentityUndefined: Self = StObject.set(x, "createdByIdentity", js.undefined)
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedTime(value: NullableOption[String]): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeNull: Self = StObject.set(x, "createdTime", null)
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setIsShared(value: NullableOption[Boolean]): Self = StObject.set(x, "isShared", value.asInstanceOf[js.Any])
    
    inline def setIsSharedNull: Self = StObject.set(x, "isShared", null)
    
    inline def setIsSharedUndefined: Self = StObject.set(x, "isShared", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByIdentity(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedByIdentity", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByIdentityNull: Self = StObject.set(x, "lastModifiedByIdentity", null)
    
    inline def setLastModifiedByIdentityUndefined: Self = StObject.set(x, "lastModifiedByIdentity", js.undefined)
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setLinks(value: NullableOption[NotebookLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksNull: Self = StObject.set(x, "links", null)
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSectionGroupsUrl(value: NullableOption[String]): Self = StObject.set(x, "sectionGroupsUrl", value.asInstanceOf[js.Any])
    
    inline def setSectionGroupsUrlNull: Self = StObject.set(x, "sectionGroupsUrl", null)
    
    inline def setSectionGroupsUrlUndefined: Self = StObject.set(x, "sectionGroupsUrl", js.undefined)
    
    inline def setSectionsUrl(value: NullableOption[String]): Self = StObject.set(x, "sectionsUrl", value.asInstanceOf[js.Any])
    
    inline def setSectionsUrlNull: Self = StObject.set(x, "sectionsUrl", null)
    
    inline def setSectionsUrlUndefined: Self = StObject.set(x, "sectionsUrl", js.undefined)
    
    inline def setSelf(value: NullableOption[String]): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfNull: Self = StObject.set(x, "self", null)
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    
    inline def setUserRole(value: NullableOption[OnenoteUserRole]): Self = StObject.set(x, "userRole", value.asInstanceOf[js.Any])
    
    inline def setUserRoleNull: Self = StObject.set(x, "userRole", null)
    
    inline def setUserRoleUndefined: Self = StObject.set(x, "userRole", js.undefined)
  }
}
