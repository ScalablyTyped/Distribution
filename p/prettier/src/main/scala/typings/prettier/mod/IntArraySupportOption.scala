package typings.prettier.mod

import typings.prettier.anon.Value
import typings.prettier.prettierBooleans.`true`
import typings.prettier.prettierStrings.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntArraySupportOption
  extends StObject
     with BaseSupportOption[int]
     with _SupportOption {
  
  var default: js.Array[Value]
  
  var array: `true`
}
object IntArraySupportOption {
  
  @scala.inline
  def apply(category: String, default: js.Array[Value], since: String): IntArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("int")
    __obj.asInstanceOf[IntArraySupportOption]
  }
  
  @scala.inline
  implicit class IntArraySupportOptionMutableBuilder[Self <: IntArraySupportOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: js.Array[Value]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVarargs(value: Value*): Self = StObject.set(x, "default", js.Array(value :_*))
  }
}
