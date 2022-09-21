package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonExporturl` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonExporturl
  
  var `404`: Content55
}
object `200ContentApplicationjsonExporturl` {
  
  inline def apply(`200`: ContentApplicationjsonExporturl, `404`: Content55): `200ContentApplicationjsonExporturl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonExporturl`]
  }
  
  extension [Self <: `200ContentApplicationjsonExporturl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonExporturl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
