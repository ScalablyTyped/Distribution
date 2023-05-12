package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonMessageNodeid` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonMessageNodeid
  
  var `422`: Content346
}
object `201ContentApplicationjsonMessageNodeid` {
  
  inline def apply(`201`: ContentApplicationjsonMessageNodeid, `422`: Content346): `201ContentApplicationjsonMessageNodeid` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonMessageNodeid`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonMessageNodeid`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonMessageNodeid): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
