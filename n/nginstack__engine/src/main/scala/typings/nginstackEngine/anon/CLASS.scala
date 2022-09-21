package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CLASS extends StObject {
  
  var CLASS: Double
  
  var FILE: Double
  
  var NONE: Double
  
  var RECORD: Double
}
object CLASS {
  
  inline def apply(CLASS: Double, FILE: Double, NONE: Double, RECORD: Double): CLASS = {
    val __obj = js.Dynamic.literal(CLASS = CLASS.asInstanceOf[js.Any], FILE = FILE.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RECORD = RECORD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLASS]
  }
  
  extension [Self <: CLASS](x: Self) {
    
    inline def setCLASS(value: Double): Self = StObject.set(x, "CLASS", value.asInstanceOf[js.Any])
    
    inline def setFILE(value: Double): Self = StObject.set(x, "FILE", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setRECORD(value: Double): Self = StObject.set(x, "RECORD", value.asInstanceOf[js.Any])
  }
}
