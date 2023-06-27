package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.required_signatures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `505` extends StObject {
  
  /** @enum {string} */
  var `type`: required_signatures
}
object `505` {
  
  inline def apply(): `505` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("required_signatures")
    __obj.asInstanceOf[`505`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `505`] (val x: Self) extends AnyVal {
    
    inline def setType(value: required_signatures): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
