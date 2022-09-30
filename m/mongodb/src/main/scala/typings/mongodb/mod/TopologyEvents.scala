package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {serverOpening (event : mongodb.mongodb.ServerOpeningEvent): void, serverClosed (event : mongodb.mongodb.ServerClosedEvent): void, serverDescriptionChanged (event : mongodb.mongodb.ServerDescriptionChangedEvent): void, topologyClosed (event : mongodb.mongodb.TopologyClosedEvent): void, topologyOpening (event : mongodb.mongodb.TopologyOpeningEvent): void, topologyDescriptionChanged (event : mongodb.mongodb.TopologyDescriptionChangedEvent): void, error (error : std.Error): void, close (): void, timeout (): void} & std.Omit<mongodb.mongodb.ServerEvents, 'connect'> & mongodb.mongodb.ConnectionPoolEvents & mongodb.mongodb.ConnectionEvents & mongodb.mongodb.EventEmitterWithState */
trait TopologyEvents extends StObject {
  
  /* Excluded from this release type: open */
  def close(): Unit
  
  def closed(): Unit
  @JSName("closed")
  var closed_Original: js.Function0[Unit]
  
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
  @JSName("connectionCheckOutFailed")
  var connectionCheckOutFailed_Original: js.Function1[/* event */ ConnectionCheckOutFailedEvent, Unit]
  
  def connectionCheckOutStarted(event: ConnectionCheckOutStartedEvent): Unit
  @JSName("connectionCheckOutStarted")
  var connectionCheckOutStarted_Original: js.Function1[/* event */ ConnectionCheckOutStartedEvent, Unit]
  
  def connectionCheckedIn(event: ConnectionCheckedInEvent): Unit
  @JSName("connectionCheckedIn")
  var connectionCheckedIn_Original: js.Function1[/* event */ ConnectionCheckedInEvent, Unit]
  
  def connectionCheckedOut(event: ConnectionCheckedOutEvent): Unit
  @JSName("connectionCheckedOut")
  var connectionCheckedOut_Original: js.Function1[/* event */ ConnectionCheckedOutEvent, Unit]
  
  def connectionClosed(event: ConnectionClosedEvent): Unit
  @JSName("connectionClosed")
  var connectionClosed_Original: js.Function1[/* event */ ConnectionClosedEvent, Unit]
  
  def connectionCreated(event: ConnectionCreatedEvent): Unit
  @JSName("connectionCreated")
  var connectionCreated_Original: js.Function1[/* event */ ConnectionCreatedEvent, Unit]
  
  def connectionPoolCleared(event: ConnectionPoolClearedEvent): Unit
  @JSName("connectionPoolCleared")
  var connectionPoolCleared_Original: js.Function1[/* event */ ConnectionPoolClearedEvent, Unit]
  
  def connectionPoolClosed(event: ConnectionPoolClosedEvent): Unit
  @JSName("connectionPoolClosed")
  var connectionPoolClosed_Original: js.Function1[/* event */ ConnectionPoolClosedEvent, Unit]
  
  def connectionPoolCreated(event: ConnectionPoolCreatedEvent): Unit
  @JSName("connectionPoolCreated")
  var connectionPoolCreated_Original: js.Function1[/* event */ ConnectionPoolCreatedEvent, Unit]
  
  def connectionPoolReady(event: ConnectionPoolReadyEvent): Unit
  @JSName("connectionPoolReady")
  var connectionPoolReady_Original: js.Function1[/* event */ ConnectionPoolReadyEvent, Unit]
  
  def connectionReady(event: ConnectionReadyEvent): Unit
  @JSName("connectionReady")
  var connectionReady_Original: js.Function1[/* event */ ConnectionReadyEvent, Unit]
  
  def descriptionReceived(description: ServerDescription): Unit
  @JSName("descriptionReceived")
  var descriptionReceived_Original: js.Function1[/* description */ ServerDescription, Unit]
  
  def ended(): Unit
  @JSName("ended")
  var ended_Original: js.Function0[Unit]
  
