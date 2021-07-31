package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INamedACLAdmin extends StObject {
  
  var AccessControlListForNamedACL: IAccessControlList
  
  def Clone(): INamedACLAdmin
  
  var NamedACL: INamedACL
  
  var SemanticAliases: ISemanticAliases
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
  implicit class INamedACLAdminMutableBuilder[Self <: INamedACLAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlListForNamedACL(value: IAccessControlList): Self = StObject.set(x, "AccessControlListForNamedACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => INamedACLAdmin): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNamedACL(value: INamedACL): Self = StObject.set(x, "NamedACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
  }
}
