package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRepositoriesTotalcount` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRepositoriesTotalcount
  
  var `404`: Content6
}
object `200ContentApplicationjsonRepositoriesTotalcount` {
  
  inline def apply(`200`: ContentApplicationjsonRepositoriesTotalcount, `404`: Content6): `200ContentApplicationjsonRepositoriesTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRepositoriesTotalcount`]
  }
  
  extension [Self <: `200ContentApplicationjsonRepositoriesTotalcount`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRepositoriesTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
