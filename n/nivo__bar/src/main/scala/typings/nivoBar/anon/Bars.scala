package typings.nivoBar.anon

import typings.d3Scale.mod.NumberValue
import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.distTypesTypesMod.ComputedBarDatum
import typings.nivoScales.distTypesTypesMod.ScaleBand
import typings.nivoScales.distTypesTypesMod.ScaleLinear
import typings.nivoScales.distTypesTypesMod.ScaleLog
import typings.nivoScales.distTypesTypesMod.ScalePoint
import typings.nivoScales.distTypesTypesMod.ScaleSymlog
import typings.nivoScales.distTypesTypesMod.ScaleTime
import typings.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bars[RawDatum /* <: BarDatum */] extends StObject {
  
  var bars: js.Array[ComputedBarDatum[RawDatum]]
  
  var xScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
  
  var yScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
}
object Bars {
  
  inline def apply[RawDatum /* <: BarDatum */](
    bars: js.Array[ComputedBarDatum[RawDatum]],
    xScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue],
    yScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
  ): Bars[RawDatum] = {
    val __obj = js.Dynamic.literal(bars = bars.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bars[RawDatum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bars[?], RawDatum /* <: BarDatum */] (val x: Self & Bars[RawDatum]) extends AnyVal {
    
    inline def setBars(value: js.Array[ComputedBarDatum[RawDatum]]): Self = StObject.set(x, "bars", value.asInstanceOf[js.Any])
    
    inline def setBarsVarargs(value: ComputedBarDatum[RawDatum]*): Self = StObject.set(x, "bars", js.Array(value*))
    
    inline def setXScale(
      value: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
    ): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setYScale(
      value: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
    ): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
  }
}
