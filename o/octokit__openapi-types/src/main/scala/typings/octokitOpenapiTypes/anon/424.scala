package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deletion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `424` extends StObject {
  
  /** @enum {string} */
  var `type`: deletion
}
object `424` {
  
  inline def apply(): `424` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("deletion")
    __obj.asInstanceOf[`424`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `424`] (val x: Self) extends AnyVal {
    
    inline def setType(value: deletion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
