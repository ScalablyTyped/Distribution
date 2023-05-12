package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409Content36` extends StObject {
  
  /** @description Response */
  var `202`: ContentApplicationjsonRecord
  
  var `409`: Content36
}
object `409Content36` {
  
  inline def apply(`202`: ContentApplicationjsonRecord, `409`: Content36): `409Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`409Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `409Content36`] (val x: Self) extends AnyVal {
    
    inline def set202(value: ContentApplicationjsonRecord): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content36): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
  }
}
