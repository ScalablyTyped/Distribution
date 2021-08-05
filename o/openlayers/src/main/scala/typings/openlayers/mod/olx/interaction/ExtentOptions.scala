package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Feature
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtentOptions extends StObject {
  
  var boxStyle: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  
  var extent: js.UndefOr[Extent_] = js.undefined
  
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  
  var pointerStyle: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object ExtentOptions {
  
  inline def apply(): ExtentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtentOptions]
  }
  
  extension [Self <: ExtentOptions](x: Self) {
    
    inline def setBoxStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "boxStyle", value.asInstanceOf[js.Any])
    
    inline def setBoxStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "boxStyle", js.Any.fromFunction2(value))
    
    inline def setBoxStyleUndefined: Self = StObject.set(x, "boxStyle", js.undefined)
    
    inline def setBoxStyleVarargs(value: Style*): Self = StObject.set(x, "boxStyle", js.Array(value :_*))
    
    inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
    
    inline def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
    
    inline def setPointerStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "pointerStyle", value.asInstanceOf[js.Any])
    
    inline def setPointerStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "pointerStyle", js.Any.fromFunction2(value))
    
    inline def setPointerStyleUndefined: Self = StObject.set(x, "pointerStyle", js.undefined)
    
    inline def setPointerStyleVarargs(value: Style*): Self = StObject.set(x, "pointerStyle", js.Array(value :_*))
    
    inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
