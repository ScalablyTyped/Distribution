package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Billable extends StObject {
  
  var billable: UBUNTU
  
  var run_duration_ms: js.UndefOr[Double] = js.undefined
}
object Billable {
  
  inline def apply(billable: UBUNTU): Billable = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Billable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Billable] (val x: Self) extends AnyVal {
    
    inline def setBillable(value: UBUNTU): Self = StObject.set(x, "billable", value.asInstanceOf[js.Any])
    
    inline def setRun_duration_ms(value: Double): Self = StObject.set(x, "run_duration_ms", value.asInstanceOf[js.Any])
    
    inline def setRun_duration_msUndefined: Self = StObject.set(x, "run_duration_ms", js.undefined)
  }
}
