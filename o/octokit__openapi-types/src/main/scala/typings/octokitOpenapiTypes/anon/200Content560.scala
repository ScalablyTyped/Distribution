package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content560` extends StObject {
  
  /** Response */
  var `200`: Content560
  
  var `202`: Content40
  
  var `204`: Any
}
object `200Content560` {
  
  inline def apply(`200`: Content560, `202`: Content40, `204`: Any): `200Content560` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content560`]
  }
  
  extension [Self <: `200Content560`](x: Self) {
    
    inline def set200(value: Content560): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(value: Content40): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set204(value: Any): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
  }
}
