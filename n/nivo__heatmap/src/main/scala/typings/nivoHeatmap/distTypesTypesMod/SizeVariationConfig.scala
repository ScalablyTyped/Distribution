package typings.nivoHeatmap.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeVariationConfig extends StObject {
  
  var sizes: js.Tuple2[/* min */ Double, /* max */ Double]
  
  var values: js.UndefOr[js.Tuple2[/* min */ Double, /* max */ Double]] = js.undefined
}
object SizeVariationConfig {
  
  inline def apply(sizes: js.Tuple2[/* min */ Double, /* max */ Double]): SizeVariationConfig = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeVariationConfig]
  }
  
  extension [Self <: SizeVariationConfig](x: Self) {
    
    inline def setSizes(value: js.Tuple2[/* min */ Double, /* max */ Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Tuple2[/* min */ Double, /* max */ Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
