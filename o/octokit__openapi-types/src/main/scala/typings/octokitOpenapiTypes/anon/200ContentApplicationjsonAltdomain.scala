package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAltdomain` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonAltdomain
  
  /** @description Empty response */
  var `202`: ContentApplicationjsonRecord
  
  var `404`: Content41
}
object `200ContentApplicationjsonAltdomain` {
  
  inline def apply(`200`: ContentApplicationjsonAltdomain, `202`: ContentApplicationjsonRecord, `404`: Content41): `200ContentApplicationjsonAltdomain` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAltdomain`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonAltdomain`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAltdomain): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjsonRecord): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
