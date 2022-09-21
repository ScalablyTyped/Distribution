package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonMembers` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonMembers
}
object `200ContentApplicationjsonMembers` {
  
  inline def apply(`200`: ContentApplicationjsonMembers): `200ContentApplicationjsonMembers` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonMembers`]
  }
  
  extension [Self <: `200ContentApplicationjsonMembers`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonMembers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
