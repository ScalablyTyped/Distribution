package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `479` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonJobsTotalcount
}
object `479` {
  
  inline def apply(`200`: ContentApplicationjsonJobsTotalcount): `479` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`479`]
  }
  
  extension [Self <: `479`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonJobsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
