package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeAPIComms extends StObject {
  
  def publish(topic: String, data: Any, retain: Boolean): Unit
}
object NodeAPIComms {
  
  inline def apply(publish: (String, Any, Boolean) => Unit): NodeAPIComms = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction3(publish))
    __obj.asInstanceOf[NodeAPIComms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeAPIComms] (val x: Self) extends AnyVal {
    
    inline def setPublish(value: (String, Any, Boolean) => Unit): Self = StObject.set(x, "publish", js.Any.fromFunction3(value))
  }
}
