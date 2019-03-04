package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamedACLAdmin extends js.Object {
  var AccessControlListForNamedACL: IAccessControlList
  var NamedACL: INamedACL
  var SemanticAliases: ISemanticAliases
  def Clone(): INamedACLAdmin
}

object INamedACLAdmin {
  @scala.inline
  def apply(
    AccessControlListForNamedACL: IAccessControlList,
    Clone: js.Function0[INamedACLAdmin],
    NamedACL: INamedACL,
    SemanticAliases: ISemanticAliases
  ): INamedACLAdmin = {
    val __obj = js.Dynamic.literal(AccessControlListForNamedACL = AccessControlListForNamedACL, Clone = Clone, NamedACL = NamedACL, SemanticAliases = SemanticAliases)
  
    __obj.asInstanceOf[INamedACLAdmin]
  }
}

