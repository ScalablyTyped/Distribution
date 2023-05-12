package typings.memjs

import org.scalablytyped.runtime.NumberDictionary
import typings.memjs.anon.Extras
import typings.memjs.anon.Flags
import typings.memjs.anon.RequiredHeader
import typings.memjs.anon.Success
import typings.memjs.anon.Value
import typings.node.bufferMod.global.Buffer
import typings.node.nodeColoneventsMod.^
import typings.node.nodeColonnetMod.Socket
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memjs", "Client")
  @js.native
  open class Client[TIn, TOut] protected () extends StObject {
    /**
      * Client initializer takes a list of Servers and an options dictionary. See Client.create for details.
      */
    def this(servers: js.Array[Server]) = this()
    def this(servers: js.Array[Server], options: ClientOptions[String | Buffer, Buffer | Null]) = this()
    
    /**
      * ADD
      *
      * Adds the given _key_ and _value_ to memcache. The operation only succeeds
      * if the key is not already set.
      *
      * @param key The key in memcache.
      * @param value The value to set in memcache.
      * @param options Additional request options.
      * @param callback The callback invoked when a response is received or the request fails.
      */
    def add(key: String, value: TIn): js.Promise[Boolean] = js.native
    def add(
      key: String,
      value: TIn,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    def add(key: String, value: TIn, options: InsertOptions): js.Promise[Boolean] = js.native
    def add(
      key: String,
      value: TIn,
      options: InsertOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    
    /**
      * APPEND
      *
      * Append the given _value_ to the value associated with the given _key_.
      * The operation only succeeds if the key is already present.
      *
      * @param key The key in memcache.
      * @param value The value to prepend.
      * @param callback The callback invoked when a response is received or the request fails.
      */
    def append(key: String, value: TIn): js.Promise[Boolean] = js.native
    def append(
      key: String,
      value: TIn,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    
    /**
      * CLOSE
      *
      * Closes (abruptly) connections to all the servers.
      */
    def close(): Unit = js.native
    
    /**
      * DECREMENT
      *
      * Decrements the given _key_ in memcache.
      *
      * @param key The key in memcache.
      * @param amount The amount by which to decrement the value.
      * @param options Additional request options.
      * @param callback The callback invoked when a response is received or the request fails.
      */
    def decrement(key: String, amount: Double): js.Promise[Success] = js.native
    def decrement(
      key: String,
      amount: Double,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* success */ Boolean | Null, 
          /* value */ js.UndefOr[Double | Null], 
          Unit
        ]
    ): Unit = js.native
    def decrement(key: String, amount: Double, options: IncrementDecrementOptions): js.Promise[Success] = js.native
    def decrement(
      key: String,
      amount: Double,
      options: IncrementDecrementOptions,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* success */ Boolean | Null, 
          /* value */ js.UndefOr[Double | Null], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * DELETE
      *
      * Deletes the given _key_ from memcache. The operation only succeeds
      * if the key is already present.
      *
      * @param key The key in memcache.
      * @param callback The callback invoked when a response is received or the request fails.
      */
    def delete(key: String): js.Promise[Boolean] = js.native
    def delete(key: String, callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]): Unit = js.native
    
    /**
      * FLUSH
      *
      * Flushes the cache on each connected server.
      *
      * @param callback The callback invoked when a response is received or the request fails.
      * Its _lastErr_ argument is the last error encountered (or null, in the common case
      * of no errors). _results_ is a dictionary mapping `"hostname:port"` to either
      * `true` (if the operation was successful), or an error.
      */
    def flush(): js.Promise[Record[String, Boolean]] = js.native
    def flush(
      callback: js.Function2[
          /* lastErr */ js.Error | Null, 
          /* results */ Record[String, Boolean | js.Error], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * GET
      *
      * Retrieves the value at the given key in memcache.
      *
      * @param key The key in memcache.
      * @param callback The callback invoked when a response is received or the request fails.
      * If the key is not found, the callback is invoked with null for both arguments and no error.
      */
    def get(key: String): js.Promise[Flags[TOut]] = js.native
    def get(
      key: String,
      callback: js.Function3[/* err */ js.Error | Null, /* value */ TOut, /* flags */ Buffer | Null, Unit]
    ): Unit = js.native
    
    /**
      * An overridable method you can use for determing
      * server selection. Should return the server index
      * in the list of servers on Client#servers.
      *
      * @example
      * // example using node-hashring
      * import * as memjs from 'memjs';
      * import HashRing = require('node-hashring');
      *
      * const servers = ['localhost:11211', 'localhost:11212'];
      * // build a map of server addresses to their index in the server list
      * const serverMap: { [key: string]: number } = {};
      * servers.forEach((server, index) => serverMap[server] = index);
      * const client = memjs.Client.create(servers.join(','));
      * // build the hashring
      * const hashRing = new HashRing(servers);
      * // override the getServer method
      * client.getServer = (key) => serverMap[hashRing.findNode(key)];
      */
    def getServer(key: String): String = js.native
    
    /**
      * Increment the seq value.
      */
    def incrSeq(): Unit = js.native
    
    /**
      * INCREMENT
      *
      * Increments the given _key_ in memcache.
      *
      * @param key The key in memcache.
      * @param amount The amount by which to increment the value.
      * @param options Additional request options.
      * @param callback The callback invoked when a response is received or the request fails.
      */
    def increment(key: String, amount: Double): js.Promise[Success] = js.native
    def increment(
      key: String,
      amount: Double,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* success */ Boolean | Null, 
          /* value */ js.UndefOr[Double | Null], 
          Unit
        ]
    ): Unit = js.native
    def increment(key: String, amount: Double, options: IncrementDecrementOptions): js.Promise[Success] = js.native
    def increment(
      key: String,
      amount: Double,
      options: IncrementDecrementOptions,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* success */ Boolean | Null, 
          /* value */ js.UndefOr[Double | Null], 
          Unit
        ]
    ): Unit = js.native
    
    val options: ClientOptions[TIn, TOut] = js.native
    
    /**
      * Perform a generic single response operation (get, set etc) on a server.
      *
      * @param key The key to perform the operation on.
      * @param request A buffer containing the request.
      * @param seq The sequence number of the operation. It is used to pin the callbacks
      * to a specific operation and should never change during a `perform`.
      * @param callback The callback invoked when a response is received or the request fails.
      * @param retries Number of times to retry request on failure.
      */
    def perform(key: String, request: Buffer, seq: Double): Unit = js.native
    def perform(
      key: String,
      request: Buffer,
      seq: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* repeated */ Any, Unit]
    ): Unit = js.native
    def perform(
      key: String,
      request: Buffer,
      seq: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* repeated */ Any, Unit],
      retries: Double
    ): Unit = js.native
    def perform(key: String, request: Buffer, seq: Double, callback: Unit, retries: Double): Unit = js.native
    
    /**
      * PREPEND
      *
      * Prepend the given _value_ to the value associated with the given _key_.
      * The operation only succeeds if the key is already present.
      *
      * @param key The key in memcache.
      * @param value The value to prepend.
      * @param callback The callback invoked when a response is received or the request fails.
      */
    def prepend(key: String, value: TIn): js.Promise[Boolean] = js.native
    def prepend(
      key: String,
      value: TIn,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    
    /**
      * QUIT
      *
      * Closes the connection to each server, notifying them of this intention. Note
      * that quit can race against already outstanding requests when those requests
      * fail and are retried, leading to the quit command winning and closing the
      * connection before the retries complete.
      */
    def quit(): Unit = js.native
    
    /**
      * REPLACE
      *
      * Replaces the given _key_ and _value_ to memcache. The operation only succeeds
      * if the key is already present.
      *
      * @param key The key in memcache.
      * @param value The value with which to replace the value in memcache.
      * @param options Additional request options.
      * @param callback The callback invoked when a response is received or the request fails.
      */
    def replace(key: String, value: TIn): js.Promise[Boolean] = js.native
    def replace(
      key: String,
      value: TIn,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    def replace(key: String, value: TIn, options: InsertOptions): js.Promise[Boolean] = js.native
    def replace(
      key: String,
      value: TIn,
      options: InsertOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    
    /**
      * RESET_STATS
      *
      * Reset the statistics each server is keeping back to zero. This doesn't clear
      * stats such as item count, but temporary stats such as total number of
      * connections over time.
      *
      * @param callback The callback invoked when a response is received or the request fails.
      * Its invoked **ONCE PER SERVER**, its _server_ parameter is the `"hostname:port"` of the server.
      */
    def resetStats(): Unit = js.native
    def resetStats(
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* server */ String, 
          /* stats */ (Record[String, String]) | Null, 
          Unit
        ]
    ): Unit = js.native
    
    val seq: Double = js.native
    
    val serializer: Serializer[TIn, TOut] = js.native
    
    /**
      * Chooses the server to talk to by hashing the given key.
      *
      * @param key The key in memcache.
      */
    def server(key: String): js.UndefOr[Server] = js.native
    
    val servers: js.Array[Server] = js.native
    
    /**
      * SET
      *
      * Sets the given _key_ and _value_ in memcache.
      *
      * @param key The key in memcache.
      * @param value The value to set in memcache.
      * @param options Additional request options.
      * @param callback The callback invoked when a response is received or the request fails.
      */
    def set(key: String, value: TIn): js.Promise[Boolean] = js.native
    def set(
      key: String,
      value: TIn,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    def set(key: String, value: TIn, options: InsertOptions): js.Promise[Boolean] = js.native
    def set(
      key: String,
      value: TIn,
      options: InsertOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    
    /**
      * STATS
      *
      * Fetches memcache stats from each connected server.
      *
      * @param callback The callback invoked when a response is received or the request fails.
      * Its invoked **ONCE PER SERVER**, its _server_ parameter is the `"hostname:port"` of the server,
      * and _stats_ is a dictionary mapping the stat name to the value of the statistic as a string.
      */
    def stats(): Unit = js.native
    def stats(
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* server */ String, 
          /* stats */ (Record[String, String]) | Null, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * STATS_WITH_KEY
      *
      * Sends a memcache stats command with a key to each connected server.
      *
      * @param key The key to perform the operation on.
      * @param callback The callback invoked when a response is received or the request fails.
      * Its invoked **ONCE PER SERVER**, its _server_ parameter is the `"hostname:port"` of the server,
      * and _stats_ is a dictionary mapping the stat name to the value of the statistic as a string.
      */
    def statsWithKey(key: String): Unit = js.native
    def statsWithKey(
      key: String,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* server */ String, 
          /* stats */ (Record[String, String]) | Null, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * TOUCH
      *
      * Touch sets an expiration value. The operation only succeeds if the key is already present.
      *
      * @param key The key in memcache.
      * @param expires The expiration value to set.
      * @param callback The callback invoked when a response is received or the request fails.
      */
    def touch(key: String): js.Promise[Boolean] = js.native
    def touch(key: String, callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]): Unit = js.native
    def touch(key: String, expires: Double): js.Promise[Boolean] = js.native
    def touch(
      key: String,
      expires: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
  }
  /* static members */
  object Client {
    
    @JSImport("memjs", "Client")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new client given an optional config string and optional hash of
      * options.
      *
      * @param serversStr The config string should be of the form:
      *
      *     "[user:pass@]server1[:11211],[user:pass@]server2[:11211],..."
      *
      * If the argument is not given, fallback on the `MEMCACHIER_SERVERS` environment
      * variable, `MEMCACHE_SERVERS` environment variable or `"localhost:11211"`.
      */
    inline def create[TIn, TOut](): Client[TIn, TOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Client[TIn, TOut]]
    inline def create[TIn, TOut](serversStr: String): Client[TIn, TOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(serversStr.asInstanceOf[js.Any]).asInstanceOf[Client[TIn, TOut]]
    inline def create[TIn, TOut](serversStr: String, options: (ClientOptions[TIn, TOut]) & ServerOptions): Client[TIn, TOut] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(serversStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client[TIn, TOut]]
    inline def create[TIn, TOut](serversStr: Unit, options: (ClientOptions[TIn, TOut]) & ServerOptions): Client[TIn, TOut] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(serversStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client[TIn, TOut]]
  }
  
  trait Header extends StObject {
    
    var cas: js.UndefOr[Buffer] = js.undefined
    
    var dataType: js.UndefOr[Double] = js.undefined
    
    var extrasLength: Double
    
    var keyLength: Double
    
    var magic: Double
    
    var opaque: js.UndefOr[Double] = js.undefined
    
    var opcode: Double
    
    var status: js.UndefOr[Double] = js.undefined
    
    var totalBodyLength: Double
  }
  object Header {
    
    inline def apply(extrasLength: Double, keyLength: Double, magic: Double, opcode: Double, totalBodyLength: Double): Header = {
      val __obj = js.Dynamic.literal(extrasLength = extrasLength.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], magic = magic.asInstanceOf[js.Any], opcode = opcode.asInstanceOf[js.Any], totalBodyLength = totalBodyLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @JSImport("memjs", "Header")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBuffer(headerBuf: Buffer): RequiredHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(headerBuf.asInstanceOf[js.Any]).asInstanceOf[RequiredHeader]
    
    inline def toBuffer(header: Header): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(header.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      inline def setCas(value: Buffer): Self = StObject.set(x, "cas", value.asInstanceOf[js.Any])
      
      inline def setCasUndefined: Self = StObject.set(x, "cas", js.undefined)
      
      inline def setDataType(value: Double): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setExtrasLength(value: Double): Self = StObject.set(x, "extrasLength", value.asInstanceOf[js.Any])
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setMagic(value: Double): Self = StObject.set(x, "magic", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: Double): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setOpcode(value: Double): Self = StObject.set(x, "opcode", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTotalBodyLength(value: Double): Self = StObject.set(x, "totalBodyLength", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("memjs", "Server")
  @js.native
  open class Server protected () extends ^ {
    def this(host: String, port: Double) = this()
    def this(host: String, port: Double, username: String) = this()
    def this(host: String, port: Double, username: String, password: String) = this()
    def this(host: String, port: Double, username: Unit, password: String) = this()
    def this(host: String, port: Double, username: String, password: String, options: ServerOptions) = this()
    def this(host: String, port: Double, username: String, password: Unit, options: ServerOptions) = this()
    def this(host: String, port: Double, username: Unit, password: String, options: ServerOptions) = this()
    def this(host: String, port: Double, username: Unit, password: Unit, options: ServerOptions) = this()
    
    def appendToBuffer(dataBuf: Buffer): Buffer = js.native
    
    def close(): Unit = js.native
    
    val connectCallbacks: js.Array[js.Function1[/* socket */ Socket, Unit]] = js.native
    
    val connected: Boolean = js.native
    
    def error(error: js.Error): Unit = js.native
    
    val errorCallbacks: NumberDictionary[js.Function1[/* error */ js.Error, Unit]] = js.native
    
    val host: String = js.native
    
    def listSasl(): Unit = js.native
    
    def onConnect(fn: js.Function1[/* socket */ Socket, Unit]): Unit = js.native
    
    def onError(seq: Double, fn: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    def onResponse(seq: Double, fn: js.Function1[/* response */ Response, Unit]): Unit = js.native
    
    val options: ServerOptions = js.native
    
    val password: js.UndefOr[String] = js.native
    
    val port: Double = js.native
    
    val requestTimeouts: js.Array[Double] = js.native
    
    val responseBuffer: Buffer = js.native
    
    val responseCallbacks: NumberDictionary[js.Function1[/* response */ Response, Unit]] = js.native
    
    def responseHandler(dataBuf: Buffer): Unit = js.native
    
    def saslAuth(): Unit = js.native
    
    def sock(sasl: Boolean, go: js.Function1[/* socket */ Socket, Unit]): Unit = js.native
    
    val timeoutSet: Boolean = js.native
    
    val username: js.UndefOr[String] = js.native
    
    def write(blob: String): Unit = js.native
    def write(blob: js.typedarray.Uint8Array): Unit = js.native
    
    def writeSASL(blob: String): Unit = js.native
    def writeSASL(blob: js.typedarray.Uint8Array): Unit = js.native
  }
  
  object Utils {
    
    @JSImport("memjs", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def hashCode_(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashCode")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def makeAmountInitialAndExpiration(amount: Double, amountIfEmpty: Double, expiration: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAmountInitialAndExpiration")(amount.asInstanceOf[js.Any], amountIfEmpty.asInstanceOf[js.Any], expiration.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def makeExpiration(expiration: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("makeExpiration")(expiration.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def makeRequestBuffer(opcode: Double, key: String, extras: String, value: String, opaque: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestBuffer")(opcode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], extras.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opaque.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def makeRequestBuffer(opcode: Double, key: String, extras: String, value: Buffer, opaque: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestBuffer")(opcode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], extras.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opaque.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def makeRequestBuffer(opcode: Double, key: String, extras: Buffer, value: String, opaque: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestBuffer")(opcode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], extras.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opaque.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def makeRequestBuffer(opcode: Double, key: String, extras: Buffer, value: Buffer, opaque: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestBuffer")(opcode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], extras.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opaque.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def makeRequestBuffer(opcode: Double, key: Buffer, extras: String, value: String, opaque: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestBuffer")(opcode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], extras.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opaque.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def makeRequestBuffer(opcode: Double, key: Buffer, extras: String, value: Buffer, opaque: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestBuffer")(opcode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], extras.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opaque.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def makeRequestBuffer(opcode: Double, key: Buffer, extras: Buffer, value: String, opaque: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestBuffer")(opcode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], extras.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opaque.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def makeRequestBuffer(opcode: Double, key: Buffer, extras: Buffer, value: Buffer, opaque: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestBuffer")(opcode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], extras.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opaque.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def merge[TOriginal /* <: js.Object */, TDefault /* <: js.Object */](original: TOriginal, deflt: TDefault): TOriginal & TDefault = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(original.asInstanceOf[js.Any], deflt.asInstanceOf[js.Any])).asInstanceOf[TOriginal & TDefault]
    
    inline def parseMessage(dataBuf: Buffer): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMessage")(dataBuf.asInstanceOf[js.Any]).asInstanceOf[Response]
    
    inline def timestamp(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[Double]
  }
  
  trait ClientOptions[TIn, TOut] extends StObject {
    
    /**
      * The default expiration in seconds to use. A `0` means never expire,
      * if it is greater than 30 days (60 x 60 x 24 x 30), it is
      * treated as a UNIX time (number of seconds since January 1, 1970).
      * @default 0
      */
    var expires: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to failover to next server.
      * @default false
      */
    var failover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How many seconds to wait until retrying a failed server.
      * @default 60
      */
    var failoverTime: js.UndefOr[Double] = js.undefined
    
    /**
      * A logger object that responds to `log(string)` method calls.
      * @default console
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * The number of times to retry an operation in lieu of failures.
      * @default 2
      */
    var retries: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 0.2
      */
    var retry_delay: js.UndefOr[Double] = js.undefined
    
    /**
      * The object which will (de)serialize the data.
      * @default a passthrough function which will leave the parameters unchanged
      */
    var serializer: js.UndefOr[Serializer[TIn, TOut]] = js.undefined
  }
  object ClientOptions {
    
    inline def apply[TIn, TOut](): ClientOptions[TIn, TOut] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions[TIn, TOut]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions[?, ?], TIn, TOut] (val x: Self & (ClientOptions[TIn, TOut])) extends AnyVal {
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setFailover(value: Boolean): Self = StObject.set(x, "failover", value.asInstanceOf[js.Any])
      
      inline def setFailoverTime(value: Double): Self = StObject.set(x, "failoverTime", value.asInstanceOf[js.Any])
      
      inline def setFailoverTimeUndefined: Self = StObject.set(x, "failoverTime", js.undefined)
      
      inline def setFailoverUndefined: Self = StObject.set(x, "failover", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetry_delay(value: Double): Self = StObject.set(x, "retry_delay", value.asInstanceOf[js.Any])
      
      inline def setRetry_delayUndefined: Self = StObject.set(x, "retry_delay", js.undefined)
      
      inline def setSerializer(value: Serializer[TIn, TOut]): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
      
      inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
    }
  }
  
  trait IncrementDecrementOptions
    extends StObject
       with InsertOptions {
    
    /**
      * The value for the key if not already present.
      * @default 0
      */
    var initial: js.UndefOr[Double] = js.undefined
  }
  object IncrementDecrementOptions {
    
    inline def apply(): IncrementDecrementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncrementDecrementOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncrementDecrementOptions] (val x: Self) extends AnyVal {
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    }
  }
  
  trait InsertOptions extends StObject {
    
    /**
      * Overrides the default expiration (see `Client.create`) for this particular key-value pair.
      */
    var expires: js.UndefOr[Double] = js.undefined
  }
  object InsertOptions {
    
    inline def apply(): InsertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InsertOptions] (val x: Self) extends AnyVal {
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    }
  }
  
  trait Logger extends StObject {
    
    def log(args: Any*): Unit
  }
  object Logger {
    
    inline def apply(log: /* repeated */ Any => Unit): Logger = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
  
  trait Response extends StObject {
    
    var extras: Buffer
    
    var header: RequiredHeader
    
    var key: Buffer
    
    var `val`: Buffer
  }
  object Response {
    
    inline def apply(extras: Buffer, header: RequiredHeader, key: Buffer, `val`: Buffer): Response = {
      val __obj = js.Dynamic.literal(extras = extras.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setExtras(value: Buffer): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: RequiredHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setVal(value: Buffer): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Serializer[TIn, TOut] extends StObject {
    
    def deserialize(opcode: Double, value: Null, extras: Buffer): Value[TOut] = js.native
    def deserialize(opcode: Double, value: Buffer, extras: Buffer): Value[TOut] = js.native
    
    def serialize(opcode: Double, value: TIn, extras: Buffer): Extras = js.native
  }
  
  trait ServerOptions extends StObject {
    
    /**
      * `conntimeout` in seconds to connection failure.
      * @default 2 * timeout
      */
    var conntimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to enable keep-alive functionality.
      * @default false
      */
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `keepAliveDelay` in seconds to the initial delay before the first keep-
      * alive probe is sent on an idle socket.
      * @default 30
      */
    var keepAliveDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Server password for fallback SASL authentication credentials.
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * `timeout` in seconds to determine failure for operations.
      * @default 0.5
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Server username for fallback SASL authentication credentials.
      */
    var username: js.UndefOr[String] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      inline def setConntimeout(value: Double): Self = StObject.set(x, "conntimeout", value.asInstanceOf[js.Any])
      
      inline def setConntimeoutUndefined: Self = StObject.set(x, "conntimeout", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveDelay(value: Double): Self = StObject.set(x, "keepAliveDelay", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveDelayUndefined: Self = StObject.set(x, "keepAliveDelay", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
