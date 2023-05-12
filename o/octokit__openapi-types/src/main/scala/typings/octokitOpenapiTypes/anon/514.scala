package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `514` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonContactemail
}
object `514` {
  
  inline def apply(`200`: ContentApplicationjsonContactemail): `514` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`514`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `514`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonContactemail): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
