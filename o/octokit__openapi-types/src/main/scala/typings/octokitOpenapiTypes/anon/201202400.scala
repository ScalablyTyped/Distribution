package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201202400` extends StObject {
  
  /** @description Response when the codespace was successfully created */
  var `201`: ContentApplicationjsonIdletimeoutnotice
  
  /** @description Response when the codespace creation partially failed but is being retried in the background */
  var `202`: ContentApplicationjsonIdletimeoutnotice
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `401`: Content36
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `201202400` {
  
  inline def apply(
    `201`: ContentApplicationjsonIdletimeoutnotice,
    `202`: ContentApplicationjsonIdletimeoutnotice,
    `400`: ContentApplicationjsonApplicationscimjson,
    `401`: Content36,
    `403`: Content36,
    `404`: Content36,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `201202400` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201202400`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201202400`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonIdletimeoutnotice): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjsonIdletimeoutnotice): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content36): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
