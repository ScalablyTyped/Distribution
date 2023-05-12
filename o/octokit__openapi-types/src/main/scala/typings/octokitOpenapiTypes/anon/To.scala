package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait To extends StObject {
  
  /** @enum {string} */
  var to: write | admin | read
}
object To {
  
  inline def apply(to: write | admin | read): To = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: To] (val x: Self) extends AnyVal {
    
    inline def setTo(value: write | admin | read): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
