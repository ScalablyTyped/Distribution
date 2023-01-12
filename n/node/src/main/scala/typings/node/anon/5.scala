package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var fd: typings.node.nodeInts.`2`
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal(fd = 2)
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setFd(value: typings.node.nodeInts.`2`): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
  }
}
