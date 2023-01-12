package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `65` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRepositoriesTotalcount
}
object `65` {
  
  inline def apply(`200`: ContentApplicationjsonRepositoriesTotalcount): `65` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`65`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `65`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRepositoriesTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
