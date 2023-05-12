package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201400404` extends StObject {
  
  /** @description Empty response */
  var `201`: ContentApplicationjsonRecord
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `404`: Content36
  
  var `422`: Content471
}
object `201400404` {
  
  inline def apply(
    `201`: ContentApplicationjsonRecord,
    `400`: ContentApplicationjsonApplicationscimjson,
    `404`: Content36,
    `422`: Content471
  ): `201400404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201400404`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201400404`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonRecord): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content471): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
