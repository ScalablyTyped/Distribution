package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import typings.powerappsComponentFramework.ComponentFramework.EntityReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The object returned when a save is successful for open form.
  */
@js.native
trait OpenFormSuccessResponse extends js.Object {
  
  var savedEntityReference: js.Array[EntityReference] = js.native
}
object OpenFormSuccessResponse {
  
  @scala.inline
  def apply(savedEntityReference: js.Array[EntityReference]): OpenFormSuccessResponse = {
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFormSuccessResponse]
  }
  
  @scala.inline
  implicit class OpenFormSuccessResponseOps[Self <: OpenFormSuccessResponse] (val x: Self) extends AnyVal {
    
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
    def setSavedEntityReferenceVarargs(value: EntityReference*): Self = this.set("savedEntityReference", js.Array(value :_*))
    
    @scala.inline
    def setSavedEntityReference(value: js.Array[EntityReference]): Self = this.set("savedEntityReference", value.asInstanceOf[js.Any])
  }
}
