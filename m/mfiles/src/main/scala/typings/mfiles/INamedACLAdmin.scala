package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INamedACLAdmin extends js.Object {
  
  var AccessControlListForNamedACL: IAccessControlList = js.native
  
  def Clone(): INamedACLAdmin = js.native
  
  var NamedACL: INamedACL = js.native
  
  var SemanticAliases: ISemanticAliases = js.native
}
object INamedACLAdmin {
  
  @scala.inline
  def apply(
    AccessControlListForNamedACL: IAccessControlList,
    Clone: () => INamedACLAdmin,
    NamedACL: INamedACL,
    SemanticAliases: ISemanticAliases
  ): INamedACLAdmin = {
    val __obj = js.Dynamic.literal(AccessControlListForNamedACL = AccessControlListForNamedACL.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), NamedACL = NamedACL.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamedACLAdmin]
  }
  
  @scala.inline
  implicit class INamedACLAdminOps[Self <: INamedACLAdmin] (val x: Self) extends AnyVal {
    
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
    def setAccessControlListForNamedACL(value: IAccessControlList): Self = this.set("AccessControlListForNamedACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => INamedACLAdmin): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNamedACL(value: INamedACL): Self = this.set("NamedACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = this.set("SemanticAliases", value.asInstanceOf[js.Any])
  }
}
