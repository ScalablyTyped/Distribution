package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202400403` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjsonDefaultbranch
  
  var `400`: Content420
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `422`: Content421
}
object `202400403` {
  
  inline def apply(
    `202`: ContentApplicationjsonDefaultbranch,
    `400`: Content420,
    `403`: Content55,
    `404`: Content55,
    `422`: Content421
  ): `202400403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202400403`]
  }
  
  extension [Self <: `202400403`](x: Self) {
    
    inline def set202(value: ContentApplicationjsonDefaultbranch): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: Content420): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
