package typings.prettier.mod

import typings.prettier.anon.ValueArray
import typings.prettier.prettierBooleans.`true`
import typings.prettier.prettierStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanArraySupportOption
  extends StObject
     with BaseSupportOption[boolean]
     with _SupportOption {
  
  var default: js.Array[ValueArray]
  
  var array: `true`
}
object BooleanArraySupportOption {
  
  inline def apply(category: String, default: js.Array[ValueArray], since: String): BooleanArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[BooleanArraySupportOption]
  }
  
  extension [Self <: BooleanArraySupportOption](x: Self) {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: js.Array[ValueArray]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultVarargs(value: ValueArray*): Self = StObject.set(x, "default", js.Array(value :_*))
  }
}
