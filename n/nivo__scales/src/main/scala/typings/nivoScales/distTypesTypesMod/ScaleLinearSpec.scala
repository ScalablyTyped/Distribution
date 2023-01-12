package typings.nivoScales.distTypesTypesMod

import typings.nivoScales.nivoScalesStrings.auto
import typings.nivoScales.nivoScalesStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleLinearSpec extends StObject {
  
  var clamp: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[auto | Double] = js.undefined
  
  var min: js.UndefOr[auto | Double] = js.undefined
  
  var nice: js.UndefOr[Boolean | Double] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var stacked: js.UndefOr[Boolean] = js.undefined
  
  var `type`: linear
}
object ScaleLinearSpec {
  
  inline def apply(): ScaleLinearSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linear")
    __obj.asInstanceOf[ScaleLinearSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleLinearSpec] (val x: Self) extends AnyVal {
    
    inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    inline def setMax(value: auto | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: auto | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNice(value: Boolean | Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    inline def setType(value: linear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
