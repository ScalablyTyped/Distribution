package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NModified extends StObject {
  
  var n: Double
  
  var nModified: Double
  
  var ok: Double
}
object NModified {
  
  inline def apply(n: Double, nModified: Double, ok: Double): NModified = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[NModified]
  }
  
  extension [Self <: NModified](x: Self) {
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNModified(value: Double): Self = StObject.set(x, "nModified", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
