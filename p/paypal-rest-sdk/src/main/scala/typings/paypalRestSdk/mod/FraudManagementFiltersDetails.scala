package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FraudManagementFiltersDetails extends StObject {
  
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
  implicit class FraudManagementFiltersDetailsMutableBuilder[Self <: FraudManagementFiltersDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_id(value: String): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: String): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
