package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdministrativeUnit extends DirectoryObject {
  
  // An optional description for the administrative unit.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Display name for the administrative unit.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  /**
    * Users and groups that are members of this Adminsitrative Unit. HTTP Methods: GET (list members), POST (add members),
    * DELETE (remove members).
    */
  var members: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Scoped-role members of this Administrative Unit. HTTP Methods: GET (list scopedRoleMemberships), POST (add
    * scopedRoleMembership), DELETE (remove scopedRoleMembership).
    */
  var scopedRoleMembers: js.UndefOr[NullableOption[js.Array[ScopedRoleMembership]]] = js.native
  
  /**
    * Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership or
    * Public. If not set, default behavior is Public. When set to HiddenMembership, only members of the administrative unit
    * can list other members of the adminstrative unit.
    */
  var visibility: js.UndefOr[NullableOption[String]] = js.native
}
object AdministrativeUnit {
  
  @scala.inline
  def apply(): AdministrativeUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeUnit]
  }
  
  @scala.inline
  implicit class AdministrativeUnitOps[Self <: AdministrativeUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    
    @scala.inline
    def setMembersVarargs(value: DirectoryObject*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setMembersNull: Self = this.set("members", null)
    
    @scala.inline
    def setScopedRoleMembersVarargs(value: ScopedRoleMembership*): Self = this.set("scopedRoleMembers", js.Array(value :_*))
    
    @scala.inline
    def setScopedRoleMembers(value: NullableOption[js.Array[ScopedRoleMembership]]): Self = this.set("scopedRoleMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopedRoleMembers: Self = this.set("scopedRoleMembers", js.undefined)
    
    @scala.inline
    def setScopedRoleMembersNull: Self = this.set("scopedRoleMembers", null)
    
    @scala.inline
    def setVisibility(value: NullableOption[String]): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setVisibilityNull: Self = this.set("visibility", null)
  }
}
