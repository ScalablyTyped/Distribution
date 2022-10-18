package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202401` extends StObject {
  
  /** Response when the codespace was successfully created */
  var `201`: ContentApplicationjsonDevcontainerpath
  
  /** Response when the codespace creation partially failed but is being retried in the background */
  var `202`: ContentApplicationjsonDevcontainerpath
  
  var `401`: Content6
  
  var `403`: Content6
  
  var `404`: Content6
}
object `202401` {
  
  inline def apply(
    `201`: ContentApplicationjsonDevcontainerpath,
    `202`: ContentApplicationjsonDevcontainerpath,
    `401`: Content6,
    `403`: Content6,
    `404`: Content6
  ): `202401` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202401`]
  }
  
  extension [Self <: `202401`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonDevcontainerpath): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjsonDevcontainerpath): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
