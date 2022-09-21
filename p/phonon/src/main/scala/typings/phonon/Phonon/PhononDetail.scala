package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononDetail extends StObject {
  
  var page: String
  
  var req: js.Array[String]
}
object PhononDetail {
  
  inline def apply(page: String, req: js.Array[String]): PhononDetail = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononDetail]
  }
  
  extension [Self <: PhononDetail](x: Self) {
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setReq(value: js.Array[String]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqVarargs(value: String*): Self = StObject.set(x, "req", js.Array(value*))
  }
}
