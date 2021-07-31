package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeAPIComms extends StObject {
  
  def publish(topic: String, data: js.Any, retain: Boolean): Unit
}
object NodeAPIComms {
  
  @scala.inline
  def apply(publish: (String, js.Any, Boolean) => Unit): NodeAPIComms = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction3(publish))
    __obj.asInstanceOf[NodeAPIComms]
  }
  
  @scala.inline
  implicit class NodeAPICommsMutableBuilder[Self <: NodeAPIComms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublish(value: (String, js.Any, Boolean) => Unit): Self = StObject.set(x, "publish", js.Any.fromFunction3(value))
  }
}
