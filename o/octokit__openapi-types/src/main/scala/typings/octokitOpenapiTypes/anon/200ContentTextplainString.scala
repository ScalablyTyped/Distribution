package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentTextplainString` extends StObject {
  
  /** Response */
  var `200`: ContentTextplainString
}
object `200ContentTextplainString` {
  
  inline def apply(`200`: ContentTextplainString): `200ContentTextplainString` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentTextplainString`]
  }
  
  extension [Self <: `200ContentTextplainString`](x: Self) {
    
    inline def set200(value: ContentTextplainString): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
