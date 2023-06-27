package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.creation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `499` extends StObject {
  
  /** @enum {string} */
  var `type`: creation
}
object `499` {
  
  inline def apply(): `499` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("creation")
    __obj.asInstanceOf[`499`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `499`] (val x: Self) extends AnyVal {
    
    inline def setType(value: creation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
