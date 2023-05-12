package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var pid: Double
  
  var secret: Double
  
  var status: String
}
object State {
  
  inline def apply(pid: Double, secret: Double, status: String): State = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: Double): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
