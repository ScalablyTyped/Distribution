package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.everyone
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.non_admins
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `447` extends StObject {
  
  /** @enum {string} */
  var from: off | non_admins | everyone
}
object `447` {
  
  inline def apply(from: off | non_admins | everyone): `447` = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[`447`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `447`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: off | non_admins | everyone): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
