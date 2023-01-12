package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingTypesResource extends StObject {
  
  var assignedTargetingOptions: AssignedTargetingOptionsResource
  
  var targetingOptions: TargetingOptionsResource
}
object TargetingTypesResource {
  
  inline def apply(
    assignedTargetingOptions: AssignedTargetingOptionsResource,
    targetingOptions: TargetingOptionsResource
  ): TargetingTypesResource = {
    val __obj = js.Dynamic.literal(assignedTargetingOptions = assignedTargetingOptions.asInstanceOf[js.Any], targetingOptions = targetingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetingTypesResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetingTypesResource] (val x: Self) extends AnyVal {
    
    inline def setAssignedTargetingOptions(value: AssignedTargetingOptionsResource): Self = StObject.set(x, "assignedTargetingOptions", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptions(value: TargetingOptionsResource): Self = StObject.set(x, "targetingOptions", value.asInstanceOf[js.Any])
  }
}
