package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202ContentApplicationjsonUrl` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjsonUrl
  
  var `403`: Content48
  
  var `422`: Content397
}
object `202ContentApplicationjsonUrl` {
  
  inline def apply(`202`: ContentApplicationjsonUrl, `403`: Content48, `422`: Content397): `202ContentApplicationjsonUrl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202ContentApplicationjsonUrl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202ContentApplicationjsonUrl`] (val x: Self) extends AnyVal {
    
    inline def set202(value: ContentApplicationjsonUrl): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
