package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonHeadcommit` extends StObject {
  
  /** Response when the suite already exists */
  var `200`: ContentApplicationjsonHeadcommit
  
  /** Response when the suite was created */
  var `201`: ContentApplicationjsonHeadcommit
}
object `200ContentApplicationjsonHeadcommit` {
  
  inline def apply(`200`: ContentApplicationjsonHeadcommit, `201`: ContentApplicationjsonHeadcommit): `200ContentApplicationjsonHeadcommit` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonHeadcommit`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonHeadcommit`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonHeadcommit): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: ContentApplicationjsonHeadcommit): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
