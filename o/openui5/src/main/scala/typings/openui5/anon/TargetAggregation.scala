package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetAggregation extends StObject {
  
  /**
    * The control instance that is personalized by this controller
    */
  var control: default
  
  /**
    * The name of the aggregation that is now managed by this controller
    */
  var targetAggregation: String
}
object TargetAggregation {
  
  inline def apply(control: default, targetAggregation: String): TargetAggregation = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], targetAggregation = targetAggregation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetAggregation]
  }
  
  extension [Self <: TargetAggregation](x: Self) {
    
    inline def setControl(value: default): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setTargetAggregation(value: String): Self = StObject.set(x, "targetAggregation", value.asInstanceOf[js.Any])
  }
}
