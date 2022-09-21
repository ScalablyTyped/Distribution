package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content580` extends StObject {
  
  /** Response */
  var `200`: Content580
  
  var `202`: Content47
  
  var `204`: Any
}
object `200Content580` {
  
  inline def apply(`200`: Content580, `202`: Content47, `204`: Any): `200Content580` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content580`]
  }
  
  extension [Self <: `200Content580`](x: Self) {
    
    inline def set200(value: Content580): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(value: Content47): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set204(value: Any): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
  }
}
