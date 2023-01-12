package typings.nivoScales.anon

import typings.nivoScales.distTypesTypesMod.ScaleAxis
import typings.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetValue[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */] extends StObject {
  
  var getValue: js.UndefOr[js.Function1[/* d */ DataRecord[Axis, Value], Value | Null]] = js.undefined
  
  var setValue: js.UndefOr[js.Function2[/* d */ DataRecord[Axis, Value], /* v */ Value, Unit]] = js.undefined
}
object GetValue {
  
  inline def apply[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](): GetValue[Axis, Value] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetValue[Axis, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetValue[?, ?], Axis /* <: ScaleAxis */, Value /* <: ScaleValue */] (val x: Self & (GetValue[Axis, Value])) extends AnyVal {
    
    inline def setGetValue(value: /* d */ DataRecord[Axis, Value] => Value | Null): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setSetValue(value: (/* d */ DataRecord[Axis, Value], /* v */ Value) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
