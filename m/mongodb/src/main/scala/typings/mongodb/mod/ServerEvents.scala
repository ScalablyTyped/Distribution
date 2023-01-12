package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {serverHeartbeatStarted (event : mongodb.mongodb.ServerHeartbeatStartedEvent): void, serverHeartbeatSucceeded (event : mongodb.mongodb.ServerHeartbeatSucceededEvent): void, serverHeartbeatFailed (event : mongodb.mongodb.ServerHeartbeatFailedEvent): void, descriptionReceived (description : mongodb.mongodb.ServerDescription): void, closed (): void, ended (): void} & mongodb.mongodb.ConnectionPoolEvents & mongodb.mongodb.EventEmitterWithState */
trait ServerEvents extends StObject {
  
  def closed(): Unit
  
  def clusterTimeReceived(clusterTime: Document): Unit
  @JSName("clusterTimeReceived")
  var clusterTimeReceived_Original: js.Function1[/* clusterTime */ Document, Unit]
  
  def commandFailed(event: CommandFailedEvent): Unit
  @JSName("commandFailed")
  var commandFailed_Original: js.Function1[/* event */ CommandFailedEvent, Unit]
  
  def commandStarted(event: CommandStartedEvent): Unit
  @JSName("commandStarted")
  var commandStarted_Original: js.Function1[/* event */ CommandStartedEvent, Unit]
  
  def commandSucceeded(event: CommandSucceededEvent): Unit
  @JSName("commandSucceeded")
  var commandSucceeded_Original: js.Function1[/* event */ CommandSucceededEvent, Unit]
  
  def connectionCheckOutFailed(event: ConnectionCheckOutFailedEvent): Unit
  
  def connectionCheckOutStarted(event: ConnectionCheckOutStartedEvent): Unit
  
  def connectionCheckedIn(event: ConnectionCheckedInEvent): Unit
  
  def connectionCheckedOut(event: ConnectionCheckedOutEvent): Unit
  
  def connectionClosed(event: ConnectionClosedEvent): Unit
  
  def connectionCreated(event: ConnectionCreatedEvent): Unit
  
  def connectionPoolCleared(event: ConnectionPoolClearedEvent): Unit
  
  def connectionPoolClosed(event: ConnectionPoolClosedEvent): Unit
  
  def connectionPoolCreated(event: ConnectionPoolCreatedEvent): Unit
  
  def connectionPoolReady(event: ConnectionPoolReadyEvent): Unit
  
  def connectionReady(event: ConnectionReadyEvent): Unit
  
  /* Excluded from this release type: connect */
  def descriptionReceived(description: ServerDescription): Unit
  
  def ended(): Unit
  
  def pinned(pinType: String): Unit
  @JSName("pinned")
  var pinned_Original: js.Function1[/* pinType */ String, Unit]
  
  def serverHeartbeatFailed(event: ServerHeartbeatFailedEvent): Unit
  
  def serverHeartbeatStarted(event: ServerHeartbeatStartedEvent): Unit
  
  def serverHeartbeatSucceeded(event: ServerHeartbeatSucceededEvent): Unit
  
  def unpinned(pinType: String): Unit
  @JSName("unpinned")
  var unpinned_Original: js.Function1[/* pinType */ String, Unit]
}
object ServerEvents {
  
