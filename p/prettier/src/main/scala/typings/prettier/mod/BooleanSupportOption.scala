package typings.prettier.mod

import typings.prettier.prettierBooleans.`false`
import typings.prettier.prettierStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanSupportOption
  extends BaseSupportOption[boolean]
     with _SupportOption {
  
  var default: Boolean = js.native
  
  var array: js.UndefOr[`false`] = js.native
  
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
  implicit class BooleanSupportOptionMutableBuilder[Self <: BooleanSupportOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOppositeDescription(value: Boolean): Self = StObject.set(x, "oppositeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOppositeDescriptionUndefined: Self = StObject.set(x, "oppositeDescription", js.undefined)
  }
}
