package typings.prettier.mod

import typings.prettier.prettierBooleans.`false`
import typings.prettier.prettierStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanSupportOption
  extends BaseSupportOption[boolean]
     with _SupportOption {
  
  var array: js.UndefOr[`false`] = js.native
  
  var default: Boolean = js.native
  
  @JSName("description")
  var description_BooleanSupportOption: String = js.native
  
  var oppositeDescription: js.UndefOr[Boolean] = js.native
}
object BooleanSupportOption {
  
  @scala.inline
  def apply(category: String, default: Boolean, description: String, since: String, `type`: boolean): BooleanSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanSupportOption]
  }
  
  @scala.inline
  implicit class BooleanSupportOptionOps[Self <: BooleanSupportOption] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArray(value: `false`): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    
    @scala.inline
    def setOppositeDescription(value: Boolean): Self = this.set("oppositeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOppositeDescription: Self = this.set("oppositeDescription", js.undefined)
  }
}
