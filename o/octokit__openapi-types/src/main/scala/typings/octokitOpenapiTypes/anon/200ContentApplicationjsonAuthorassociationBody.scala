package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAuthorassociationBody` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAuthorassociationBody
  
  var `404`: Content48
}
object `200ContentApplicationjsonAuthorassociationBody` {
  
  inline def apply(`200`: ContentApplicationjsonAuthorassociationBody, `404`: Content48): `200ContentApplicationjsonAuthorassociationBody` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAuthorassociationBody`]
  }
  
  extension [Self <: `200ContentApplicationjsonAuthorassociationBody`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAuthorassociationBody): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