  def error(error: js.Error): Unit
  
  def message(message: Any): Unit
  
  def pinned(pinType: String): Unit
  @JSName("pinned")
  var pinned_Original: js.Function1[/* pinType */ String, Unit]
  
  def serverClosed(event: ServerClosedEvent): Unit
  
  def serverDescriptionChanged(event: ServerDescriptionChangedEvent): Unit
  
  def serverHeartbeatFailed(event: ServerHeartbeatFailedEvent): Unit
  @JSName("serverHeartbeatFailed")
  var serverHeartbeatFailed_Original: js.Function1[/* event */ ServerHeartbeatFailedEvent, Unit]
  
  def serverHeartbeatStarted(event: ServerHeartbeatStartedEvent): Unit
  @JSName("serverHeartbeatStarted")
  var serverHeartbeatStarted_Original: js.Function1[/* event */ ServerHeartbeatStartedEvent, Unit]
  
  def serverHeartbeatSucceeded(event: ServerHeartbeatSucceededEvent): Unit
  @JSName("serverHeartbeatSucceeded")
  var serverHeartbeatSucceeded_Original: js.Function1[/* event */ ServerHeartbeatSucceededEvent, Unit]
  
  /* Excluded from this release type: connect */
  def serverOpening(event: ServerOpeningEvent): Unit
  
  def timeout(): Unit
  
  def topologyClosed(event: TopologyClosedEvent): Unit
  
  def topologyDescriptionChanged(event: TopologyDescriptionChangedEvent): Unit
  
  def topologyOpening(event: TopologyOpeningEvent): Unit
  
  def unpinned(pinType: String): Unit
  @JSName("unpinned")
  var unpinned_Original: js.Function1[/* pinType */ String, Unit]
}
object TopologyEvents {
  
