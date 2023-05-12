package typings.nodeOsc

import typings.node.eventsMod.EventEmitter
import typings.nodeOsc.anon.Address
import typings.nodeOsc.nodeOscStrings.bundle
import typings.nodeOsc.nodeOscStrings.error
import typings.nodeOsc.nodeOscStrings.listening
import typings.nodeOsc.nodeOscStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-osc", "Bundle")
  @js.native
  open class Bundle protected () extends StObject {
    def this(elements: MessageLike*) = this()
    def this(timetag: Double, elements: MessageLike*) = this()
    
    def append(element: Bundle): Unit = js.native
    def append(element: MessageLike): Unit = js.native
    
    var elements: js.Array[Message] = js.native
    
    var timetag: Double = js.native
  }
  
  @JSImport("node-osc", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(host: String, port: Double) = this()
    
    /** Close the underlying socket */
    def close(): Unit = js.native
    def close(cb: ClientCloseCallback): Unit = js.native
    
    /** Send a message to the server */
    def send(addressOrMessage: String): Unit = js.native
    def send(addressOrMessage: Message): Unit = js.native
    def send(addressOrMessage: MessageLike): Unit = js.native
    def send(
      address: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [...Array<Message | MessageLike>, ClientSendCallback] is not an array type */ args: Array[ClientSendCallback | Message | MessageLike]
    ): Unit = js.native
    def send(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [...Array<Message | MessageLike>, ClientSendCallback] is not an array type */ args: Array[ClientSendCallback | Message | MessageLike]
    ): Unit = js.native
    /** Send a Bundle message to the server */
    def send(bundle: Bundle): Unit = js.native
    def send(bundle: Bundle, callback: ClientSendCallback): Unit = js.native
  }
  
  @JSImport("node-osc", "Message")
  @js.native
  open class Message protected () extends StObject {
    def this(address: String, args: ArgumentType*) = this()
    
    def append(arg: js.Array[ArgumentType]): Unit = js.native
    def append(arg: ArgumentType): Unit = js.native
  }
  
  @JSImport("node-osc", "Server")
  @js.native
  open class Server protected () extends EventEmitter {
    def this(port: Double, host: String) = this()
    def this(port: Double, host: String, cb: ServerCallback) = this()
    
    def close(): Unit = js.native
    def close(cb: ServerCallback): Unit = js.native
    
    /** Listen for all the messages received by the server or for a specific address */
    def on(event: String, listener: ServerMessageListener): this.type = js.native
    /**
      * Listen for all the bundles received by the server.
      *
      * @warning Bundle support is Experimental and subject to change at any point.
      *
      * @see https://github.com/MylesBorins/node-osc#listening-for-osc-bundles
      */
    @JSName("on")
    def on_bundle(event: bundle, listener: ServerBundleListener): this.type = js.native
    /** Listen for errors occurred during message decoding */
    @JSName("on")
    def on_error(event: error, listener: ServerErrorListner): this.type = js.native
    /** Listen for the listening event emitted as soon as the server is ready to receive messages */
    @JSName("on")
    def on_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: ServerMessageListener): this.type = js.native
  }
  
  trait Argument extends StObject {
    
    var `type`: String
    
    var value: Boolean | Double | String
  }
  object Argument {
    
    inline def apply(`type`: String, value: Boolean | Double | String): Argument = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argument] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Boolean | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ArgumentType = Boolean | Double | String | Argument
  
  type ClientCloseCallback = js.Function0[Unit]
  
  type ClientSendCallback = js.Function1[/* err */ js.Error | Null, Unit]
  
  type MessageLike = (Array[String | ArgumentType]) | Address
  
  trait RequestInfo extends StObject {
    
    var address: String
    
    var family: String
    
    var port: Double
    
    var size: Double
  }
  object RequestInfo {
    
    inline def apply(address: String, family: String, port: Double, size: Double): RequestInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestInfo] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type ServerBundleListener = js.Function1[/* bundle */ Bundle, Unit]
  
  type ServerCallback = js.Function0[Unit]
  
  type ServerErrorListner = js.Function1[/* error */ js.Error, Unit]
  
  type ServerMessageListener = js.Function2[/* message */ Array[String | ArgumentType], /* rinfo */ RequestInfo, Unit]
}
