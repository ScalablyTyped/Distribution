package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceAccess extends js.Object {
  
  // The unique identifier for one of the oauth2PermissionScopes or appRole instances that the resource application exposes.
  var id: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the id property references an oauth2PermissionScopes or an appRole. Possible values are Scope or
    * Role.
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.native
}
object ResourceAccess {
  
  @scala.inline
  def apply(): ResourceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAccess]
  }
  
  @scala.inline
  implicit class ResourceAccessOps[Self <: ResourceAccess] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