  inline def apply(
    close: () => Unit,
    closed: () => Unit,
    clusterTimeReceived: /* clusterTime */ Document => Unit,
    commandFailed: /* event */ CommandFailedEvent => Unit,
    commandStarted: /* event */ CommandStartedEvent => Unit,
    commandSucceeded: /* event */ CommandSucceededEvent => Unit,
    connectionCheckOutFailed: /* event */ ConnectionCheckOutFailedEvent => Unit,
    connectionCheckOutStarted: /* event */ ConnectionCheckOutStartedEvent => Unit,
    connectionCheckedIn: /* event */ ConnectionCheckedInEvent => Unit,
    connectionCheckedOut: /* event */ ConnectionCheckedOutEvent => Unit,
    connectionClosed: /* event */ ConnectionClosedEvent => Unit,
    connectionCreated: /* event */ ConnectionCreatedEvent => Unit,
    connectionPoolCleared: /* event */ ConnectionPoolClearedEvent => Unit,
    connectionPoolClosed: /* event */ ConnectionPoolClosedEvent => Unit,
    connectionPoolCreated: /* event */ ConnectionPoolCreatedEvent => Unit,
    connectionPoolReady: /* event */ ConnectionPoolReadyEvent => Unit,
    connectionReady: /* event */ ConnectionReadyEvent => Unit,
    descriptionReceived: /* description */ ServerDescription => Unit,
    ended: () => Unit,
    error: js.Error => Unit,
    message: Any => Unit,
    pinned: /* pinType */ String => Unit,
    serverClosed: ServerClosedEvent => Unit,
    serverDescriptionChanged: ServerDescriptionChangedEvent => Unit,
    serverHeartbeatFailed: /* event */ ServerHeartbeatFailedEvent => Unit,
    serverHeartbeatStarted: /* event */ ServerHeartbeatStartedEvent => Unit,
    serverHeartbeatSucceeded: /* event */ ServerHeartbeatSucceededEvent => Unit,
    serverOpening: ServerOpeningEvent => Unit,
    timeout: () => Unit,
    topologyClosed: TopologyClosedEvent => Unit,
    topologyDescriptionChanged: TopologyDescriptionChangedEvent => Unit,
    topologyOpening: TopologyOpeningEvent => Unit,
    unpinned: /* pinType */ String => Unit
  ): TopologyEvents = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closed = js.Any.fromFunction0(closed), clusterTimeReceived = js.Any.fromFunction1(clusterTimeReceived), commandFailed = js.Any.fromFunction1(commandFailed), commandStarted = js.Any.fromFunction1(commandStarted), commandSucceeded = js.Any.fromFunction1(commandSucceeded), connectionCheckOutFailed = js.Any.fromFunction1(connectionCheckOutFailed), connectionCheckOutStarted = js.Any.fromFunction1(connectionCheckOutStarted), connectionCheckedIn = js.Any.fromFunction1(connectionCheckedIn), connectionCheckedOut = js.Any.fromFunction1(connectionCheckedOut), connectionClosed = js.Any.fromFunction1(connectionClosed), connectionCreated = js.Any.fromFunction1(connectionCreated), connectionPoolCleared = js.Any.fromFunction1(connectionPoolCleared), connectionPoolClosed = js.Any.fromFunction1(connectionPoolClosed), connectionPoolCreated = js.Any.fromFunction1(connectionPoolCreated), connectionPoolReady = js.Any.fromFunction1(connectionPoolReady), connectionReady = js.Any.fromFunction1(connectionReady), descriptionReceived = js.Any.fromFunction1(descriptionReceived), ended = js.Any.fromFunction0(ended), error = js.Any.fromFunction1(error), message = js.Any.fromFunction1(message), pinned = js.Any.fromFunction1(pinned), serverClosed = js.Any.fromFunction1(serverClosed), serverDescriptionChanged = js.Any.fromFunction1(serverDescriptionChanged), serverHeartbeatFailed = js.Any.fromFunction1(serverHeartbeatFailed), serverHeartbeatStarted = js.Any.fromFunction1(serverHeartbeatStarted), serverHeartbeatSucceeded = js.Any.fromFunction1(serverHeartbeatSucceeded), serverOpening = js.Any.fromFunction1(serverOpening), timeout = js.Any.fromFunction0(timeout), topologyClosed = js.Any.fromFunction1(topologyClosed), topologyDescriptionChanged = js.Any.fromFunction1(topologyDescriptionChanged), topologyOpening = js.Any.fromFunction1(topologyOpening), unpinned = js.Any.fromFunction1(unpinned))
    __obj.asInstanceOf[TopologyEvents]
  }
  
  extension [Self <: TopologyEvents](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setClosed(value: () => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
    
    inline def setClusterTimeReceived(value: /* clusterTime */ Document => Unit): Self = StObject.set(x, "clusterTimeReceived", js.Any.fromFunction1(value))
    
    inline def setCommandFailed(value: /* event */ CommandFailedEvent => Unit): Self = StObject.set(x, "commandFailed", js.Any.fromFunction1(value))
    
    inline def setCommandStarted(value: /* event */ CommandStartedEvent => Unit): Self = StObject.set(x, "commandStarted", js.Any.fromFunction1(value))
    
    inline def setCommandSucceeded(value: /* event */ CommandSucceededEvent => Unit): Self = StObject.set(x, "commandSucceeded", js.Any.fromFunction1(value))
    
    inline def setConnectionCheckOutFailed(value: /* event */ ConnectionCheckOutFailedEvent => Unit): Self = StObject.set(x, "connectionCheckOutFailed", js.Any.fromFunction1(value))
    
    inline def setConnectionCheckOutStarted(value: /* event */ ConnectionCheckOutStartedEvent => Unit): Self = StObject.set(x, "connectionCheckOutStarted", js.Any.fromFunction1(value))
    
    inline def setConnectionCheckedIn(value: /* event */ ConnectionCheckedInEvent => Unit): Self = StObject.set(x, "connectionCheckedIn", js.Any.fromFunction1(value))
    
    inline def setConnectionCheckedOut(value: /* event */ ConnectionCheckedOutEvent => Unit): Self = StObject.set(x, "connectionCheckedOut", js.Any.fromFunction1(value))
    
    inline def setConnectionClosed(value: /* event */ ConnectionClosedEvent => Unit): Self = StObject.set(x, "connectionClosed", js.Any.fromFunction1(value))
    
    inline def setConnectionCreated(value: /* event */ ConnectionCreatedEvent => Unit): Self = StObject.set(x, "connectionCreated", js.Any.fromFunction1(value))
    
    inline def setConnectionPoolCleared(value: /* event */ ConnectionPoolClearedEvent => Unit): Self = StObject.set(x, "connectionPoolCleared", js.Any.fromFunction1(value))
    
    inline def setConnectionPoolClosed(value: /* event */ ConnectionPoolClosedEvent => Unit): Self = StObject.set(x, "connectionPoolClosed", js.Any.fromFunction1(value))
    
    inline def setConnectionPoolCreated(value: /* event */ ConnectionPoolCreatedEvent => Unit): Self = StObject.set(x, "connectionPoolCreated", js.Any.fromFunction1(value))
    
    inline def setConnectionPoolReady(value: /* event */ ConnectionPoolReadyEvent => Unit): Self = StObject.set(x, "connectionPoolReady", js.Any.fromFunction1(value))
    
    inline def setConnectionReady(value: /* event */ ConnectionReadyEvent => Unit): Self = StObject.set(x, "connectionReady", js.Any.fromFunction1(value))
    
    inline def setDescriptionReceived(value: /* description */ ServerDescription => Unit): Self = StObject.set(x, "descriptionReceived", js.Any.fromFunction1(value))
    
    inline def setEnded(value: () => Unit): Self = StObject.set(x, "ended", js.Any.fromFunction0(value))
    
    inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setMessage(value: Any => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setPinned(value: /* pinType */ String => Unit): Self = StObject.set(x, "pinned", js.Any.fromFunction1(value))
    
    inline def setServerClosed(value: ServerClosedEvent => Unit): Self = StObject.set(x, "serverClosed", js.Any.fromFunction1(value))
    
    inline def setServerDescriptionChanged(value: ServerDescriptionChangedEvent => Unit): Self = StObject.set(x, "serverDescriptionChanged", js.Any.fromFunction1(value))
    
    inline def setServerHeartbeatFailed(value: /* event */ ServerHeartbeatFailedEvent => Unit): Self = StObject.set(x, "serverHeartbeatFailed", js.Any.fromFunction1(value))
    
    inline def setServerHeartbeatStarted(value: /* event */ ServerHeartbeatStartedEvent => Unit): Self = StObject.set(x, "serverHeartbeatStarted", js.Any.fromFunction1(value))
    
    inline def setServerHeartbeatSucceeded(value: /* event */ ServerHeartbeatSucceededEvent => Unit): Self = StObject.set(x, "serverHeartbeatSucceeded", js.Any.fromFunction1(value))
    
    inline def setServerOpening(value: ServerOpeningEvent => Unit): Self = StObject.set(x, "serverOpening", js.Any.fromFunction1(value))
    
    inline def setTimeout(value: () => Unit): Self = StObject.set(x, "timeout", js.Any.fromFunction0(value))
    
    inline def setTopologyClosed(value: TopologyClosedEvent => Unit): Self = StObject.set(x, "topologyClosed", js.Any.fromFunction1(value))
    
    inline def setTopologyDescriptionChanged(value: TopologyDescriptionChangedEvent => Unit): Self = StObject.set(x, "topologyDescriptionChanged", js.Any.fromFunction1(value))
    
    inline def setTopologyOpening(value: TopologyOpeningEvent => Unit): Self = StObject.set(x, "topologyOpening", js.Any.fromFunction1(value))
    
    inline def setUnpinned(value: /* pinType */ String => Unit): Self = StObject.set(x, "unpinned", js.Any.fromFunction1(value))
  }
}
