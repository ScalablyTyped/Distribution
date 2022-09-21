package typings.momentMini.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait argThresholdOpts extends StObject {
  
  var M: js.UndefOr[Double] = js.undefined
  
  var d: js.UndefOr[Double] = js.undefined
  
  var h: js.UndefOr[Double] = js.undefined
  
  var m: js.UndefOr[Double] = js.undefined
  
  var s: js.UndefOr[Double] = js.undefined
  
  var ss: js.UndefOr[Double] = js.undefined
  
  var w: js.UndefOr[Double | Unit] = js.undefined
}
object argThresholdOpts {
  
  inline def apply(): argThresholdOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[argThresholdOpts]
  }
  
  extension [Self <: argThresholdOpts](x: Self) {
    
    inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setM(value: Double): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
    
    inline def setMUndefined: Self = StObject.set(x, "M", js.undefined)
    
    inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSs(value: Double): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
    
    inline def setSsUndefined: Self = StObject.set(x, "ss", js.undefined)
    
    inline def setW(value: Double | Unit): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
  }
}
