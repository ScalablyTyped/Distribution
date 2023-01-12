package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETE extends StObject {
  
  var DELETE: Double
  
  var ERROR: Double
  
  var UNLINK: Double
}
object DELETE {
  
  inline def apply(DELETE: Double, ERROR: Double, UNLINK: Double): DELETE = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], UNLINK = UNLINK.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETE] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: Double): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setUNLINK(value: Double): Self = StObject.set(x, "UNLINK", value.asInstanceOf[js.Any])
  }
}
