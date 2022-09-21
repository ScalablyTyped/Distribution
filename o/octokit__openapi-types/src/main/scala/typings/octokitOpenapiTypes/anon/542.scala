package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `542` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAuthorscount
}
object `542` {
  
  inline def apply(`200`: ContentApplicationjsonAuthorscount): `542` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`542`]
  }
  
  extension [Self <: `542`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAuthorscount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
