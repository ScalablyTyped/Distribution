package typings.prettier.mod

import typings.prettier.anon.Description
import typings.prettier.anon.Since
import typings.prettier.prettierStrings.choice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceSupportOption[Value]
  extends StObject
     with BaseSupportOption[choice] {
  
  var default: Value | js.Array[Since[Value]]
  
  var choices: js.Array[Description[Value]]
  
  @JSName("description")
  var description_ChoiceSupportOption: String
}
object ChoiceSupportOption {
  
  @scala.inline
  def apply[Value](
    category: String,
    choices: js.Array[Description[Value]],
    default: Value | js.Array[Since[Value]],
    description: String,
    since: String
  ): ChoiceSupportOption[Value] = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("choice")
    __obj.asInstanceOf[ChoiceSupportOption[Value]]
  }
  
  @scala.inline
  implicit class ChoiceSupportOptionMutableBuilder[Self <: ChoiceSupportOption[?], Value] (val x: Self & ChoiceSupportOption[Value]) extends AnyVal {
    
    @scala.inline
    def setChoices(value: js.Array[Description[Value]]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoicesVarargs(value: Description[Value]*): Self = StObject.set(x, "choices", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: Value | js.Array[Since[Value]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVarargs(value: Since[Value]*): Self = StObject.set(x, "default", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
