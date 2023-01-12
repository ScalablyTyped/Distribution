package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonDefault` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonDefault
}
object `201ContentApplicationjsonDefault` {
  
  inline def apply(`201`: ContentApplicationjsonDefault): `201ContentApplicationjsonDefault` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonDefault`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonDefault`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonDefault): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
