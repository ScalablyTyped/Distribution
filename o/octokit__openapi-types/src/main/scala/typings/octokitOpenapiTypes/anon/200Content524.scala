package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content524` extends StObject {
  
  /** Response */
  var `200`: Content524
  
  var `301`: Content55
}
object `200Content524` {
  
  inline def apply(`200`: Content524, `301`: Content55): `200Content524` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content524`]
  }
  
  extension [Self <: `200Content524`](x: Self) {
    
    inline def set200(value: Content524): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content55): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
  }
}
