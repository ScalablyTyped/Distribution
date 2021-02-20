package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyNotebookModel extends StObject {
  
  var createdBy: js.UndefOr[NullableOption[String]] = js.native
  
  var createdByIdentity: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  var createdTime: js.UndefOr[NullableOption[String]] = js.native
  
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var isShared: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var lastModifiedBy: js.UndefOr[NullableOption[String]] = js.native
  
  var lastModifiedByIdentity: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  var lastModifiedTime: js.UndefOr[NullableOption[String]] = js.native
  
  var links: js.UndefOr[NullableOption[NotebookLinks]] = js.native
  
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  var sectionGroupsUrl: js.UndefOr[NullableOption[String]] = js.native
  
  var sectionsUrl: js.UndefOr[NullableOption[String]] = js.native
  
  var self: js.UndefOr[NullableOption[String]] = js.native
  
  var userRole: js.UndefOr[NullableOption[OnenoteUserRole]] = js.native
}
object CopyNotebookModel {
  
  @scala.inline
  def apply(): CopyNotebookModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyNotebookModel]
  }
  
  @scala.inline
  implicit class CopyNotebookModelMutableBuilder[Self <: CopyNotebookModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedBy(value: NullableOption[String]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByIdentity(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdByIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByIdentityNull: Self = StObject.set(x, "createdByIdentity", null)
    
    @scala.inline
    def setCreatedByIdentityUndefined: Self = StObject.set(x, "createdByIdentity", js.undefined)
    
    @scala.inline
    def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: NullableOption[String]): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeNull: Self = StObject.set(x, "createdTime", null)
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setIsShared(value: NullableOption[Boolean]): Self = StObject.set(x, "isShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSharedNull: Self = StObject.set(x, "isShared", null)
    
    @scala.inline
    def setIsSharedUndefined: Self = StObject.set(x, "isShared", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByIdentity(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedByIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByIdentityNull: Self = StObject.set(x, "lastModifiedByIdentity", null)
    
    @scala.inline
    def setLastModifiedByIdentityUndefined: Self = StObject.set(x, "lastModifiedByIdentity", js.undefined)
    
    @scala.inline
    def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    @scala.inline
    def setLinks(value: NullableOption[NotebookLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksNull: Self = StObject.set(x, "links", null)
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSectionGroupsUrl(value: NullableOption[String]): Self = StObject.set(x, "sectionGroupsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionGroupsUrlNull: Self = StObject.set(x, "sectionGroupsUrl", null)
    
    @scala.inline
    def setSectionGroupsUrlUndefined: Self = StObject.set(x, "sectionGroupsUrl", js.undefined)
    
    @scala.inline
    def setSectionsUrl(value: NullableOption[String]): Self = StObject.set(x, "sectionsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsUrlNull: Self = StObject.set(x, "sectionsUrl", null)
    
    @scala.inline
    def setSectionsUrlUndefined: Self = StObject.set(x, "sectionsUrl", js.undefined)
    
    @scala.inline
    def setSelf(value: NullableOption[String]): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfNull: Self = StObject.set(x, "self", null)
    
    @scala.inline
    def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    
    @scala.inline
    def setUserRole(value: NullableOption[OnenoteUserRole]): Self = StObject.set(x, "userRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRoleNull: Self = StObject.set(x, "userRole", null)
    
    @scala.inline
    def setUserRoleUndefined: Self = StObject.set(x, "userRole", js.undefined)
  }
}
