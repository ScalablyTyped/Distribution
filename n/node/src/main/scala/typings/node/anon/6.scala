package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var fd: typings.node.nodeInts.`0`
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(fd = 0)
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setFd(value: typings.node.nodeInts.`0`): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
  }
}
