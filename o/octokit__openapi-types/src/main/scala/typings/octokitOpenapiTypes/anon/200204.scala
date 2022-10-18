package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200204` extends StObject {
  
  /** For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits. */
  var `200`: Content184
  
  var `204`: Any
}
object `200204` {
  
  inline def apply(`200`: Content184, `204`: Any): `200204` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200204`]
  }
  
  extension [Self <: `200204`](x: Self) {
    
    inline def set200(value: Content184): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set204(value: Any): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
  }
}
