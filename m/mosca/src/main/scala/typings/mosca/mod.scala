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
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mosca", "Authorizer")
  @js.native
  class Authorizer () extends StObject {
    
    def addUser(
      username: String,
      password: String,
      authorizePublish: String,
      authorizeSubscribe: String,
      callback: js.Function1[/* func */ js.Any, Unit]
    ): Unit = js.native
    
    var users: js.Any = js.native
  }
  
  @JSImport("mosca", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(connection: js.Any, server: Server) = this()
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    def close(callback: js.Function0[Unit], reason: String): Unit = js.native
    def close(callback: Unit, reason: String): Unit = js.native
    
    var connection: js.Any = js.native
    
    var id: String = js.native
    
    var inflight: js.Any = js.native
    
    var inflightCounter: Double = js.native
    
    var logger: js.Any = js.native
    
    var nextId: Double = js.native
    
    var server: Server = js.native
    
    var subscriptions: js.Any = js.native
  }
  
  @JSImport("mosca", "Server")
  @js.native
  class Server protected () extends StObject {
    def this(opts: ServerOptions) = this()
    def this(opts: ServerOptions, callback: js.Function0[Unit]) = this()
    
    def attachHttpServer(server: js.Any): Unit = js.native
    def attachHttpServer(server: js.Any, path: js.Any): Unit = js.native
    
    def authenticate(
      client: Client,
      username: String,
      password: String,
      callback: js.Function2[/* obj */ js.Any, /* authenticated */ Boolean, Unit]
    ): Unit = js.native
    
    def authorizeForward(
      client: Client,
      packet: Packet,
      callback: js.Function2[/* obj */ js.Any, /* authorized */ Boolean, Unit]
    ): Unit = js.native
    
    def authorizePublish(
      client: Client,
      topic: String,
      payload: String,
      callback: js.Function2[/* obj */ js.Any, /* authorized */ Boolean, Unit]
    ): Unit = js.native
    
    def authorizeSubscribe(
      client: Client,
      topic: String,
      callback: js.Function2[/* obj */ js.Any, /* authorized */ Boolean, Unit]
    ): Unit = js.native
    
    var clients: js.Any = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    var closed: Boolean = js.native
    
    def deleteOfflinePacket(client: Client, messageId: Double, callback: js.Function0[Unit]): Unit = js.native
    
    def forwardOfflinePackets(client: Client, callback: js.Function0[Unit]): Unit = js.native
    
    def forwardRetained(pattern: String, client: Client, callback: js.Function0[Unit]): Unit = js.native
    
    var id: String = js.native
    
    var modernOpts: js.Any = js.native
    
    def on(when: String, callback: js.Function0[Unit]): Unit = js.native
    def on(when: String, callback: js.Function1[/* client */ Client, Unit]): Unit = js.native
    def on(when: String, callback: js.Function2[/* packet */ Packet, /* client */ Client, Unit]): Unit = js.native
    @JSName("on")
    def on_clientConnected(when: clientConnected, callback: js.Function1[/* client */ Client, Unit]): Unit = js.native
    @JSName("on")
    def on_clientDisconnected(when: clientDisconnected, callback: js.Function1[/* client */ Client, Unit]): Unit = js.native
    @JSName("on")
    def on_clientDisconnecting(when: clientDisconnecting, callback: js.Function1[/* client */ Client, Unit]): Unit = js.native
    @JSName("on")
    def on_published(when: published, callback: js.Function2[/* packet */ Packet, /* client */ Client, Unit]): Unit = js.native
    @JSName("on")
    def on_ready(when: ready, callback: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_subscribed(when: subscribed, callback: js.Function2[/* topic */ String, /* client */ Client, Unit]): Unit = js.native
    @JSName("on")
    def on_unsubscribed(when: unsubscribed, callback: js.Function2[/* topic */ String, /* client */ Client, Unit]): Unit = js.native
    
    def once(when: String, callback: js.Function0[Unit]): Unit = js.native
    
    var opts: js.Any = js.native
    
    def persistClient(client: Client, callback: js.Function0[Unit]): Unit = js.native
    
    def publish(message: Message, callback: js.Function2[/* obj */ js.Any, /* packet */ Packet, Unit]): Unit = js.native
    
    def published(packet: Packet, client: Client, callback: js.Function1[/* obj */ js.Any, Unit]): Unit = js.native
    
    def restoreClientSubscriptions(client: Client, callback: js.Function0[Unit]): Unit = js.native
    
    def storePacket(packet: Packet, callback: js.Function0[Unit]): Unit = js.native
    
    def subscribe(topic: String, callback: js.Function0[Unit], done: js.Function0[Unit]): Unit = js.native
    
    def updateOfflinePacket(
      client: Client,
      originMessageId: Double,
      packet: Packet,
      callback: js.Function2[/* obj */ js.Any, /* packet */ Packet, Unit]
    ): Unit = js.native
  }
  
  @JSImport("mosca", "Stats")
  @js.native
  class Stats () extends StObject {
    
    var connectedClients: Double = js.native
    
    var lastIntervalConnectedClients: Double = js.native
    
    var lastIntervalPublishedMessages: Double = js.native
    
    var load: js.Any = js.native
    
    var maxConnectedClients: Double = js.native
    
    var publishedMessages: Double = js.native
    
    var started: Date = js.native
    
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
    
    type FactoryFunc = js.Function1[/* options */ StringDictionary[js.Any], Persistence]
    
    trait Persistence extends StObject {
      
      def wire(server: Server): Unit
    }
    object Persistence {
      
      inline def apply(wire: Server => Unit): Persistence = {
        val __obj = js.Dynamic.literal(wire = js.Any.fromFunction1(wire))
        __obj.asInstanceOf[Persistence]
      }
      
      extension [Self <: Persistence](x: Self) {
        
        inline def setWire(value: Server => Unit): Self = StObject.set(x, "wire", js.Any.fromFunction1(value))
      }
    }
  }
  
  trait Message extends StObject {
    
    var payload: js.Any
    
    var qos: Double
    
    var retain: Boolean
    
    var topic: String
  }
  object Message {
    
    inline def apply(payload: js.Any, qos: Double, retain: Boolean, topic: String): Message = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setQos(value: Double): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait Packet extends StObject {
    
    var messageId: String
    
    var payload: js.Any
    
    var qos: Double
    
    var retain: Boolean
    
    var topic: String
  }
  object Packet {
    
    inline def apply(messageId: String, payload: js.Any, qos: Double, retain: Boolean, topic: String): Packet = {
      val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    extension [Self <: Packet](x: Self) {
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setQos(value: Double): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerOptions extends StObject {
    
    var allowNonSecure: js.UndefOr[Boolean] = js.undefined
    
    var ascoltatore: js.UndefOr[js.Any] = js.undefined
    
    var backend: js.UndefOr[js.Any] = js.undefined
    
    var bundle: js.UndefOr[js.Any] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var http: js.UndefOr[Port] = js.undefined
    
    var logger: js.UndefOr[js.Any] = js.undefined
    
    var maxInflightMessages: js.UndefOr[Double] = js.undefined
    
    var persistence: js.UndefOr[js.Any] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var secure: js.UndefOr[CertPath] = js.undefined
    
    var static: js.UndefOr[js.Any] = js.undefined
    
    var stats: js.UndefOr[js.Any] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setAllowNonSecure(value: Boolean): Self = StObject.set(x, "allowNonSecure", value.asInstanceOf[js.Any])
      
      inline def setAllowNonSecureUndefined: Self = StObject.set(x, "allowNonSecure", js.undefined)
      
      inline def setAscoltatore(value: js.Any): Self = StObject.set(x, "ascoltatore", value.asInstanceOf[js.Any])
      
      inline def setAscoltatoreUndefined: Self = StObject.set(x, "ascoltatore", js.undefined)
      
      inline def setBackend(value: js.Any): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      inline def setBundle(value: js.Any): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
      
      inline def setBundleUndefined: Self = StObject.set(x, "bundle", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHttp(value: Port): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxInflightMessages(value: Double): Self = StObject.set(x, "maxInflightMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxInflightMessagesUndefined: Self = StObject.set(x, "maxInflightMessages", js.undefined)
      
      inline def setPersistence(value: js.Any): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSecure(value: CertPath): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setStatic(value: js.Any): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      inline def setStats(value: js.Any): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
}
