package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `491` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonHeadcommit
}
object `491` {
  
  inline def apply(`200`: ContentApplicationjsonHeadcommit): `491` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`491`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `491`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonHeadcommit): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
