package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonNamePath` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonNamePath
  
  var `422`: Content549
}
object `201ContentApplicationjsonNamePath` {
  
  inline def apply(`201`: ContentApplicationjsonNamePath, `422`: Content549): `201ContentApplicationjsonNamePath` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonNamePath`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonNamePath`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonNamePath): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content549): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
