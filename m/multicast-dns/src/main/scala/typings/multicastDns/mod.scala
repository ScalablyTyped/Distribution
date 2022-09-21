package typings.multicastDns

import typings.dnsPacket.mod.Answer
import typings.dnsPacket.mod.Packet
import typings.dnsPacket.mod.Question
import typings.dnsPacket.mod.RecordType
import typings.multicastDns.multicastDnsBooleans.`false`
import typings.multicastDns.multicastDnsStrings.error
import typings.multicastDns.multicastDnsStrings.message
import typings.multicastDns.multicastDnsStrings.query
import typings.multicastDns.multicastDnsStrings.ready
import typings.multicastDns.multicastDnsStrings.response
import typings.multicastDns.multicastDnsStrings.warning
import typings.node.dgramMod.RemoteInfo
import typings.node.dgramMod.Socket
import typings.node.dgramMod.SocketType
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a new mdns instance.
    *
    * @example
    * import makeMdns = require('multicast-dns');
    * const mdns = makeMdns();
    *
    * mdns.on('response', (response) => {
    *   console.log('got a response packet:', response);
    * });
    *
    * mdns.on('query', (query) => {
    *   console.log('got a query packet:', query);
    * });
    *
    * // lets query for an A record for 'brunhilde.local'
    * mdns.query({
    *   questions: [{
    *     name: 'brunhilde.local',
    *     type: 'A'
    *   }]
    * });
    */
  inline def apply(): MulticastDNS = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MulticastDNS]
  inline def apply(options: Options): MulticastDNS = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[MulticastDNS]
  
  @JSImport("multicast-dns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Required<dns-packet.dns-packet.Packet> */
  trait FullPacket extends StObject {
    
    var additionals: js.Array[Answer]
    
    var answers: js.Array[Answer]
    
    var authorities: js.Array[Answer]
    
    var flags: Double
    
    var id: Double
    
    var questions: js.Array[Question]
    
    var `type`: query | response
  }
  object FullPacket {
    
    inline def apply(
      additionals: js.Array[Answer],
      answers: js.Array[Answer],
      authorities: js.Array[Answer],
      flags: Double,
      id: Double,
      questions: js.Array[Question],
      `type`: query | response
    ): FullPacket = {
      val __obj = js.Dynamic.literal(additionals = additionals.asInstanceOf[js.Any], answers = answers.asInstanceOf[js.Any], authorities = authorities.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], questions = questions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullPacket]
    }
    
    extension [Self <: FullPacket](x: Self) {
      
      inline def setAdditionals(value: js.Array[Answer]): Self = StObject.set(x, "additionals", value.asInstanceOf[js.Any])
      
      inline def setAdditionalsVarargs(value: Answer*): Self = StObject.set(x, "additionals", js.Array(value*))
      
      inline def setAnswers(value: js.Array[Answer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
      
      inline def setAnswersVarargs(value: Answer*): Self = StObject.set(x, "answers", js.Array(value*))
      
      inline def setAuthorities(value: js.Array[Answer]): Self = StObject.set(x, "authorities", value.asInstanceOf[js.Any])
      
      inline def setAuthoritiesVarargs(value: Answer*): Self = StObject.set(x, "authorities", js.Array(value*))
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setQuestions(value: js.Array[Question]): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
      
      inline def setQuestionsVarargs(value: Question*): Self = StObject.set(x, "questions", js.Array(value*))
      
      inline def setType(value: query | response): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MulticastDNS extends EventEmitter {
    
    def addListener(event: error | warning, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    /**
      * Emitted when a packet is received.
      */
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function2[/* message */ FullPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    /**
      * Emitted when a query packet is received.
      */
    @JSName("addListener")
    def addListener_query(event: query, listener: js.Function2[/* query */ QueryPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    /**
      * Emitted after the socket was bound to.
      */
    @JSName("addListener")
    def addListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    /**
      * Emitted when a response packet is received.
      */
    @JSName("addListener")
    def addListener_response(
      event: response,
      listener: js.Function2[/* response */ ResponsePacket, /* rinfo */ RemoteInfo, Unit]
    ): this.type = js.native
    
    /**
      * Destroy the mDNS instance. Closes the UDP socket.
      */
    def destroy(): Unit = js.native
    def destroy(callback: js.Function0[Unit]): Unit = js.native
    
    def emit(event: error | warning, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, message: FullPacket, rinfo: RemoteInfo): Boolean = js.native
    @JSName("emit")
    def emit_query(event: query, query: QueryPacket, rinfo: RemoteInfo): Boolean = js.native
    @JSName("emit")
    def emit_ready(event: ready): Boolean = js.native
    @JSName("emit")
    def emit_response(event: response, response: ResponsePacket, rinfo: RemoteInfo): Boolean = js.native
    
    def listenerCount(`type`: ready | message | query | response | error | warning): Double = js.native
    
    def listeners(event: error | warning): js.Array[js.Function1[/* err */ js.Error, Unit]] = js.native
    @JSName("listeners")
    def listeners_message(event: message): js.Array[js.Function2[/* message */ FullPacket, /* rinfo */ RemoteInfo, Unit]] = js.native
    @JSName("listeners")
    def listeners_query(event: query): js.Array[js.Function2[/* query */ QueryPacket, /* rinfo */ RemoteInfo, Unit]] = js.native
    @JSName("listeners")
    def listeners_ready(event: ready): js.Array[js.Function0[Unit]] = js.native
    @JSName("listeners")
    def listeners_response(event: response): js.Array[js.Function2[/* response */ ResponsePacket, /* rinfo */ RemoteInfo, Unit]] = js.native
    
    def off(event: error | warning, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("off")
    def off_message(event: message, listener: js.Function2[/* message */ FullPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    @JSName("off")
    def off_query(event: query, listener: js.Function2[/* query */ QueryPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    @JSName("off")
    def off_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    @JSName("off")
    def off_response(
      event: response,
      listener: js.Function2[/* response */ ResponsePacket, /* rinfo */ RemoteInfo, Unit]
    ): this.type = js.native
    
    def on(event: error | warning, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    /**
      * Emitted when a packet is received.
      */
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* message */ FullPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    /**
      * Emitted when a query packet is received.
      *
      * @example
      * mdns.on('query', (query) => {
      *   if (query.questions[0] && query.questions[0].name === 'brunhilde.local') {
      *     mdns.respond(someResponse);
      *   }
      * });
      */
    @JSName("on")
    def on_query(event: query, listener: js.Function2[/* query */ QueryPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    /**
      * Emitted after the socket was bound to.
      */
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    /**
      * Emitted when a response packet is received.
      */
    @JSName("on")
    def on_response(
      event: response,
      listener: js.Function2[/* response */ ResponsePacket, /* rinfo */ RemoteInfo, Unit]
    ): this.type = js.native
    
    def once(event: error | warning, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    /**
      * Emitted when a packet is received.
      */
    @JSName("once")
    def once_message(event: message, listener: js.Function2[/* message */ FullPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    /**
      * Emitted when a query packet is received.
      */
    @JSName("once")
    def once_query(event: query, listener: js.Function2[/* query */ QueryPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    /**
      * Emitted after the socket was bound to.
      */
    @JSName("once")
    def once_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    /**
      * Emitted when a response packet is received.
      */
    @JSName("once")
    def once_response(
      event: response,
      listener: js.Function2[/* response */ ResponsePacket, /* rinfo */ RemoteInfo, Unit]
    ): this.type = js.native
    
    def prependListener(event: error | warning, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(event: message, listener: js.Function2[/* message */ FullPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_query(event: query, listener: js.Function2[/* query */ QueryPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_response(
      event: response,
      listener: js.Function2[/* response */ ResponsePacket, /* rinfo */ RemoteInfo, Unit]
    ): this.type = js.native
    
    def prependOnceListener(event: error | warning, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_message(event: message, listener: js.Function2[/* message */ FullPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_query(event: query, listener: js.Function2[/* query */ QueryPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_response(
      event: response,
      listener: js.Function2[/* response */ ResponsePacket, /* rinfo */ RemoteInfo, Unit]
    ): this.type = js.native
    
    /**
      * Send a DNS query.
      *
      * @param callback Will be called when the packet was sent.
      *
      * @example
      * mdns.query('brunhilde.local', 'A');
      * mdns.query([{name:'brunhilde.local', type:'A'}]);
      * mdns.query({
      *   questions: [{name:'brunhilde.local', type:'A'}]
      * });
      */
    def query(query: String): Unit = js.native
    def query(
      query: String,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(query: String, rinfo: Unit, callback: js.Function2[js.Error | Null, js.UndefOr[Double], Unit]): Unit = js.native
    def query(query: String, rinfo: RemoteInfoOutgoing): Unit = js.native
    def query(
      query: String,
      rinfo: RemoteInfoOutgoing,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(
      query: String,
      `type`: Unit,
      rinfo: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(query: String, `type`: Unit, rinfo: RemoteInfoOutgoing): Unit = js.native
    def query(
      query: String,
      `type`: Unit,
      rinfo: RemoteInfoOutgoing,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(query: String, `type`: RecordType): Unit = js.native
    def query(
      query: String,
      `type`: RecordType,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(
      query: String,
      `type`: RecordType,
      rinfo: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(query: String, `type`: RecordType, rinfo: RemoteInfoOutgoing): Unit = js.native
    def query(
      query: String,
      `type`: RecordType,
      rinfo: RemoteInfoOutgoing,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(query: js.Array[Question]): Unit = js.native
    def query(
      query: js.Array[Question],
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(
      query: js.Array[Question],
      rinfo: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(query: js.Array[Question], rinfo: RemoteInfoOutgoing): Unit = js.native
    def query(
      query: js.Array[Question],
      rinfo: RemoteInfoOutgoing,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(query: QueryOutgoingPacket): Unit = js.native
    def query(
      query: QueryOutgoingPacket,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(
      query: QueryOutgoingPacket,
      rinfo: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def query(query: QueryOutgoingPacket, rinfo: RemoteInfoOutgoing): Unit = js.native
    def query(
      query: QueryOutgoingPacket,
      rinfo: RemoteInfoOutgoing,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    def rawListeners(event: error | warning): js.Array[js.Function1[/* err */ js.Error, Unit]] = js.native
    @JSName("rawListeners")
    def rawListeners_message(event: message): js.Array[js.Function2[/* message */ FullPacket, /* rinfo */ RemoteInfo, Unit]] = js.native
    @JSName("rawListeners")
    def rawListeners_query(event: query): js.Array[js.Function2[/* query */ QueryPacket, /* rinfo */ RemoteInfo, Unit]] = js.native
    @JSName("rawListeners")
    def rawListeners_ready(event: ready): js.Array[js.Function0[Unit]] = js.native
    @JSName("rawListeners")
    def rawListeners_response(event: response): js.Array[js.Function2[/* response */ ResponsePacket, /* rinfo */ RemoteInfo, Unit]] = js.native
    
    def removeAllListeners(event: ready | message | query | response | error | warning): this.type = js.native
    
    def removeListener(event: error | warning, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_message(event: message, listener: js.Function2[/* message */ FullPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_query(event: query, listener: js.Function2[/* query */ QueryPacket, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_response(
      event: response,
      listener: js.Function2[/* response */ ResponsePacket, /* rinfo */ RemoteInfo, Unit]
    ): this.type = js.native
    
    /**
      * Send a DNS response.
      *
      * @param callback Will be called when the packet was sent.
      *
      * @example
      * mdns.respond([{name:'brunhilde.local', type:'A', data:'192.158.1.5'}]);
      * mdns.respond({
      *   answers: [{name:'brunhilde.local', type:'A', data:'192.158.1.5'}]
      * });
      */
    def respond(response: js.Array[Answer]): Unit = js.native
    def respond(
      response: js.Array[Answer],
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def respond(
      response: js.Array[Answer],
      rinfo: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def respond(response: js.Array[Answer], rinfo: RemoteInfoOutgoing): Unit = js.native
    def respond(
      response: js.Array[Answer],
      rinfo: RemoteInfoOutgoing,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def respond(response: ResponseOutgoingPacket): Unit = js.native
    def respond(
      response: ResponseOutgoingPacket,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def respond(
      response: ResponseOutgoingPacket,
      rinfo: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def respond(response: ResponseOutgoingPacket, rinfo: RemoteInfoOutgoing): Unit = js.native
    def respond(
      response: ResponseOutgoingPacket,
      rinfo: RemoteInfoOutgoing,
      callback: js.Function2[/* error */ js.Error | Null, /* bytes */ js.UndefOr[Double], Unit]
    ): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The interface to bind to or `false` to prevent binding.
      *
      * @default Options.interface
      */
    var bind: js.UndefOr[`false` | String] = js.undefined
    
    /**
      * Explicitly specify a network interface. Will use all interfaces when not specified.
      */
    var interface: js.UndefOr[String] = js.undefined
    
    /**
      * Set the UDP ip.
      */
    var ip: js.UndefOr[String] = js.undefined
    
    /**
      * Receive your own packets.
      *
      * @default true
      */
    var loopback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use UDP multicasting.
      *
      * @default true
      */
    var multicast: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the UDP port.
      *
      * @default 5353
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the `reuseAddr` option when creating the socket.
      *
      * @default true
      */
    var reuseAddr: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Explicitly pass a constructed socket to use.
      */
    var socket: js.UndefOr[Socket] = js.undefined
    
    /**
      * Set the multicast ttl.
      *
      * @default 255
      */
    var ttl: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the socket type.
      *
      * @default 'udp4'
      */
    var `type`: js.UndefOr[SocketType] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBind(value: `false` | String): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
      
      inline def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setLoopback(value: Boolean): Self = StObject.set(x, "loopback", value.asInstanceOf[js.Any])
      
      inline def setLoopbackUndefined: Self = StObject.set(x, "loopback", js.undefined)
      
      inline def setMulticast(value: Boolean): Self = StObject.set(x, "multicast", value.asInstanceOf[js.Any])
      
      inline def setMulticastUndefined: Self = StObject.set(x, "multicast", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReuseAddr(value: Boolean): Self = StObject.set(x, "reuseAddr", value.asInstanceOf[js.Any])
      
      inline def setReuseAddrUndefined: Self = StObject.set(x, "reuseAddr", js.undefined)
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setType(value: SocketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait QueryOutgoingPacket
    extends StObject
       with Packet {
    
    @JSName("questions")
    var questions_QueryOutgoingPacket: js.Array[Question]
  }
  object QueryOutgoingPacket {
    
    inline def apply(questions: js.Array[Question]): QueryOutgoingPacket = {
      val __obj = js.Dynamic.literal(questions = questions.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryOutgoingPacket]
    }
    
    extension [Self <: QueryOutgoingPacket](x: Self) {
      
      inline def setQuestions(value: js.Array[Question]): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
      
      inline def setQuestionsVarargs(value: Question*): Self = StObject.set(x, "questions", js.Array(value*))
    }
  }
  
  trait QueryPacket
    extends StObject
       with FullPacket {
    
    @JSName("type")
    var type_QueryPacket: query
  }
  object QueryPacket {
    
    inline def apply(
      additionals: js.Array[Answer],
      answers: js.Array[Answer],
      authorities: js.Array[Answer],
      flags: Double,
      id: Double,
      questions: js.Array[Question]
    ): QueryPacket = {
      val __obj = js.Dynamic.literal(additionals = additionals.asInstanceOf[js.Any], answers = answers.asInstanceOf[js.Any], authorities = authorities.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], questions = questions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("query")
      __obj.asInstanceOf[QueryPacket]
    }
    
    extension [Self <: QueryPacket](x: Self) {
      
      inline def setType(value: query): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoteInfoOutgoing extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var port: Double
  }
  object RemoteInfoOutgoing {
    
    inline def apply(port: Double): RemoteInfoOutgoing = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteInfoOutgoing]
    }
    
    extension [Self <: RemoteInfoOutgoing](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseOutgoingPacket
    extends StObject
       with Packet {
    
    @JSName("answers")
    var answers_ResponseOutgoingPacket: js.Array[Answer]
  }
  object ResponseOutgoingPacket {
    
    inline def apply(answers: js.Array[Answer]): ResponseOutgoingPacket = {
      val __obj = js.Dynamic.literal(answers = answers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseOutgoingPacket]
    }
    
    extension [Self <: ResponseOutgoingPacket](x: Self) {
      
      inline def setAnswers(value: js.Array[Answer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
      
      inline def setAnswersVarargs(value: Answer*): Self = StObject.set(x, "answers", js.Array(value*))
    }
  }
  
  trait ResponsePacket
    extends StObject
       with FullPacket {
    
    @JSName("type")
    var type_ResponsePacket: response
  }
  object ResponsePacket {
    
    inline def apply(
      additionals: js.Array[Answer],
      answers: js.Array[Answer],
      authorities: js.Array[Answer],
      flags: Double,
      id: Double,
      questions: js.Array[Question]
    ): ResponsePacket = {
      val __obj = js.Dynamic.literal(additionals = additionals.asInstanceOf[js.Any], answers = answers.asInstanceOf[js.Any], authorities = authorities.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], questions = questions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("response")
      __obj.asInstanceOf[ResponsePacket]
    }
    
    extension [Self <: ResponsePacket](x: Self) {
      
      inline def setType(value: response): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
