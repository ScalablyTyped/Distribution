package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emax extends StObject {
  
  var emax: js.UndefOr[Double] = js.undefined
  
  var emin: js.UndefOr[Double] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var rounding: js.UndefOr[Double] = js.undefined
}
object Emax {
  
  inline def apply(): Emax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Emax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Emax] (val x: Self) extends AnyVal {
    
    inline def setEmax(value: Double): Self = StObject.set(x, "emax", value.asInstanceOf[js.Any])
    
    inline def setEmaxUndefined: Self = StObject.set(x, "emax", js.undefined)
    
    inline def setEmin(value: Double): Self = StObject.set(x, "emin", value.asInstanceOf[js.Any])
    
    inline def setEminUndefined: Self = StObject.set(x, "emin", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRounding(value: Double): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
  }
}
