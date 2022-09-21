package typings.nivoScales.typesMod

import typings.nivoScales.nivoScalesStrings.auto
import typings.nivoScales.nivoScalesStrings.symlog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleSymlogSpec extends StObject {
  
  var constant: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[auto | Double] = js.undefined
  
  var min: js.UndefOr[auto | Double] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var `type`: symlog
}
object ScaleSymlogSpec {
  
  inline def apply(): ScaleSymlogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("symlog")
    __obj.asInstanceOf[ScaleSymlogSpec]
  }
  
  extension [Self <: ScaleSymlogSpec](x: Self) {
    
    inline def setConstant(value: Double): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
    
    inline def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
    
    inline def setMax(value: auto | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: auto | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setType(value: symlog): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
