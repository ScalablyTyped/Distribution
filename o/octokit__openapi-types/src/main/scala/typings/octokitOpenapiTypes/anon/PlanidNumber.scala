package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanidNumber extends StObject {
  
  var plan_id: Double
}
object PlanidNumber {
  
  inline def apply(plan_id: Double): PlanidNumber = {
    val __obj = js.Dynamic.literal(plan_id = plan_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlanidNumber] (val x: Self) extends AnyVal {
    
    inline def setPlan_id(value: Double): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
  }
}
