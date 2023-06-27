package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deletion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `501` extends StObject {
  
  /** @enum {string} */
  var `type`: deletion
}
object `501` {
  
  inline def apply(): `501` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("deletion")
    __obj.asInstanceOf[`501`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `501`] (val x: Self) extends AnyVal {
    
    inline def setType(value: deletion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
