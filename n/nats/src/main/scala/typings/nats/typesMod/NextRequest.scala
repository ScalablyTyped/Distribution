package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextRequest extends StObject {
  
  var batch: Double
  
  var expires: Double
  
  var no_wait: Boolean
}
object NextRequest {
  
  inline def apply(batch: Double, expires: Double, no_wait: Boolean): NextRequest = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], no_wait = no_wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextRequest]
  }
  
  extension [Self <: NextRequest](x: Self) {
    
    inline def setBatch(value: Double): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setNo_wait(value: Boolean): Self = StObject.set(x, "no_wait", value.asInstanceOf[js.Any])
  }
}
