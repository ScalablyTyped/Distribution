package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonJobs
}
object `160` {
  
  inline def apply(`200`: ContentApplicationjsonJobs): `160` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`160`]
  }
  
  extension [Self <: `160`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonJobs): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
