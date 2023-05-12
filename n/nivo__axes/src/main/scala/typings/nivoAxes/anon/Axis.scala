package typings.nivoAxes.anon

import typings.nivoAxes.distTypesTypesMod.AxisLegendPosition
import typings.nivoAxes.distTypesTypesMod.ValueFormatter
import typings.nivoAxes.nivoAxesStrings.after
import typings.nivoAxes.nivoAxesStrings.before
import typings.nivoAxes.nivoAxesStrings.x
import typings.nivoAxes.nivoAxesStrings.y
import typings.nivoCore.mod.CompleteTheme
import typings.nivoScales.distTypesTypesMod.AnyScale
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.nivoScales.distTypesTypesMod.TicksSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axis[Value /* <: ScaleValue */] extends StObject {
  
  var axis: x | y
  
  var format: js.UndefOr[String | ValueFormatter[Value]] = js.undefined
  
  var legend: js.UndefOr[String] = js.undefined
  
  var legendOffset: js.UndefOr[Double] = js.undefined
  
  var legendPosition: js.UndefOr[AxisLegendPosition] = js.undefined
  
  var length: Double
  
  var scale: AnyScale
  
  var theme: CompleteTheme
  
  var tickPadding: js.UndefOr[Double] = js.undefined
  
  var tickRotation: js.UndefOr[Double] = js.undefined
  
  var tickSize: js.UndefOr[Double] = js.undefined
  
  var tickValues: js.UndefOr[TicksSpec[Value]] = js.undefined
  
  var ticksPosition: before | after
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object Axis {
  
  inline def apply[Value /* <: ScaleValue */](axis: x | y, length: Double, scale: AnyScale, theme: CompleteTheme, ticksPosition: before | after): Axis[Value] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ticksPosition = ticksPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Axis[?], Value /* <: ScaleValue */] (val x: Self & Axis[Value]) extends AnyVal {
    
    inline def setAxis(value: typings.nivoAxes.nivoAxesStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String | ValueFormatter[Value]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: Value => Value | String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendOffset(value: Double): Self = StObject.set(x, "legendOffset", value.asInstanceOf[js.Any])
    
    inline def setLegendOffsetUndefined: Self = StObject.set(x, "legendOffset", js.undefined)
    
    inline def setLegendPosition(value: AxisLegendPosition): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setScale(value: AnyScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTickPadding(value: Double): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
    
    inline def setTickPaddingUndefined: Self = StObject.set(x, "tickPadding", js.undefined)
    
    inline def setTickRotation(value: Double): Self = StObject.set(x, "tickRotation", value.asInstanceOf[js.Any])
    
    inline def setTickRotationUndefined: Self = StObject.set(x, "tickRotation", js.undefined)
    
    inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
    
    inline def setTickValues(value: TicksSpec[Value]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
    inline def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
    
    inline def setTickValuesVarargs(value: Value*): Self = StObject.set(x, "tickValues", js.Array(value*))
    
    inline def setTicksPosition(value: before | after): Self = StObject.set(x, "ticksPosition", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
