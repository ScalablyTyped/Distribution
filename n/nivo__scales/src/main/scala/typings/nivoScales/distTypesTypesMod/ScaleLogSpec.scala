package typings.nivoScales.distTypesTypesMod

import typings.nivoScales.nivoScalesStrings.auto
import typings.nivoScales.nivoScalesStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleLogSpec extends StObject {
  
  var base: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[auto | Double] = js.undefined
  
  var min: js.UndefOr[auto | Double] = js.undefined
  
  var `type`: log
}
object ScaleLogSpec {
  
  inline def apply(): ScaleLogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[ScaleLogSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleLogSpec] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setMax(value: auto | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: auto | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
