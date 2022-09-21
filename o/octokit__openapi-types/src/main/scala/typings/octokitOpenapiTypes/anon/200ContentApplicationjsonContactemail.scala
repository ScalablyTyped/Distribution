package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonContactemail` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonContactemail
  
  var `404`: Content55
}
object `200ContentApplicationjsonContactemail` {
  
  inline def apply(`200`: ContentApplicationjsonContactemail, `404`: Content55): `200ContentApplicationjsonContactemail` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonContactemail`]
  }
  
  extension [Self <: `200ContentApplicationjsonContactemail`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonContactemail): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
