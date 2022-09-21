package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraversalActions extends StObject {
  
  /** Skip the current node's children and continue the traversal if there are other nodes in the queue. */
  def skipChildren(): Unit
  
  /** Stop the traversal */
  def stop(): Unit
}
object TraversalActions {
  
  inline def apply(skipChildren: () => Unit, stop: () => Unit): TraversalActions = {
    val __obj = js.Dynamic.literal(skipChildren = js.Any.fromFunction0(skipChildren), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[TraversalActions]
  }
  
  extension [Self <: TraversalActions](x: Self) {
    
    inline def setSkipChildren(value: () => Unit): Self = StObject.set(x, "skipChildren", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
