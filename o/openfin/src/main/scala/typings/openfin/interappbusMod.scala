package typings.openfin

import typings.node.eventsMod.EventEmitter
import typings.openfin.anon.SubscriberAdded
import typings.openfin.baseMod.Base
import typings.openfin.identityMod.Identity
import typings.openfin.transportMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interappbusMod {
  
  @JSImport("openfin/_v2/api/interappbus/interappbus", JSImport.Default)
  @js.native
  open class default protected () extends InterApplicationBus {
    def this(wire: typings.openfin.transportMod.default) = this()
  }
  
  @JSImport("openfin/_v2/api/interappbus/interappbus", "InterAppPayload")
  @js.native
  open class InterAppPayload () extends StObject {
    
    var destinationUuid: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[Any] = js.native
    
    var sourceUuid: String = js.native
    
    var sourceWindowName: String = js.native
    
    var topic: String = js.native
  }
  
  @js.native
  trait InterApplicationBus extends Base {
    
    var Channel: typings.openfin.interappbusChannelMod.Channel = js.native
    
    /* protected */ def createSubscriptionKey(uuid: String, name: String, topic: String): String = js.native
    
    /* private */ var emitSubscriverEvent: Any = js.native
    
    /* protected */ var emitter: EventEmitter = js.native
    
    var events: SubscriberAdded = js.native
    
    var on: Any = js.native
    
    /* protected */ def onmessage(message: Message[InterAppPayload]): Boolean = js.native
    
    /* private */ var processMessage: Any = js.native
    
    /**
      * Publishes a message to all applications running on OpenFin Runtime that
      * are subscribed to the specified topic.
      * @param { string } topic The topic on which the message is sent
      * @param { any } message The message to be published. Can be either a primitive
      * data type (string, number, or boolean) or composite data type (object, array)
      * that is composed of other primitive or composite data types
      * @return {Promise.<void>}
      * @tutorial InterApplicationBus.publish
      */
    def publish(topic: String, message: Any): js.Promise[Unit] = js.native
    
    /* private */ var refCounter: Any = js.native
    
    var removeAllListeners: Any = js.native
    
    /**
      * Sends a message to a specific application on a specific topic.
      * @param { Identity } destination The identity of the application to which the message is sent
      * @param { string } topic The topic on which the message is sent
      * @param { any } message The message to be sent. Can be either a primitive data
      * type (string, number, or boolean) or composite data type (object, array) that
      * is composed of other primitive or composite data types
      * @return {Promise.<void>}
      * @tutorial InterApplicationBus.send
      */
    def send(destination: Identity, topic: String, message: Any): js.Promise[Unit] = js.native
    
    /**
      * Subscribes to messages from the specified application on the specified topic.
      * If the subscription is for a uuid, [name], topic combination that has already
      * been published to upon subscription you will receive the last 20 missed messages
      * in the order they were published.
      * @param { Identity } source This object is described in the Identity in the typedef
      * @param { string } topic The topic on which the message is sent
      * @param { function } listener A function that is called when a message has
      * been received. It is passed the message, uuid and name of the sending application.
      * The message can be either a primitive data type (string, number, or boolean) or
      * composite data type (object, array) that is composed of other primitive or composite
      * data types
      * @return {Promise.<void>}
      * @tutorial InterApplicationBus.subscribe
      */
    def subscribe(source: Identity, topic: String, listener: Any): js.Promise[Unit] = js.native
    
    /**
      * Unsubscribes to messages from the specified application on the specified topic.
      * @param { Identity } source This object is described in the Identity in the typedef
      * @param { string } topic The topic on which the message is sent
      * @param { function } listener A callback previously registered with subscribe()
      * @return {Promise.<void>}
      * @tutorial InterApplicationBus.unsubscribe
      */
    def unsubscribe(source: Identity, topic: String, listener: Any): js.Promise[Unit] = js.native
  }
}
