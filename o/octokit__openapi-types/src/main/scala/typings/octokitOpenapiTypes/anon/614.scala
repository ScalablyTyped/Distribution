package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `614` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonInreplytoid
}
object `614` {
  
  inline def apply(`200`: ContentApplicationjsonInreplytoid): `614` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`614`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `614`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonInreplytoid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
