package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonPreferencesRepository` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonPreferencesRepository
}
object `200ContentApplicationjsonPreferencesRepository` {
  
  inline def apply(`200`: ContentApplicationjsonPreferencesRepository): `200ContentApplicationjsonPreferencesRepository` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonPreferencesRepository`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonPreferencesRepository`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonPreferencesRepository): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
