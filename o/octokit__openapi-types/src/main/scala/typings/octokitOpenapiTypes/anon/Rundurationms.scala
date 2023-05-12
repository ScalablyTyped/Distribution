package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rundurationms extends StObject {
  
  var billable: WINDOWS
  
  var run_duration_ms: js.UndefOr[Double] = js.undefined
}
object Rundurationms {
  
  inline def apply(billable: WINDOWS): Rundurationms = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rundurationms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rundurationms] (val x: Self) extends AnyVal {
    
    inline def setBillable(value: WINDOWS): Self = StObject.set(x, "billable", value.asInstanceOf[js.Any])
    
    inline def setRun_duration_ms(value: Double): Self = StObject.set(x, "run_duration_ms", value.asInstanceOf[js.Any])
    
    inline def setRun_duration_msUndefined: Self = StObject.set(x, "run_duration_ms", js.undefined)
  }
}
