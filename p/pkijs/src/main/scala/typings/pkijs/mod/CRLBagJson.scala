package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CRLBagJson
  extends StObject
     with _BagTypeJson {
  
  var crlId: String
  
  var crlValue: Any
}
object CRLBagJson {
  
  inline def apply(crlId: String, crlValue: Any): CRLBagJson = {
    val __obj = js.Dynamic.literal(crlId = crlId.asInstanceOf[js.Any], crlValue = crlValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CRLBagJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CRLBagJson] (val x: Self) extends AnyVal {
    
    inline def setCrlId(value: String): Self = StObject.set(x, "crlId", value.asInstanceOf[js.Any])
    
    inline def setCrlValue(value: Any): Self = StObject.set(x, "crlValue", value.asInstanceOf[js.Any])
  }
}
