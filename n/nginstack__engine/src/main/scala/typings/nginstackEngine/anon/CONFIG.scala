package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CONFIG extends StObject {
  
  var CONFIG: String
  
  var MODEL: String
  
  var NON_STRICT_MODEL: String
  
  var VIEW: String
}
object CONFIG {
  
  inline def apply(CONFIG: String, MODEL: String, NON_STRICT_MODEL: String, VIEW: String): CONFIG = {
    val __obj = js.Dynamic.literal(CONFIG = CONFIG.asInstanceOf[js.Any], MODEL = MODEL.asInstanceOf[js.Any], NON_STRICT_MODEL = NON_STRICT_MODEL.asInstanceOf[js.Any], VIEW = VIEW.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONFIG]
  }
  
  extension [Self <: CONFIG](x: Self) {
    
    inline def setCONFIG(value: String): Self = StObject.set(x, "CONFIG", value.asInstanceOf[js.Any])
    
    inline def setMODEL(value: String): Self = StObject.set(x, "MODEL", value.asInstanceOf[js.Any])
    
    inline def setNON_STRICT_MODEL(value: String): Self = StObject.set(x, "NON_STRICT_MODEL", value.asInstanceOf[js.Any])
    
    inline def setVIEW(value: String): Self = StObject.set(x, "VIEW", value.asInstanceOf[js.Any])
  }
}
