package typings.prettier.mod

import typings.prettier.prettierBooleans.`false`
import typings.prettier.prettierStrings.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntSupportOption
  extends StObject
     with BaseSupportOption[int]
     with _SupportOption {
  
  var default: Double
  
  var array: js.UndefOr[`false`] = js.undefined
  
  var range: js.UndefOr[SupportOptionRange] = js.undefined
}
object IntSupportOption {
  
  inline def apply(category: String, default: Double, since: String): IntSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("int")
    __obj.asInstanceOf[IntSupportOption]
  }
  
  extension [Self <: IntSupportOption](x: Self) {
    
    inline def setArray(value: `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setRange(value: SupportOptionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
