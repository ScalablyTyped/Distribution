package typings.prettier.mod

import typings.prettier.anon.ValueArray
import typings.prettier.prettierBooleans.`true`
import typings.prettier.prettierStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanArraySupportOption
  extends BaseSupportOption[boolean]
     with _SupportOption {
  
  var array: `true` = js.native
  
  var default: js.Array[ValueArray] = js.native
}
object BooleanArraySupportOption {
  
  @scala.inline
  def apply(array: `true`, category: String, default: js.Array[ValueArray], since: String, `type`: boolean): BooleanArraySupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanArraySupportOption]
  }
  
  @scala.inline
  implicit class BooleanArraySupportOptionOps[Self <: BooleanArraySupportOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArray(value: `true`): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVarargs(value: ValueArray*): Self = this.set("default", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: js.Array[ValueArray]): Self = this.set("default", value.asInstanceOf[js.Any])
  }
}
