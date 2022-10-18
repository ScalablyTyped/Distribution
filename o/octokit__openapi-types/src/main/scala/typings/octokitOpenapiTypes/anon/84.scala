package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `84` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonJobs
}
object `84` {
  
  inline def apply(`200`: ContentApplicationjsonJobs): `84` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`84`]
  }
  
  extension [Self <: `84`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonJobs): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
