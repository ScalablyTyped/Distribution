package typings.nodeRedRuntime.mod

import typings.nodeRedRuntime.anon.Client
import typings.nodeRedRuntime.anon.Topic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommsModule extends StObject {
  
  /**
    * Registers a new comms connection
    * @param opts
    * @param opts.client - the client connection
    */
  def addConnection(opts: Client): js.Promise[Unit] = js.native
  
  /**
    * Unregisters a comms connection
    * @param opts
    * @param opts.client - the client connection
    */
  def removeConnection(opts: Client): js.Promise[Unit] = js.native
  
  /**
    * Subscribes a comms connection to a given topic. Currently, all clients get
    * automatically subscribed to everything and cannot unsubscribe. Sending a subscribe
    * request will trigger retained messages to be sent.
    * @param opts
    * @param opts.client - the client connection
    * @param opts.topic - the topic to subscribe to
    */
  def subscribe(opts: Topic): js.Promise[Unit] = js.native
  
  /**
    * Unsubscribes a comms connection from a given topic
    * @param opts
    * @param opts.client - the client connection
    * @param opts.topic - the topic to unsubscribe from
    */
  def unsubscribe(opts: Topic): js.Promise[Unit] = js.native
}
object CommsModule {
  
  @scala.inline
  def apply(
    addConnection: Client => js.Promise[Unit],
    removeConnection: Client => js.Promise[Unit],
    subscribe: Topic => js.Promise[Unit],
    unsubscribe: Topic => js.Promise[Unit]
  ): CommsModule = {
    val __obj = js.Dynamic.literal(addConnection = js.Any.fromFunction1(addConnection), removeConnection = js.Any.fromFunction1(removeConnection), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[CommsModule]
  }
  
  @scala.inline
  implicit class CommsModuleMutableBuilder[Self <: CommsModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddConnection(value: Client => js.Promise[Unit]): Self = StObject.set(x, "addConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveConnection(value: Client => js.Promise[Unit]): Self = StObject.set(x, "removeConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscribe(value: Topic => js.Promise[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnsubscribe(value: Topic => js.Promise[Unit]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
  }
}
