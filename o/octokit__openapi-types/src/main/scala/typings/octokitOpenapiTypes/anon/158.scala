package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonJobs
}
object `158` {
  
  inline def apply(`200`: ContentApplicationjsonJobs): `158` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`158`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `158`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonJobs): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
