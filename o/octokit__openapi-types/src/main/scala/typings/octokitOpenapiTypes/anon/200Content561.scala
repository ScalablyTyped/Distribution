package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content561` extends StObject {
  
  /** Response */
  var `200`: Content561
  
  var `202`: Content40
  
  var `204`: Any
}
object `200Content561` {
  
  inline def apply(`200`: Content561, `202`: Content40, `204`: Any): `200Content561` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content561`]
  }
  
  extension [Self <: `200Content561`](x: Self) {
    
    inline def set200(value: Content561): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(value: Content40): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set204(value: Any): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
  }
}
