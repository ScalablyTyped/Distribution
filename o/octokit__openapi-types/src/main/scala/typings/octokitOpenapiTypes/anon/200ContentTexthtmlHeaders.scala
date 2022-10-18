package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentTexthtmlHeaders` extends StObject {
  
  /** Response */
  var `200`: ContentTexthtmlHeaders
  
  var `304`: Any
}
object `200ContentTexthtmlHeaders` {
  
  inline def apply(`200`: ContentTexthtmlHeaders, `304`: Any): `200ContentTexthtmlHeaders` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentTexthtmlHeaders`]
  }
  
  extension [Self <: `200ContentTexthtmlHeaders`](x: Self) {
    
    inline def set200(value: ContentTexthtmlHeaders): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
