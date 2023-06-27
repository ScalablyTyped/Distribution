package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonTruncated` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonTruncated
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `422`: Content414
}
object `201ContentApplicationjsonTruncated` {
  
  inline def apply(`201`: ContentApplicationjsonTruncated, `403`: Content41, `404`: Content41, `422`: Content414): `201ContentApplicationjsonTruncated` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonTruncated`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonTruncated`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonTruncated): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
