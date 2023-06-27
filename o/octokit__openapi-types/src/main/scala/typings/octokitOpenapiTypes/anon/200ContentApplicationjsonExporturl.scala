package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonExporturl` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonExporturl
  
  var `404`: Content41
}
object `200ContentApplicationjsonExporturl` {
  
  inline def apply(`200`: ContentApplicationjsonExporturl, `404`: Content41): `200ContentApplicationjsonExporturl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonExporturl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonExporturl`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonExporturl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
