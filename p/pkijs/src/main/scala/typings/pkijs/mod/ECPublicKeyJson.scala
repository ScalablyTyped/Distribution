package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECPublicKeyJson extends StObject {
  
  var crv: String
  
  var x: String
  
  var y: String
}
object ECPublicKeyJson {
  
  inline def apply(crv: String, x: String, y: String): ECPublicKeyJson = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECPublicKeyJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ECPublicKeyJson] (val x: Self) extends AnyVal {
    
    inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
