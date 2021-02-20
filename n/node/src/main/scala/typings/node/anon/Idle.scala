package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Idle extends StObject {
  
  var idle: Double = js.native
  
  var irq: Double = js.native
  
  var nice: Double = js.native
  
  var sys: Double = js.native
  
  var user: Double = js.native
}
object Idle {
  
  @scala.inline
  def apply(idle: Double, irq: Double, nice: Double, sys: Double, user: Double): Idle = {
    val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idle]
  }
  
  @scala.inline
  implicit class IdleMutableBuilder[Self <: Idle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIrq(value: Double): Self = StObject.set(x, "irq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: Double): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
