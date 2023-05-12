package typings.nivoAxes.anon

import typings.nivoAxes.distTypesTypesMod.CanvasAxisProps
import typings.nivoCore.mod.CompleteTheme
import typings.nivoScales.distTypesTypesMod.AnyScale
import typings.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom[X /* <: ScaleValue */, Y /* <: ScaleValue */] extends StObject {
  
  var bottom: js.UndefOr[CanvasAxisProps[X] | Null] = js.undefined
  
  var height: Double
  
  var left: js.UndefOr[CanvasAxisProps[Y] | Null] = js.undefined
  
  var right: js.UndefOr[CanvasAxisProps[Y] | Null] = js.undefined
  
  var theme: CompleteTheme
  
  var top: js.UndefOr[CanvasAxisProps[X] | Null] = js.undefined
  
  var width: Double
  
  var xScale: AnyScale
  
  var yScale: AnyScale
}
object Bottom {
  
  inline def apply[X /* <: ScaleValue */, Y /* <: ScaleValue */](height: Double, theme: CompleteTheme, width: Double, xScale: AnyScale, yScale: AnyScale): Bottom[X, Y] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom[X, Y]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bottom[?, ?], X /* <: ScaleValue */, Y /* <: ScaleValue */] (val x: Self & (Bottom[X, Y])) extends AnyVal {
    
    inline def setBottom(value: CanvasAxisProps[X]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomNull: Self = StObject.set(x, "bottom", null)
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: CanvasAxisProps[Y]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftNull: Self = StObject.set(x, "left", null)
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: CanvasAxisProps[Y]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightNull: Self = StObject.set(x, "right", null)
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTop(value: CanvasAxisProps[X]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopNull: Self = StObject.set(x, "top", null)
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXScale(value: AnyScale): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setYScale(value: AnyScale): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
  }
}