  inline def apply(
    closed: () => Unit,
    clusterTimeReceived: /* clusterTime */ Document => Unit,
    commandFailed: /* event */ CommandFailedEvent => Unit,
    commandStarted: /* event */ CommandStartedEvent => Unit,
    commandSucceeded: /* event */ CommandSucceededEvent => Unit,
    connectionCheckOutFailed: ConnectionCheckOutFailedEvent => Unit,
    connectionCheckOutStarted: ConnectionCheckOutStartedEvent => Unit,
    connectionCheckedIn: ConnectionCheckedInEvent => Unit,
    connectionCheckedOut: ConnectionCheckedOutEvent => Unit,
    connectionClosed: ConnectionClosedEvent => Unit,
    connectionCreated: ConnectionCreatedEvent => Unit,
    connectionPoolCleared: ConnectionPoolClearedEvent => Unit,
    connectionPoolClosed: ConnectionPoolClosedEvent => Unit,
    connectionPoolCreated: ConnectionPoolCreatedEvent => Unit,
    connectionPoolReady: ConnectionPoolReadyEvent => Unit,
    connectionReady: ConnectionReadyEvent => Unit,
    descriptionReceived: ServerDescription => Unit,
    ended: () => Unit,
    pinned: /* pinType */ String => Unit,
    serverHeartbeatFailed: ServerHeartbeatFailedEvent => Unit,
    serverHeartbeatStarted: ServerHeartbeatStartedEvent => Unit,
    serverHeartbeatSucceeded: ServerHeartbeatSucceededEvent => Unit,
    unpinned: /* pinType */ String => Unit
  ): ServerEvents = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction0(closed), clusterTimeReceived = js.Any.fromFunction1(clusterTimeReceived), commandFailed = js.Any.fromFunction1(commandFailed), commandStarted = js.Any.fromFunction1(commandStarted), commandSucceeded = js.Any.fromFunction1(commandSucceeded), connectionCheckOutFailed = js.Any.fromFunction1(connectionCheckOutFailed), connectionCheckOutStarted = js.Any.fromFunction1(connectionCheckOutStarted), connectionCheckedIn = js.Any.fromFunction1(connectionCheckedIn), connectionCheckedOut = js.Any.fromFunction1(connectionCheckedOut), connectionClosed = js.Any.fromFunction1(connectionClosed), connectionCreated = js.Any.fromFunction1(connectionCreated), connectionPoolCleared = js.Any.fromFunction1(connectionPoolCleared), connectionPoolClosed = js.Any.fromFunction1(connectionPoolClosed), connectionPoolCreated = js.Any.fromFunction1(connectionPoolCreated), connectionPoolReady = js.Any.fromFunction1(connectionPoolReady), connectionReady = js.Any.fromFunction1(connectionReady), descriptionReceived = js.Any.fromFunction1(descriptionReceived), ended = js.Any.fromFunction0(ended), pinned = js.Any.fromFunction1(pinned), serverHeartbeatFailed = js.Any.fromFunction1(serverHeartbeatFailed), serverHeartbeatStarted = js.Any.fromFunction1(serverHeartbeatStarted), serverHeartbeatSucceeded = js.Any.fromFunction1(serverHeartbeatSucceeded), unpinned = js.Any.fromFunction1(unpinned))
    __obj.asInstanceOf[ServerEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerEvents] (val x: Self) extends AnyVal {
    
    inline def setClosed(value: () => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
    
    inline def setClusterTimeReceived(value: /* clusterTime */ Document => Unit): Self = StObject.set(x, "clusterTimeReceived", js.Any.fromFunction1(value))
    
    inline def setCommandFailed(value: /* event */ CommandFailedEvent => Unit): Self = StObject.set(x, "commandFailed", js.Any.fromFunction1(value))
    
    inline def setCommandStarted(value: /* event */ CommandStartedEvent => Unit): Self = StObject.set(x, "commandStarted", js.Any.fromFunction1(value))
    
    inline def setCommandSucceeded(value: /* event */ CommandSucceededEvent => Unit): Self = StObject.set(x, "commandSucceeded", js.Any.fromFunction1(value))
    
    inline def setConnectionCheckOutFailed(value: ConnectionCheckOutFailedEvent => Unit): Self = StObject.set(x, "connectionCheckOutFailed", js.Any.fromFunction1(value))
    
    inline def setConnectionCheckOutStarted(value: ConnectionCheckOutStartedEvent => Unit): Self = StObject.set(x, "connectionCheckOutStarted", js.Any.fromFunction1(value))
    
    inline def setConnectionCheckedIn(value: ConnectionCheckedInEvent => Unit): Self = StObject.set(x, "connectionCheckedIn", js.Any.fromFunction1(value))
    
    inline def setConnectionCheckedOut(value: ConnectionCheckedOutEvent => Unit): Self = StObject.set(x, "connectionCheckedOut", js.Any.fromFunction1(value))
    
    inline def setConnectionClosed(value: ConnectionClosedEvent => Unit): Self = StObject.set(x, "connectionClosed", js.Any.fromFunction1(value))
    
    inline def setConnectionCreated(value: ConnectionCreatedEvent => Unit): Self = StObject.set(x, "connectionCreated", js.Any.fromFunction1(value))
    
    inline def setConnectionPoolCleared(value: ConnectionPoolClearedEvent => Unit): Self = StObject.set(x, "connectionPoolCleared", js.Any.fromFunction1(value))
    
    inline def setConnectionPoolClosed(value: ConnectionPoolClosedEvent => Unit): Self = StObject.set(x, "connectionPoolClosed", js.Any.fromFunction1(value))
    
    inline def setConnectionPoolCreated(value: ConnectionPoolCreatedEvent => Unit): Self = StObject.set(x, "connectionPoolCreated", js.Any.fromFunction1(value))
    
    inline def setConnectionPoolReady(value: ConnectionPoolReadyEvent => Unit): Self = StObject.set(x, "connectionPoolReady", js.Any.fromFunction1(value))
    
    inline def setConnectionReady(value: ConnectionReadyEvent => Unit): Self = StObject.set(x, "connectionReady", js.Any.fromFunction1(value))
    
    inline def setDescriptionReceived(value: ServerDescription => Unit): Self = StObject.set(x, "descriptionReceived", js.Any.fromFunction1(value))
    
    inline def setEnded(value: () => Unit): Self = StObject.set(x, "ended", js.Any.fromFunction0(value))
    
    inline def setPinned(value: /* pinType */ String => Unit): Self = StObject.set(x, "pinned", js.Any.fromFunction1(value))
    
    inline def setServerHeartbeatFailed(value: ServerHeartbeatFailedEvent => Unit): Self = StObject.set(x, "serverHeartbeatFailed", js.Any.fromFunction1(value))
    
    inline def setServerHeartbeatStarted(value: ServerHeartbeatStartedEvent => Unit): Self = StObject.set(x, "serverHeartbeatStarted", js.Any.fromFunction1(value))
    
    inline def setServerHeartbeatSucceeded(value: ServerHeartbeatSucceededEvent => Unit): Self = StObject.set(x, "serverHeartbeatSucceeded", js.Any.fromFunction1(value))
    
    inline def setUnpinned(value: /* pinType */ String => Unit): Self = StObject.set(x, "unpinned", js.Any.fromFunction1(value))
  }
}
