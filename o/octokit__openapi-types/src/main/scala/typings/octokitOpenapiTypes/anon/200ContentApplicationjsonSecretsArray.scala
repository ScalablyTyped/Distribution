package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonSecretsArray` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonSecretsArray
}
object `200ContentApplicationjsonSecretsArray` {
  
  inline def apply(`200`: ContentApplicationjsonSecretsArray): `200ContentApplicationjsonSecretsArray` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonSecretsArray`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonSecretsArray`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonSecretsArray): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
