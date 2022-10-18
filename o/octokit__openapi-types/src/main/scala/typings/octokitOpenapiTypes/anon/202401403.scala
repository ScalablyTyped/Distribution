package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202401403` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjsonExporturl
  
  var `401`: Content6
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `422`: Content8
  
  var `500`: Content6
}
object `202401403` {
  
  inline def apply(
    `202`: ContentApplicationjsonExporturl,
    `401`: Content6,
    `403`: Content6,
    `404`: Content6,
    `422`: Content8,
    `500`: Content6
  ): `202401403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202401403`]
  }
  
  extension [Self <: `202401403`](x: Self) {
    
    inline def set202(value: ContentApplicationjsonExporturl): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content6): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
