package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `600` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonContactemail
}
object `600` {
  
  inline def apply(`200`: ContentApplicationjsonContactemail): `600` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`600`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `600`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonContactemail): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
