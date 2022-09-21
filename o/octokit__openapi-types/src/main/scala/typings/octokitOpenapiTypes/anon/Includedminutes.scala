package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includedminutes extends StObject {
  
  /** @description The amount of free GitHub Actions minutes available. */
  var included_minutes: Double
  
  var minutes_used_breakdown: MACOS
  
  /** @description The sum of the free and paid GitHub Actions minutes used. */
  var total_minutes_used: Double
  
  /** @description The total paid GitHub Actions minutes used. */
  var total_paid_minutes_used: Double
}
object Includedminutes {
  
  inline def apply(
    included_minutes: Double,
    minutes_used_breakdown: MACOS,
    total_minutes_used: Double,
    total_paid_minutes_used: Double
  ): Includedminutes = {
    val __obj = js.Dynamic.literal(included_minutes = included_minutes.asInstanceOf[js.Any], minutes_used_breakdown = minutes_used_breakdown.asInstanceOf[js.Any], total_minutes_used = total_minutes_used.asInstanceOf[js.Any], total_paid_minutes_used = total_paid_minutes_used.asInstanceOf[js.Any])
    __obj.asInstanceOf[Includedminutes]
  }
  
  extension [Self <: Includedminutes](x: Self) {
    
    inline def setIncluded_minutes(value: Double): Self = StObject.set(x, "included_minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutes_used_breakdown(value: MACOS): Self = StObject.set(x, "minutes_used_breakdown", value.asInstanceOf[js.Any])
    
    inline def setTotal_minutes_used(value: Double): Self = StObject.set(x, "total_minutes_used", value.asInstanceOf[js.Any])
    
    inline def setTotal_paid_minutes_used(value: Double): Self = StObject.set(x, "total_paid_minutes_used", value.asInstanceOf[js.Any])
  }
}
