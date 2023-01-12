package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandMax extends StObject {
  
  var randMax: js.UndefOr[Double] = js.undefined
  
  var randMin: js.UndefOr[Double] = js.undefined
}
object RandMax {
  
  inline def apply(): RandMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandMax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RandMax] (val x: Self) extends AnyVal {
    
    inline def setRandMax(value: Double): Self = StObject.set(x, "randMax", value.asInstanceOf[js.Any])
    
    inline def setRandMaxUndefined: Self = StObject.set(x, "randMax", js.undefined)
    
    inline def setRandMin(value: Double): Self = StObject.set(x, "randMin", value.asInstanceOf[js.Any])
    
    inline def setRandMinUndefined: Self = StObject.set(x, "randMin", js.undefined)
  }
}
