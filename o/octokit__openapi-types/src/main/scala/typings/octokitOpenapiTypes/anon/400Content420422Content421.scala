package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400Content420422Content421` extends StObject {
  
  var `400`: Content420
  
  var `422`: Content421
}
object `400Content420422Content421` {
  
  inline def apply(`400`: Content420, `422`: Content421): `400Content420422Content421` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400Content420422Content421`]
  }
  
  extension [Self <: `400Content420422Content421`](x: Self) {
    
    inline def set400(value: Content420): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
