package typings.prettier.mod

import typings.prettier.anon.Value
import typings.prettier.prettierBooleans.`true`
import typings.prettier.prettierStrings.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntArraySupportOption
  extends BaseSupportOption[int]
     with _SupportOption {
  
  var default: js.Array[Value] = js.native
  
  var array: `true` = js.native
}
object IntArraySupportOption {
  
  @scala.inline
  def apply(array: `true`, category: String, default: js.Array[Value], since: String, `type`: int): IntArraySupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
