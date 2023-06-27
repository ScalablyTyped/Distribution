package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A private class representing a pair of framebuffers, when MSAA is used.
  *
  * @ignore
  */
trait FramebufferPair extends StObject {
  
  def destroy(gl: Any): Unit
  
  /** Multi-sampled rendering framebuffer */
  var msaaFB: Any
  
  /** Single-sampled resolve framebuffer */
  var resolveFB: Any
}
object FramebufferPair {
  
  inline def apply(destroy: Any => Unit, msaaFB: Any, resolveFB: Any): FramebufferPair = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), msaaFB = msaaFB.asInstanceOf[js.Any], resolveFB = resolveFB.asInstanceOf[js.Any])
    __obj.asInstanceOf[FramebufferPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FramebufferPair] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: Any => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setMsaaFB(value: Any): Self = StObject.set(x, "msaaFB", value.asInstanceOf[js.Any])
    
    inline def setResolveFB(value: Any): Self = StObject.set(x, "resolveFB", value.asInstanceOf[js.Any])
  }
}
