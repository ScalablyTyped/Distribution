package typings.prettier.mod

import typings.prettier.prettierBooleans.`false`
import typings.prettier.prettierStrings.int
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntSupportOption
  extends BaseSupportOption[int]
     with _SupportOption {
  
  var array: js.UndefOr[`false`] = js.native
  
  var default: Double = js.native
  
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
  implicit class IntSupportOptionOps[Self <: IntSupportOption] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: Double): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArray(value: `false`): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    
    @scala.inline
    def setRange(value: SupportOptionRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
