package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Margin> */
trait PartialMargin extends StObject {
  
  var b: js.UndefOr[Double] = js.undefined
  
  var l: js.UndefOr[Double] = js.undefined
  
  var pad: js.UndefOr[Double] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
  
  var t: js.UndefOr[Double] = js.undefined
}
object PartialMargin {
  
  inline def apply(): PartialMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMargin]
  }
  
  extension [Self <: PartialMargin](x: Self) {
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    inline def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
