package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ok extends StObject {
  
  var n: Double
  
  var ok: Double
}
object Ok {
  
  inline def apply(n: Double, ok: Double): Ok = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok]
  }
  
  extension [Self <: Ok](x: Self) {
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
