package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonInherited` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonInherited
}
object `201ContentApplicationjsonInherited` {
  
  inline def apply(`201`: ContentApplicationjsonInherited): `201ContentApplicationjsonInherited` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonInherited`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonInherited`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonInherited): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
