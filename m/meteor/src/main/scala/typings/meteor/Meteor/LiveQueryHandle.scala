package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveQueryHandle extends StObject {
  
  def stop(): Unit = js.native
}
object LiveQueryHandle {
  
  @scala.inline
  def apply(stop: () => Unit): LiveQueryHandle = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[LiveQueryHandle]
  }
  
  @scala.inline
  implicit class LiveQueryHandleMutableBuilder[Self <: LiveQueryHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
