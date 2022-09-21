package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonEmailsExternalId` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonEmailsExternalId
}
object `200ContentApplicationjsonEmailsExternalId` {
  
  inline def apply(`200`: ContentApplicationjsonEmailsExternalId): `200ContentApplicationjsonEmailsExternalId` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonEmailsExternalId`]
  }
  
  extension [Self <: `200ContentApplicationjsonEmailsExternalId`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonEmailsExternalId): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
