package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAuthorscount` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAuthorscount
  
  var `404`: Content55
}
object `200ContentApplicationjsonAuthorscount` {
  
  inline def apply(`200`: ContentApplicationjsonAuthorscount, `404`: Content55): `200ContentApplicationjsonAuthorscount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAuthorscount`]
  }
  
  extension [Self <: `200ContentApplicationjsonAuthorscount`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAuthorscount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
