package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `741` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonInreplytoid
}
object `741` {
  
  inline def apply(`200`: ContentApplicationjsonInreplytoid): `741` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`741`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `741`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonInreplytoid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
