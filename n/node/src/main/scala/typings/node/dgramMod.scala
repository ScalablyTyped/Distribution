package typings.node

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.netMod.AddressInfo
import typings.node.nodeStrings.IPv4
import typings.node.nodeStrings.IPv6
import typings.node.nodeStrings.close
import typings.node.nodeStrings.connect
import typings.node.nodeStrings.error
import typings.node.nodeStrings.listening
import typings.node.nodeStrings.message
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dgramMod {
  
  @JSImport("dgram", "Socket")
  @js.native
  class Socket () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    
    def addMembership(multicastAddress: java.lang.String): Unit = js.native
    def addMembership(multicastAddress: java.lang.String, multicastInterface: java.lang.String): Unit = js.native
    
    /**
      * Tells the kernel to join a source-specific multicast channel at the given
      * `sourceAddress` and `groupAddress`, using the `multicastInterface` with the
      * `IP_ADD_SOURCE_MEMBERSHIP` socket option.
      * If the `multicastInterface` argument
      * is not specified, the operating system will choose one interface and will add
      * membership to it.
      * To add membership to every available interface, call
      * `socket.addSourceSpecificMembership()` multiple times, once per interface.
      */
    def addSourceSpecificMembership(sourceAddress: java.lang.String, groupAddress: java.lang.String): Unit = js.native
    def addSourceSpecificMembership(
      sourceAddress: java.lang.String,
      groupAddress: java.lang.String,
      multicastInterface: java.lang.String
    ): Unit = js.native
    
    def address(): AddressInfo = js.native
    
    def bind(): Unit = js.native
    def bind(callback: js.Function0[Unit]): Unit = js.native
    def bind(options: BindOptions): Unit = js.native
    def bind(options: BindOptions, callback: js.Function0[Unit]): Unit = js.native
    def bind(port: js.UndefOr[scala.Nothing], address: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def bind(port: js.UndefOr[scala.Nothing], address: java.lang.String): Unit = js.native
    def bind(port: js.UndefOr[scala.Nothing], address: java.lang.String, callback: js.Function0[Unit]): Unit = js.native
    def bind(port: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def bind(port: Double): Unit = js.native
    def bind(port: Double, address: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def bind(port: Double, address: java.lang.String): Unit = js.native
    def bind(port: Double, address: java.lang.String, callback: js.Function0[Unit]): Unit = js.native
    def bind(port: Double, callback: js.Function0[Unit]): Unit = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    def connect(port: Double): Unit = js.native
    def connect(port: Double, address: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def connect(port: Double, address: java.lang.String): Unit = js.native
    def connect(port: Double, address: java.lang.String, callback: js.Function0[Unit]): Unit = js.native
    def connect(port: Double, callback: js.Function0[Unit]): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    def dropMembership(multicastAddress: java.lang.String): Unit = js.native
    def dropMembership(multicastAddress: java.lang.String, multicastInterface: java.lang.String): Unit = js.native
    
    /**
      * Instructs the kernel to leave a source-specific multicast channel at the given
      * `sourceAddress` and `groupAddress` using the `IP_DROP_SOURCE_MEMBERSHIP`
      * socket option. This method is automatically called by the kernel when the
      * socket is closed or the process terminates, so most apps will never have
      * reason to call this.
      *
      * If `multicastInterface` is not specified, the operating system will attempt to
      * drop membership on all valid interfaces.
      */
    def dropSourceSpecificMembership(sourceAddress: java.lang.String, groupAddress: java.lang.String): Unit = js.native
    def dropSourceSpecificMembership(
      sourceAddress: java.lang.String,
      groupAddress: java.lang.String,
      multicastInterface: java.lang.String
    ): Unit = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_connect(event: connect): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_listening(event: listening): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, msg: Buffer, rinfo: RemoteInfo): Boolean = js.native
    
    def getRecvBufferSize(): Double = js.native
    
    def getSendBufferSize(): Double = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    
    def ref(): this.type = js.native
    
    def remoteAddress(): AddressInfo = js.native
    
    def send(msg: java.lang.String): Unit = js.native
    def send(msg: java.lang.String, callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]): Unit = js.native
    def send(msg: java.lang.String, offset: Double, length: Double): Unit = js.native
    def send(
      msg: java.lang.String,
      offset: Double,
      length: Double,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: java.lang.String,
      offset: Double,
      length: Double,
      port: js.UndefOr[scala.Nothing],
      address: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: java.lang.String,
      offset: Double,
      length: Double,
      port: js.UndefOr[scala.Nothing],
      address: java.lang.String
    ): Unit = js.native
    def send(
      msg: java.lang.String,
      offset: Double,
      length: Double,
      port: js.UndefOr[scala.Nothing],
      address: java.lang.String,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: java.lang.String,
      offset: Double,
      length: Double,
      port: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: java.lang.String, offset: Double, length: Double, port: Double): Unit = js.native
    def send(
      msg: java.lang.String,
      offset: Double,
      length: Double,
      port: Double,
      address: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: java.lang.String, offset: Double, length: Double, port: Double, address: java.lang.String): Unit = js.native
    def send(
      msg: java.lang.String,
      offset: Double,
      length: Double,
      port: Double,
      address: java.lang.String,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: java.lang.String,
      offset: Double,
      length: Double,
      port: Double,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: java.lang.String,
      port: js.UndefOr[scala.Nothing],
      address: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: java.lang.String, port: js.UndefOr[scala.Nothing], address: java.lang.String): Unit = js.native
    def send(
      msg: java.lang.String,
      port: js.UndefOr[scala.Nothing],
      address: java.lang.String,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: java.lang.String,
      port: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: java.lang.String, port: Double): Unit = js.native
    def send(
      msg: java.lang.String,
      port: Double,
      address: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: java.lang.String, port: Double, address: java.lang.String): Unit = js.native
    def send(
      msg: java.lang.String,
      port: Double,
      address: java.lang.String,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: java.lang.String,
      port: Double,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: js.Array[_]): Unit = js.native
    def send(msg: js.Array[_], callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]): Unit = js.native
    def send(
      msg: js.Array[_],
      port: js.UndefOr[scala.Nothing],
      address: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: js.Array[_], port: js.UndefOr[scala.Nothing], address: java.lang.String): Unit = js.native
    def send(
      msg: js.Array[_],
      port: js.UndefOr[scala.Nothing],
      address: java.lang.String,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: js.Array[_],
      port: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: js.Array[_], port: Double): Unit = js.native
    def send(
      msg: js.Array[_],
      port: Double,
      address: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: js.Array[_], port: Double, address: java.lang.String): Unit = js.native
    def send(
      msg: js.Array[_],
      port: Double,
      address: java.lang.String,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: js.Array[_],
      port: Double,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: Uint8Array): Unit = js.native
    def send(msg: Uint8Array, callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]): Unit = js.native
    def send(msg: Uint8Array, offset: Double, length: Double): Unit = js.native
    def send(
      msg: Uint8Array,
      offset: Double,
      length: Double,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: Uint8Array,
      offset: Double,
      length: Double,
      port: js.UndefOr[scala.Nothing],
      address: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: Uint8Array,
      offset: Double,
      length: Double,
      port: js.UndefOr[scala.Nothing],
      address: java.lang.String
    ): Unit = js.native
    def send(
      msg: Uint8Array,
      offset: Double,
      length: Double,
      port: js.UndefOr[scala.Nothing],
      address: java.lang.String,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: Uint8Array,
      offset: Double,
      length: Double,
      port: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: Uint8Array, offset: Double, length: Double, port: Double): Unit = js.native
    def send(
      msg: Uint8Array,
      offset: Double,
      length: Double,
      port: Double,
      address: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: Uint8Array, offset: Double, length: Double, port: Double, address: java.lang.String): Unit = js.native
    def send(
      msg: Uint8Array,
      offset: Double,
      length: Double,
      port: Double,
      address: java.lang.String,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: Uint8Array,
      offset: Double,
      length: Double,
      port: Double,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: Uint8Array,
      port: js.UndefOr[scala.Nothing],
      address: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: Uint8Array, port: js.UndefOr[scala.Nothing], address: java.lang.String): Unit = js.native
    def send(
      msg: Uint8Array,
      port: js.UndefOr[scala.Nothing],
      address: java.lang.String,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: Uint8Array,
      port: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: Uint8Array, port: Double): Unit = js.native
    def send(
      msg: Uint8Array,
      port: Double,
      address: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(msg: Uint8Array, port: Double, address: java.lang.String): Unit = js.native
    def send(
      msg: Uint8Array,
      port: Double,
      address: java.lang.String,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    def send(
      msg: Uint8Array,
      port: Double,
      callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
    ): Unit = js.native
    
    def setBroadcast(flag: Boolean): Unit = js.native
    
    def setMulticastInterface(multicastInterface: java.lang.String): Unit = js.native
    
    def setMulticastLoopback(flag: Boolean): Unit = js.native
    
    def setMulticastTTL(ttl: Double): Unit = js.native
    
    def setRecvBufferSize(size: Double): Unit = js.native
    
    def setSendBufferSize(size: Double): Unit = js.native
    
    def setTTL(ttl: Double): Unit = js.native
    
    def unref(): this.type = js.native
  }
  
  @JSImport("dgram", "createSocket")
  @js.native
  def createSocket(options: SocketOptions): Socket = js.native
  @JSImport("dgram", "createSocket")
  @js.native
  def createSocket(options: SocketOptions, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
  @JSImport("dgram", "createSocket")
  @js.native
  def createSocket(`type`: SocketType): Socket = js.native
  @JSImport("dgram", "createSocket")
  @js.native
  def createSocket(`type`: SocketType, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
  
  @js.native
  trait BindOptions extends StObject {
    
    var address: js.UndefOr[java.lang.String] = js.native
    
    var exclusive: js.UndefOr[Boolean] = js.native
    
    var fd: js.UndefOr[Double] = js.native
    
    var port: js.UndefOr[Double] = js.native
  }
  object BindOptions {
    
    @scala.inline
    def apply(): BindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindOptions]
    }
    
    @scala.inline
    implicit class BindOptionsMutableBuilder[Self <: BindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait RemoteInfo extends StObject {
    
    var address: java.lang.String = js.native
    
    var family: IPv4 | IPv6 = js.native
    
    var port: Double = js.native
    
    var size: Double = js.native
  }
  object RemoteInfo {
    
    @scala.inline
    def apply(address: java.lang.String, family: IPv4 | IPv6, port: Double, size: Double): RemoteInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteInfo]
    }
    
    @scala.inline
    implicit class RemoteInfoMutableBuilder[Self <: RemoteInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily(value: IPv4 | IPv6): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocketOptions extends StObject {
    
    /**
      * @default false
      */
    var ipv6Only: js.UndefOr[Boolean] = js.native
    
    var lookup: js.UndefOr[
        js.Function3[
          /* hostname */ java.lang.String, 
          /* options */ LookupOneOptions, 
          /* callback */ js.Function3[
            /* err */ ErrnoException | Null, 
            /* address */ java.lang.String, 
            /* family */ Double, 
            Unit
          ], 
          Unit
        ]
      ] = js.native
    
    var recvBufferSize: js.UndefOr[Double] = js.native
    
    var reuseAddr: js.UndefOr[Boolean] = js.native
    
    var sendBufferSize: js.UndefOr[Double] = js.native
    
    var `type`: SocketType = js.native
  }
  object SocketOptions {
    
    @scala.inline
    def apply(`type`: SocketType): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit class SocketOptionsMutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIpv6Only(value: Boolean): Self = StObject.set(x, "ipv6Only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6OnlyUndefined: Self = StObject.set(x, "ipv6Only", js.undefined)
      
      @scala.inline
      def setLookup(
        value: (/* hostname */ java.lang.String, /* options */ LookupOneOptions, /* callback */ js.Function3[
              /* err */ ErrnoException | Null, 
              /* address */ java.lang.String, 
              /* family */ Double, 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      @scala.inline
      def setRecvBufferSize(value: Double): Self = StObject.set(x, "recvBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecvBufferSizeUndefined: Self = StObject.set(x, "recvBufferSize", js.undefined)
      
      @scala.inline
      def setReuseAddr(value: Boolean): Self = StObject.set(x, "reuseAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReuseAddrUndefined: Self = StObject.set(x, "reuseAddr", js.undefined)
      
      @scala.inline
      def setSendBufferSize(value: Double): Self = StObject.set(x, "sendBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendBufferSizeUndefined: Self = StObject.set(x, "sendBufferSize", js.undefined)
      
      @scala.inline
      def setType(value: SocketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeStrings.udp4
    - typings.node.nodeStrings.udp6
  */
  trait SocketType extends StObject
  object SocketType {
    
    @scala.inline
    def udp4: typings.node.nodeStrings.udp4 = "udp4".asInstanceOf[typings.node.nodeStrings.udp4]
    
    @scala.inline
    def udp6: typings.node.nodeStrings.udp6 = "udp6".asInstanceOf[typings.node.nodeStrings.udp6]
  }
}
