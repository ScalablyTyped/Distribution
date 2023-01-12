package typings.prettier.mod

import typings.prettier.prettierBooleans.`false`
import typings.prettier.prettierStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanSupportOption
  extends StObject
     with BaseSupportOption[boolean]
     with _SupportOption {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  var array: js.UndefOr[`false`] = js.undefined
  
  @JSName("description")
  var description_BooleanSupportOption: String
  
  var oppositeDescription: js.UndefOr[String] = js.undefined
}
object BooleanSupportOption {
  
  inline def apply(category: String, description: String, since: String): BooleanSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[BooleanSupportOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooleanSupportOption] (val x: Self) extends AnyVal {
    
    inline def setArray(value: `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setOppositeDescription(value: String): Self = StObject.set(x, "oppositeDescription", value.asInstanceOf[js.Any])
    
    inline def setOppositeDescriptionUndefined: Self = StObject.set(x, "oppositeDescription", js.undefined)
  }
}
