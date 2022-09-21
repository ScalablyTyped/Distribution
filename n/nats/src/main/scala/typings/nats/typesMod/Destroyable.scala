package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroyable extends StObject {
  
  def destroy(): js.Promise[Unit]
}
object Destroyable {
  
  inline def apply(destroy: () => js.Promise[Unit]): Destroyable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Destroyable]
  }
  
  extension [Self <: Destroyable](x: Self) {
    
    inline def setDestroy(value: () => js.Promise[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
