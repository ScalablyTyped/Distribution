package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.commit_message_pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `509` extends StObject {
  
  var parameters: js.UndefOr[Negate] = js.undefined
  
  /** @enum {string} */
  var `type`: commit_message_pattern
}
object `509` {
  
  inline def apply(): `509` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commit_message_pattern")
    __obj.asInstanceOf[`509`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `509`] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Negate): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: commit_message_pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
