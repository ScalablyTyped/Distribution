package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionEvents extends StObject {
  
  def close(): Unit
  
  def clusterTimeReceived(clusterTime: Document): Unit
  
  def commandFailed(event: CommandFailedEvent): Unit
  
  def commandStarted(event: CommandStartedEvent): Unit
  
  def commandSucceeded(event: CommandSucceededEvent): Unit
  
  def message(message: Any): Unit
  
  def pinned(pinType: String): Unit
  
  def unpinned(pinType: String): Unit
}
object ConnectionEvents {
  
  inline def apply(
    close: () => Unit,
    clusterTimeReceived: Document => Unit,
    commandFailed: CommandFailedEvent => Unit,
    commandStarted: CommandStartedEvent => Unit,
    commandSucceeded: CommandSucceededEvent => Unit,
    message: Any => Unit,
    pinned: String => Unit,
    unpinned: String => Unit
  ): ConnectionEvents = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), clusterTimeReceived = js.Any.fromFunction1(clusterTimeReceived), commandFailed = js.Any.fromFunction1(commandFailed), commandStarted = js.Any.fromFunction1(commandStarted), commandSucceeded = js.Any.fromFunction1(commandSucceeded), message = js.Any.fromFunction1(message), pinned = js.Any.fromFunction1(pinned), unpinned = js.Any.fromFunction1(unpinned))
    __obj.asInstanceOf[ConnectionEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionEvents] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setClusterTimeReceived(value: Document => Unit): Self = StObject.set(x, "clusterTimeReceived", js.Any.fromFunction1(value))
    
    inline def setCommandFailed(value: CommandFailedEvent => Unit): Self = StObject.set(x, "commandFailed", js.Any.fromFunction1(value))
    
    inline def setCommandStarted(value: CommandStartedEvent => Unit): Self = StObject.set(x, "commandStarted", js.Any.fromFunction1(value))
    
    inline def setCommandSucceeded(value: CommandSucceededEvent => Unit): Self = StObject.set(x, "commandSucceeded", js.Any.fromFunction1(value))
    
    inline def setMessage(value: Any => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setPinned(value: String => Unit): Self = StObject.set(x, "pinned", js.Any.fromFunction1(value))
    
    inline def setUnpinned(value: String => Unit): Self = StObject.set(x, "unpinned", js.Any.fromFunction1(value))
  }
}
