package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202400403` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjsonDefaultbranch
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `403`: Content48
  
  var `404`: Content48
  
  var `422`: Content397
}
object `202400403` {
  
  inline def apply(
    `202`: ContentApplicationjsonDefaultbranch,
    `400`: ContentApplicationjsonApplicationscimjson,
    `403`: Content48,
    `404`: Content48,
    `422`: Content397
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
    
    inline def set202(value: ContentApplicationjsonDefaultbranch): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
