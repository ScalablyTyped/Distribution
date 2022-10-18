package typings.prettier.mod

import typings.prettier.anon.ValueArray
import typings.prettier.prettierBooleans.`true`
import typings.prettier.prettierStrings.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntArraySupportOption
  extends StObject
     with BaseSupportOption[int]
     with _SupportOption {
  
  var default: js.UndefOr[js.Array[ValueArray]] = js.undefined
  
  var array: `true`
}
object IntArraySupportOption {
  
  inline def apply(category: String, since: String): IntArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("int")
    __obj.asInstanceOf[IntArraySupportOption]
  }
  
  extension [Self <: IntArraySupportOption](x: Self) {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: js.Array[ValueArray]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: ValueArray*): Self = StObject.set(x, "default", js.Array(value*))
  }
}
