package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonPushprotectionbypassedat` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonPushprotectionbypassedat
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `200ContentApplicationjsonPushprotectionbypassedat` {
  
  inline def apply(
    `200`: ContentApplicationjsonPushprotectionbypassedat,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `200ContentApplicationjsonPushprotectionbypassedat` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonPushprotectionbypassedat`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonPushprotectionbypassedat`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonPushprotectionbypassedat): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
