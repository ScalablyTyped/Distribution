package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityResource extends js.Object {
  
  // Name of the resource that is related to current alert. Required.
  var resource: js.UndefOr[NullableOption[String]] = js.native
  
  // Represents type of security resources related to an alert. Possible values are: attacked, related.
  var resourceType: js.UndefOr[NullableOption[SecurityResourceType]] = js.native
}
object SecurityResource {
  
  @scala.inline
  def apply(): SecurityResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityResource]
  }
  
  @scala.inline
  implicit class SecurityResourceOps[Self <: SecurityResource] (val x: Self) extends AnyVal {
    
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
    def setResource(value: NullableOption[String]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResourceNull: Self = this.set("resource", null)
    
    @scala.inline
    def setResourceType(value: NullableOption[SecurityResourceType]): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setResourceTypeNull: Self = this.set("resourceType", null)
  }
}
