package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAllowedactionsEnabled` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonAllowedactionsEnabled
}
object `200ContentApplicationjsonAllowedactionsEnabled` {
  
  inline def apply(`200`: ContentApplicationjsonAllowedactionsEnabled): `200ContentApplicationjsonAllowedactionsEnabled` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAllowedactionsEnabled`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonAllowedactionsEnabled`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAllowedactionsEnabled): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
