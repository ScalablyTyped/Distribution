package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBasebranch` extends StObject {
  
  /** The branch has been successfully synced with the upstream repository */
  var `200`: ContentApplicationjsonBasebranch
  
  /** The branch could not be synced because of a merge conflict */
  var `409`: Any
  
  /** The branch could not be synced for some other reason */
  var `422`: Any
}
object `200ContentApplicationjsonBasebranch` {
  
  inline def apply(`200`: ContentApplicationjsonBasebranch, `409`: Any, `422`: Any): `200ContentApplicationjsonBasebranch` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBasebranch`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonBasebranch`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBasebranch): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
