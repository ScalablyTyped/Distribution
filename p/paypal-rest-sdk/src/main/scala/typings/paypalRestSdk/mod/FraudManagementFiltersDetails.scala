package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FraudManagementFiltersDetails extends js.Object {
  
  var description: String = js.native
  
  var filter_id: String = js.native
  
  var filter_type: String = js.native
  
  var name: String = js.native
}
object FraudManagementFiltersDetails {
  
  @scala.inline
  def apply(description: String, filter_id: String, filter_type: String, name: String): FraudManagementFiltersDetails = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], filter_id = filter_id.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FraudManagementFiltersDetails]
  }
  
  @scala.inline
  implicit class FraudManagementFiltersDetailsOps[Self <: FraudManagementFiltersDetails] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_id(value: String): Self = this.set("filter_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: String): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
