package typings.nouislider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePips extends StObject {
  
  var density: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[PipsFilter] = js.undefined
  
  var format: js.UndefOr[PartialFormatter] = js.undefined
  
  var mode: PipsMode
}
object BasePips {
  
  inline def apply(mode: PipsMode): BasePips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePips]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasePips] (val x: Self) extends AnyVal {
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setFilter(value: (/* value */ Double, /* type */ PipsType) => PipsType): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFormat(value: PartialFormatter): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMode(value: PipsMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
