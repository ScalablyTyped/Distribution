package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content559` extends StObject {
  
  /** Returns a weekly aggregate of the number of additions and deletions pushed to a repository. */
  var `200`: Content559
  
  var `202`: Content40
  
  var `204`: Any
}
object `200Content559` {
  
  inline def apply(`200`: Content559, `202`: Content40, `204`: Any): `200Content559` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content559`]
  }
  
  extension [Self <: `200Content559`](x: Self) {
    
    inline def set200(value: Content559): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(value: Content40): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set204(value: Any): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
  }
}
