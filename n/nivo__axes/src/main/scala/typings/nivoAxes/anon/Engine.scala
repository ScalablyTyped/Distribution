package typings.nivoAxes.anon

import typings.nivoAxes.nivoAxesStrings.after
import typings.nivoAxes.nivoAxesStrings.before
import typings.nivoAxes.nivoAxesStrings.canvas
import typings.nivoAxes.nivoAxesStrings.svg
import typings.nivoAxes.nivoAxesStrings.x
import typings.nivoAxes.nivoAxesStrings.y
import typings.nivoScales.distTypesTypesMod.AnyScale
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.nivoScales.distTypesTypesMod.TicksSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Engine[Value /* <: ScaleValue */] extends StObject {
  
  var axis: x | y
  
  var engine: js.UndefOr[svg | canvas] = js.undefined
  
  var scale: AnyScale
  
  var tickPadding: Double
  
  var tickRotation: Double
  
  var tickSize: Double
  
  var tickValues: js.UndefOr[TicksSpec[Value]] = js.undefined
  
  var ticksPosition: js.UndefOr[before | after] = js.undefined
}
object Engine {
  
  inline def apply[Value /* <: ScaleValue */](axis: x | y, scale: AnyScale, tickPadding: Double, tickRotation: Double, tickSize: Double): Engine[Value] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tickPadding = tickPadding.asInstanceOf[js.Any], tickRotation = tickRotation.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Engine[?], Value /* <: ScaleValue */] (val x: Self & Engine[Value]) extends AnyVal {
    
    inline def setAxis(value: typings.nivoAxes.nivoAxesStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: svg | canvas): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setScale(value: AnyScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTickPadding(value: Double): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
    
    inline def setTickRotation(value: Double): Self = StObject.set(x, "tickRotation", value.asInstanceOf[js.Any])
    
    inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    inline def setTickValues(value: TicksSpec[Value]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
    inline def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
    
    inline def setTickValuesVarargs(value: Value*): Self = StObject.set(x, "tickValues", js.Array(value*))
    
    inline def setTicksPosition(value: before | after): Self = StObject.set(x, "ticksPosition", value.asInstanceOf[js.Any])
    
    inline def setTicksPositionUndefined: Self = StObject.set(x, "ticksPosition", js.undefined)
  }
}
