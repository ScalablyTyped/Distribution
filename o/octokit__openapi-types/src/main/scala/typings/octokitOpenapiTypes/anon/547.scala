package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `547` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonInreplytoid
}
object `547` {
  
  inline def apply(`200`: ContentApplicationjsonInreplytoid): `547` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`547`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `547`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonInreplytoid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
