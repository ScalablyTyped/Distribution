package typings.prettier.mod

import typings.prettier.prettierBooleans.`false`
import typings.prettier.prettierStrings.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntSupportOption
  extends BaseSupportOption[int]
     with _SupportOption {
  
  var default: Double = js.native
  
  var array: js.UndefOr[`false`] = js.native
  
  var range: js.UndefOr[SupportOptionRange] = js.native
}
object IntSupportOption {
  
  @scala.inline
  def apply(category: String, default: Double, since: String, `type`: int): IntSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntSupportOption]
  }
  
  @scala.inline
  implicit class IntSupportOptionMutableBuilder[Self <: IntSupportOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    @scala.inline
    def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: SupportOptionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
