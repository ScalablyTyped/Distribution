package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204` extends StObject {
  
  /** Returns a weekly aggregate of the number of additions and deletions pushed to a repository. */
  var `200`: Content184
  
  var `202`: Content4
  
  var `204`: Any
}
object `204` {
  
  inline def apply(`200`: Content184, `202`: Content4, `204`: Any): `204` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`204`]
  }
  
  extension [Self <: `204`](x: Self) {
    
    inline def set200(value: Content184): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(value: Content4): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set204(value: Any): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
  }
}
