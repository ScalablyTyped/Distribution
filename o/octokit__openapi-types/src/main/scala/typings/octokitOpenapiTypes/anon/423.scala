package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.creation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `423` extends StObject {
  
  /** @enum {string} */
  var `type`: creation
}
object `423` {
  
  inline def apply(): `423` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("creation")
    __obj.asInstanceOf[`423`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `423`] (val x: Self) extends AnyVal {
    
    inline def setType(value: creation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
