package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201202401` extends StObject {
  
  /** Response when the codespace was successfully created */
  var `201`: ContentApplicationjsonGitstatus
  
  /** Response when the codespace creation partially failed but is being retried in the background */
  var `202`: ContentApplicationjsonGitstatus
  
  var `401`: Content55
  
  var `403`: Content55
  
  var `404`: Content55
}
object `201202401` {
  
  inline def apply(
    `201`: ContentApplicationjsonGitstatus,
    `202`: ContentApplicationjsonGitstatus,
    `401`: Content55,
    `403`: Content55,
    `404`: Content55
  ): `201202401` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201202401`]
  }
  
  extension [Self <: `201202401`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonGitstatus): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjsonGitstatus): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content55): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
