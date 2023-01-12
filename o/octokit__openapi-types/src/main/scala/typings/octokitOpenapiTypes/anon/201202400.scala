package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201202400` extends StObject {
  
  /** Response when the codespace was successfully created */
  var `201`: ContentApplicationjsonGitstatus
  
  /** Response when the codespace creation partially failed but is being retried in the background */
  var `202`: ContentApplicationjsonGitstatus
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `401`: Content48
  
  var `403`: Content48
  
  var `404`: Content48
}
object `201202400` {
  
  inline def apply(
    `201`: ContentApplicationjsonGitstatus,
    `202`: ContentApplicationjsonGitstatus,
    `400`: ContentApplicationjsonApplicationscimjson,
    `401`: Content48,
    `403`: Content48,
    `404`: Content48
  ): `201202400` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201202400`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201202400`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonGitstatus): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjsonGitstatus): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
