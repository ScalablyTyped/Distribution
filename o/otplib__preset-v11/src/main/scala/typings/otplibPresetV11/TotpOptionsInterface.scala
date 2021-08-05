package typings.otplibPresetV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotpOptionsInterface
  extends StObject
     with HotpOptionsInterface {
  
  var epoch: js.UndefOr[js.Any] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var window: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object TotpOptionsInterface {
  
  inline def apply(): TotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotpOptionsInterface]
  }
  
  extension [Self <: TotpOptionsInterface](x: Self) {
    
    inline def setEpoch(value: js.Any): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setWindow(value: Double | js.Array[Double]): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    inline def setWindowVarargs(value: Double*): Self = StObject.set(x, "window", js.Array(value :_*))
  }
}
