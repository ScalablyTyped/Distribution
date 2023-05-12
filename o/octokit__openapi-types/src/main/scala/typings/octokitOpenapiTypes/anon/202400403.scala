package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202400403` extends StObject {
  
  /** @description Response */
  var `202`: ContentApplicationjsonContributorsurl
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `422`: Content346
}
object `202400403` {
  
  inline def apply(
    `202`: ContentApplicationjsonContributorsurl,
    `400`: ContentApplicationjsonApplicationscimjson,
    `403`: Content36,
    `404`: Content36,
    `422`: Content346
  ): `202400403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202400403`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202400403`] (val x: Self) extends AnyVal {
    
    inline def set202(value: ContentApplicationjsonContributorsurl): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
