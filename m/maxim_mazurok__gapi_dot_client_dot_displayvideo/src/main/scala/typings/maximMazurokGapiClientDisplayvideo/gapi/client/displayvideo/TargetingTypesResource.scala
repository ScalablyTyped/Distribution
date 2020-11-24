package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingTypesResource extends js.Object {
  
  var assignedTargetingOptions: AssignedTargetingOptionsResource = js.native
  
  var targetingOptions: TargetingOptionsResource = js.native
}
object TargetingTypesResource {
  
  @scala.inline
  def apply(
    assignedTargetingOptions: AssignedTargetingOptionsResource,
    targetingOptions: TargetingOptionsResource
  ): TargetingTypesResource = {
    val __obj = js.Dynamic.literal(assignedTargetingOptions = assignedTargetingOptions.asInstanceOf[js.Any], targetingOptions = targetingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetingTypesResource]
  }
  
  @scala.inline
  implicit class TargetingTypesResourceOps[Self <: TargetingTypesResource] (val x: Self) extends AnyVal {
    
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
    def setAssignedTargetingOptions(value: AssignedTargetingOptionsResource): Self = this.set("assignedTargetingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptions(value: TargetingOptionsResource): Self = this.set("targetingOptions", value.asInstanceOf[js.Any])
  }
}
