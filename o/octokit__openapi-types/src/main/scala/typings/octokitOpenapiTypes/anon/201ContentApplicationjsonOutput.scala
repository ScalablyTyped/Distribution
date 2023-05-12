package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonOutput` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonOutput
}
object `201ContentApplicationjsonOutput` {
  
  inline def apply(`201`: ContentApplicationjsonOutput): `201ContentApplicationjsonOutput` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonOutput`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonOutput`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonOutput): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
