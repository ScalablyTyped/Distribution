package typings.mosca

import org.scalablytyped.runtime.StringDictionary
import typings.mosca.anon.CertPath
import typings.mosca.anon.Port
import typings.mosca.moscaStrings.clientConnected
import typings.mosca.moscaStrings.clientDisconnected
import typings.mosca.moscaStrings.clientDisconnecting
import typings.mosca.moscaStrings.published
import typings.mosca.moscaStrings.ready
import typings.mosca.moscaStrings.subscribed
import typings.mosca.moscaStrings.unsubscribed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mosca", "Authorizer")
  @js.native
  open class Authorizer () extends StObject {
    
    def addUser(
      username: String,
      password: String,
      authorizePublish: String,
      authorizeSubscribe: String,
      callback: js.Function1[/* func */ Any, Unit]
    ): Unit = js.native
    
    var users: Any = js.native
  }
  
  @JSImport("mosca", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(connection: Any, server: Server) = this()
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    def close(callback: js.Function0[Unit], reason: String): Unit = js.native
    def close(callback: Unit, reason: String): Unit = js.native
    
    var connection: Any = js.native
    
    var id: String = js.native
    
    var inflight: Any = js.native
    
    var inflightCounter: Double = js.native
    
    var logger: Any = js.native
    
    var nextId: Double = js.native
    
    var server: Server = js.native
    
    var subscriptions: Any = js.native
  }
  
  @JSImport("mosca", "Server")
  @js.native
  open class Server protected () extends StObject {
    def this(opts: ServerOptions) = this()
    def this(opts: ServerOptions, callback: js.Function0[Unit]) = this()
    
    def attachHttpServer(server: Any): Unit = js.native
    def attachHttpServer(server: Any, path: Any): Unit = js.native
    
    def authenticate(
      client: Client,
      username: String,
      password: String,
      callback: js.Function2[/* obj */ Any, /* authenticated */ Boolean, Unit]
    ): Unit = js.native
    
    def authorizeForward(
      client: Client,
      packet: Packet,
      callback: js.Function2[/* obj */ Any, /* authorized */ Boolean, Unit]
    ): Unit = js.native
    
    def authorizePublish(
      client: Client,
      topic: String,
      payload: String,
      callback: js.Function2[/* obj */ Any, /* authorized */ Boolean, Unit]
    ): Unit = js.native
    
    def authorizeSubscribe(
      client: Client,
      topic: String,
      callback: js.Function2[/* obj */ Any, /* authorized */ Boolean, Unit]
    ): Unit = js.native
    
    var clients: Any = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    var closed: Boolean = js.native
    
    def deleteOfflinePacket(client: Client, messageId: Double, callback: js.Function0[Unit]): Unit = js.native
    
    def forwardOfflinePackets(client: Client, callback: js.Function0[Unit]): Unit = js.native
    
    def forwardRetained(pattern: String, client: Client, callback: js.Function0[Unit]): Unit = js.native
    
    var id: String = js.native
    
    var modernOpts: Any = js.native
    
    def on(
      when: clientConnected | clientDisconnecting | clientDisconnected,
      callback: js.Function1[/* client */ Client, Unit]
    ): Unit = js.native
    def on(
      when: subscribed | unsubscribed,
      callback: js.Function2[/* topic */ String, /* client */ Client, Unit]
    ): Unit = js.native
    def on(when: String, callback: js.Function0[Unit]): Unit = js.native
    def on(when: String, callback: js.Function1[/* client */ Client, Unit]): Unit = js.native
    def on(when: String, callback: js.Function2[/* packet */ Packet, /* client */ Client, Unit]): Unit = js.native
    @JSName("on")
    def on_published(when: published, callback: js.Function2[/* packet */ Packet, /* client */ Client, Unit]): Unit = js.native
    @JSName("on")
    def on_ready(when: ready, callback: js.Function0[Unit]): Unit = js.native
    
    def once(when: String, callback: js.Function0[Unit]): Unit = js.native
    
    var opts: Any = js.native
    
    def persistClient(client: Client, callback: js.Function0[Unit]): Unit = js.native
    
    def publish(message: Message, callback: js.Function2[/* obj */ Any, /* packet */ Packet, Unit]): Unit = js.native
    
    def published(packet: Packet, client: Client, callback: js.Function1[/* obj */ Any, Unit]): Unit = js.native
    
    def restoreClientSubscriptions(client: Client, callback: js.Function0[Unit]): Unit = js.native
    
    def storePacket(packet: Packet, callback: js.Function0[Unit]): Unit = js.native
    
    def subscribe(topic: String, callback: js.Function0[Unit], done: js.Function0[Unit]): Unit = js.native
    
    def updateOfflinePacket(
      client: Client,
      originMessageId: Double,
      packet: Packet,
      callback: js.Function2[/* obj */ Any, /* packet */ Packet, Unit]
    ): Unit = js.native
  }
  
  @JSImport("mosca", "Stats")
  @js.native
  open class Stats () extends StObject {
    
    var connectedClients: Double = js.native
    
    var lastIntervalConnectedClients: Double = js.native
    
    var lastIntervalPublishedMessages: Double = js.native
    
    var load: Any = js.native
    
    var maxConnectedClients: Double = js.native
    
    var publishedMessages: Double = js.native
    
    var started: js.Date = js.native
    
    def wire(server: Server): Unit = js.native
  }
  
  object persistence {
    
    @JSImport("mosca", "persistence.LevelUp")
    @js.native
    val LevelUp: FactoryFunc = js.native
    
    @JSImport("mosca", "persistence.Memory")
    @js.native
    val Memory: FactoryFunc = js.native
    
    @JSImport("mosca", "persistence.Mongo")
    @js.native
    val Mongo: FactoryFunc = js.native
    
    @JSImport("mosca", "persistence.Redis")
    @js.native
    val Redis: FactoryFunc = js.native
    
    type FactoryFunc = js.Function1[/* options */ StringDictionary[Any], Persistence]
    
    trait Persistence extends StObject {
      
      def wire(server: Server): Unit
    }
    object Persistence {
      
      inline def apply(wire: Server => Unit): Persistence = {
        val __obj = js.Dynamic.literal(wire = js.Any.fromFunction1(wire))
        __obj.asInstanceOf[Persistence]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Persistence] (val x: Self) extends AnyVal {
        
        inline def setWire(value: Server => Unit): Self = StObject.set(x, "wire", js.Any.fromFunction1(value))
      }
    }
  }
  
  trait Message extends StObject {
    
    var payload: Any
    
    var qos: Double
    
    var retain: Boolean
    
    var topic: String
  }
  object Message {
    
    inline def apply(payload: Any, qos: Double, retain: Boolean, topic: String): Message = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setQos(value: Double): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait Packet extends StObject {
    
    var messageId: String
    
    var payload: Any
    
    var qos: Double
    
    var retain: Boolean
    
    var topic: String
  }
  object Packet {
    
    inline def apply(messageId: String, payload: Any, qos: Double, retain: Boolean, topic: String): Packet = {
      val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Packet] (val x: Self) extends AnyVal {
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setQos(value: Double): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerOptions extends StObject {
    
    var allowNonSecure: js.UndefOr[Boolean] = js.undefined
    
    var ascoltatore: js.UndefOr[Any] = js.undefined
    
    var backend: js.UndefOr[Any] = js.undefined
    
    var bundle: js.UndefOr[Any] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var http: js.UndefOr[Port] = js.undefined
    
    var logger: js.UndefOr[Any] = js.undefined
    
    var maxInflightMessages: js.UndefOr[Double] = js.undefined
    
    var persistence: js.UndefOr[Any] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var secure: js.UndefOr[CertPath] = js.undefined
    
    var static: js.UndefOr[Any] = js.undefined
    
    var stats: js.UndefOr[Any] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowNonSecure(value: Boolean): Self = StObject.set(x, "allowNonSecure", value.asInstanceOf[js.Any])
      
      inline def setAllowNonSecureUndefined: Self = StObject.set(x, "allowNonSecure", js.undefined)
      
      inline def setAscoltatore(value: Any): Self = StObject.set(x, "ascoltatore", value.asInstanceOf[js.Any])
      
      inline def setAscoltatoreUndefined: Self = StObject.set(x, "ascoltatore", js.undefined)
      
      inline def setBackend(value: Any): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      inline def setBundle(value: Any): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
      
      inline def setBundleUndefined: Self = StObject.set(x, "bundle", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHttp(value: Port): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxInflightMessages(value: Double): Self = StObject.set(x, "maxInflightMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxInflightMessagesUndefined: Self = StObject.set(x, "maxInflightMessages", js.undefined)
      
      inline def setPersistence(value: Any): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSecure(value: CertPath): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setStatic(value: Any): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      inline def setStats(value: Any): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
}
