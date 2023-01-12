package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonDeployment` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonDeployment
}
object `201ContentApplicationjsonDeployment` {
  
  inline def apply(`201`: ContentApplicationjsonDeployment): `201ContentApplicationjsonDeployment` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonDeployment`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonDeployment`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonDeployment): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
