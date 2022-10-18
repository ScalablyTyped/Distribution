package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Planid extends StObject {
  
  /** The unique identifier of the plan. */
  var plan_id: Double
}
object Planid {
  
  inline def apply(plan_id: Double): Planid = {
    val __obj = js.Dynamic.literal(plan_id = plan_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Planid]
  }
  
  extension [Self <: Planid](x: Self) {
    
    inline def setPlan_id(value: Double): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
  }
}
