package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveQueryHandle extends StObject {
  
  def stop(): Unit
}
object LiveQueryHandle {
  
  inline def apply(stop: () => Unit): LiveQueryHandle = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[LiveQueryHandle]
  }
  
  extension [Self <: LiveQueryHandle](x: Self) {
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
