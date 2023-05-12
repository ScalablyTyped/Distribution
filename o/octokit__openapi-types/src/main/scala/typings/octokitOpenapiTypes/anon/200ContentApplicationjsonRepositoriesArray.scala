package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRepositoriesArray` extends StObject {
  
  /** @description Success */
  var `200`: ContentApplicationjsonRepositoriesArray
}
object `200ContentApplicationjsonRepositoriesArray` {
  
  inline def apply(`200`: ContentApplicationjsonRepositoriesArray): `200ContentApplicationjsonRepositoriesArray` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRepositoriesArray`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRepositoriesArray`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRepositoriesArray): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
