package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentHeaders` extends StObject {
  
  /** Response */
  var `200`: ContentHeaders
}
object `200ContentHeaders` {
  
  inline def apply(`200`: ContentHeaders): `200ContentHeaders` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentHeaders`]
  }
  
  extension [Self <: `200ContentHeaders`](x: Self) {
    
    inline def set200(value: ContentHeaders): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
