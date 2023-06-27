package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonJobs
}
object `186` {
  
  inline def apply(`200`: ContentApplicationjsonJobs): `186` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`186`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `186`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonJobs): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
