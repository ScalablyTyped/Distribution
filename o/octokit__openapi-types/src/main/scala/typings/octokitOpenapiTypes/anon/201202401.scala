package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201202401` extends StObject {
  
  /** @description Response when the codespace was successfully created */
  var `201`: ContentApplicationjsonIdletimeoutnotice
  
  /** @description Response when the codespace creation partially failed but is being retried in the background */
  var `202`: ContentApplicationjsonIdletimeoutnotice
  
  var `401`: Content41
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `201202401` {
  
  inline def apply(
    `201`: ContentApplicationjsonIdletimeoutnotice,
    `202`: ContentApplicationjsonIdletimeoutnotice,
    `401`: Content41,
    `403`: Content41,
    `404`: Content41,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `201202401` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201202401`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201202401`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonIdletimeoutnotice): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjsonIdletimeoutnotice): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content41): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
