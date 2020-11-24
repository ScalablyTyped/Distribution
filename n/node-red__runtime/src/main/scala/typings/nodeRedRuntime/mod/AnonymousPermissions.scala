package typings.nodeRedRuntime.mod

import typings.nodeRedRuntime.nodeRedRuntimeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnonymousPermissions extends User {
  
  var anonymous: `true` = js.native
  
  var permissions: Permission | js.Array[Permission] = js.native
}
object AnonymousPermissions {
  
  @scala.inline
  def apply(anonymous: `true`, permissions: Permission | js.Array[Permission]): AnonymousPermissions = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousPermissions]
  }
  
  @scala.inline
  implicit class AnonymousPermissionsOps[Self <: AnonymousPermissions] (val x: Self) extends AnyVal {
    
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
    def setAnonymous(value: `true`): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: Permission | js.Array[Permission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
  }
}
