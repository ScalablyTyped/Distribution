package typings.prettier.mod

import typings.prettier.anon.Description
import typings.prettier.anon.Since
import typings.prettier.prettierStrings.choice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChoiceSupportOption[Value] extends BaseSupportOption[choice] {
  
  var choices: js.Array[Description[Value]] = js.native
  
  var default: Value | js.Array[Since[Value]] = js.native
  
  @JSName("description")
  var description_ChoiceSupportOption: String = js.native
}
object ChoiceSupportOption {
  
  @scala.inline
  def apply[Value](
    category: String,
    choices: js.Array[Description[Value]],
    default: Value | js.Array[Since[Value]],
    description: String,
    since: String,
    `type`: choice
  ): ChoiceSupportOption[Value] = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceSupportOption[Value]]
  }
  
  @scala.inline
  implicit class ChoiceSupportOptionOps[Self <: ChoiceSupportOption[_], Value] (val x: Self with ChoiceSupportOption[Value]) extends AnyVal {
    
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
    def setChoicesVarargs(value: Description[Value]*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: js.Array[Description[Value]]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVarargs(value: Since[Value]*): Self = this.set("default", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: Value | js.Array[Since[Value]]): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
  }
}
