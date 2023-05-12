package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200307403` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonContributorsurl
  
  var `307`: Content36
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `422`: Content346
}
object `200307403` {
  
  inline def apply(
    `200`: ContentApplicationjsonContributorsurl,
    `307`: Content36,
    `403`: Content36,
    `404`: Content36,
    `422`: Content346
  ): `200307403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("307")(`307`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200307403`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200307403`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonContributorsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set307(value: Content36): Self = StObject.set(x, "307", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
