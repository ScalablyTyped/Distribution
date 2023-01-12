package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fd extends StObject {
  
  var fd: typings.node.nodeInts.`1`
}
object Fd {
  
  inline def apply(): Fd = {
    val __obj = js.Dynamic.literal(fd = 1)
    __obj.asInstanceOf[Fd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fd] (val x: Self) extends AnyVal {
    
    inline def setFd(value: typings.node.nodeInts.`1`): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
  }
}
