package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Idle extends StObject {
  
  var idle: Double
  
  var irq: Double
  
  var nice: Double
  
  var sys: Double
  
  var user: Double
}
object Idle {
  
  inline def apply(idle: Double, irq: Double, nice: Double, sys: Double, user: Double): Idle = {
    val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idle]
  }
  
  extension [Self <: Idle](x: Self) {
    
    inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setIrq(value: Double): Self = StObject.set(x, "irq", value.asInstanceOf[js.Any])
    
    inline def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setSys(value: Double): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
