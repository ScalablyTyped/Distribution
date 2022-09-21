package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPlanConfig extends StObject {
  
  var planId: String
  
  var planVersion: js.UndefOr[Double] = js.undefined
}
object DataPlanConfig {
  
  inline def apply(planId: String): DataPlanConfig = {
    val __obj = js.Dynamic.literal(planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPlanConfig]
  }
  
  extension [Self <: DataPlanConfig](x: Self) {
    
    inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPlanVersion(value: Double): Self = StObject.set(x, "planVersion", value.asInstanceOf[js.Any])
    
    inline def setPlanVersionUndefined: Self = StObject.set(x, "planVersion", js.undefined)
  }
}
