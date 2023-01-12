package typings.memjs

import typings.memjs.anon.Expires
import typings.memjs.anon.Flags
import typings.memjs.anon.Initial
import typings.memjs.anon.Log
import typings.memjs.anon.Success
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memjs", "Client")
  @js.native
  open class Client protected () extends StObject {
    /**
      * Client initializer takes a list of Servers and an options dictionary. See Client.create for details.
      * @param servers
      * @param options
      */
    def this(servers: String) = this()
    def this(servers: String, options: ClientOptions) = this()
    
    /**
      * ADD
      *
      * Adds the given _key_ and _value_ to memcache. The operation only succeeds
      * if the key is not already set.
      *
      * The options dictionary takes:
      * * _expires_: overrides the default expiration (see `Client.create`) for this
      *              particular key-value pair.
      *
      * The callback signature is:
      *
      *     callback(err, success)
      * @param key
      * @param value
      * @param options
      * @param callback
      */
    def add(key: String, value: String, options: Expires): js.Promise[Boolean] = js.native
    def add(
      key: String,
      value: String,
      options: Expires,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    def add(key: String, value: Buffer, options: Expires): js.Promise[Boolean] = js.native
    def add(
      key: String,
      value: Buffer,
      options: Expires,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    
    /**
      * APPEND
      *
      * Append the given _value_ to the value associated with the given _key_ in
      * memcache. The operation only succeeds if the key is already present. The
      * callback signature is:
      *
      *     callback(err, success)
      * @param key
      * @param value
      * @param callback
      */
    def append(key: String, value: String): js.Promise[Boolean] = js.native
    def append(
      key: String,
      value: String,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    def append(key: String, value: Buffer): js.Promise[Boolean] = js.native
    def append(
      key: String,
      value: Buffer,
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
      * The options dictionary takes:
      * * _initial_: the value for the key if not already present, defaults to 0.
      * * _expires_: overrides the default expiration (see `Client.create`) for this
      *              particular key-value pair.
      *
      * The callback signature is:
      *
      *     callback(err, success, value)
      * @param key
      * @param amount
      * @param options
      * @param callback
      */
    def decrement(key: String, amount: Double, options: Initial): js.Promise[Success] = js.native
    def decrement(
      key: String,
      amount: Double,
      options: Initial,
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
      * The callback signature is:
      *
      *     callback(err, success)
      * @param key
      * @param callback
      */
    def delete(key: String): js.Promise[Boolean] = js.native
    def delete(key: String, callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]): Unit = js.native
    
    /**
      * FLUSH
      *
      * Flushes the cache on each connected server. The callback signature is:
      *
      *     callback(lastErr, results)
      *
      * where _lastErr_ is the last error encountered (or null, in the common case
      * of no errors). _results_ is a dictionary mapping `"hostname:port"` to either
      * `true` (if the operation was successful), or an error.
      * @param callback
      */
    def flush(): js.Promise[Record[String, Boolean]] = js.native
    def flush(callback: js.Function2[/* err */ js.Error | Null, /* results */ Record[String, Boolean], Unit]): Unit = js.native
    
    /**
      * GET
      *
      * Retrieves the value at the given key in memcache.
      *
      * The callback signature is:
      *
      *     callback(err, value, flags)
      *
      * _value_ and _flags_ are both `Buffer`s. If the key is not found, the
      * callback is invoked with null for both arguments and no error
      * @param key
      * @param callback
      */
    def get(key: String): js.Promise[Flags] = js.native
    def get(
      key: String,
      callback: js.Function3[/* err */ js.Error | Null, /* value */ Buffer | Null, /* flags */ Buffer | Null, Unit]
    ): Unit = js.native
    
    /**
      * INCREMENT
      *
      * Increments the given _key_ in memcache.
      *
      * The options dictionary takes:
      * * _initial_: the value for the key if not already present, defaults to 0.
      * * _expires_: overrides the default expiration (see `Client.create`) for this
      *              particular key-value pair.
      *
      * The callback signature is:
      *
      *     callback(err, success, value)
      * @param key
      * @param amount
      * @param options
      * @param callback
      */
    def increment(key: String, amount: Double, options: Initial): js.Promise[Success] = js.native
    def increment(
      key: String,
      amount: Double,
      options: Initial,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* success */ Boolean | Null, 
          /* value */ js.UndefOr[Double | Null], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Perform a generic single response operation (get, set etc) on a server
      * serv: the server to perform the operation on
      * request: a buffer containing the request
      * seq: the sequence number of the operation. It is used to pin the callbacks
      *      to a specific operation and should never change during a `perform`.
      * callback: a callback invoked when a response is received or the request
      *           fails
      * retries: number of times to retry request on failure
      * @param key
      * @param request
      * @param seq
      * @param callback
      * @param retries
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
      * Prepend the given _value_ to the value associated with the given _key_ in
      * memcache. The operation only succeeds if the key is already present. The
      * callback signature is:
      *
      *     callback(err, success)
      * @param key
      * @param value
      * @param callback
      */
    def prepend(key: String, value: String): js.Promise[Boolean] = js.native
    def prepend(
      key: String,
      value: String,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    def prepend(key: String, value: Buffer): js.Promise[Boolean] = js.native
    def prepend(
      key: String,
      value: Buffer,
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
      * The options dictionary takes:
      * * _expires_: overrides the default expiration (see `Client.create`) for this
      *              particular key-value pair.
      *
      * The callback signature is:
      *
      *     callback(err, success)
      * @param key
      * @param value
      * @param options
      * @param callback
      */
    def replace(key: String, value: String, options: Expires): js.Promise[Boolean] = js.native
    def replace(
      key: String,
      value: String,
      options: Expires,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    def replace(key: String, value: Buffer, options: Expires): js.Promise[Boolean] = js.native
    def replace(
      key: String,
      value: Buffer,
      options: Expires,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    
    /**
      * RESET_STATS
      *
      * Reset the statistics each server is keeping back to zero. This doesn't clear
      * stats such as item count, but temporary stats such as total number of
      * connections over time.
      *
      * The callback is invoked **ONCE PER SERVER** and has the signature:
      *
      *     callback(err, server)
      *
      * _server_ is the `"hostname:port"` of the server.
      * @param callback
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
    
    /**
      * Chooses the server to talk to by hashing the given key.
      * @param key
      */
    def server(key: String): String = js.native
    
    var servers: js.Array[String] = js.native
    
    /**
      * SET
      *
      * Sets the given _key_ and _value_ in memcache.
      *
      * The options dictionary takes:
      * * _expires_: overrides the default expiration (see `Client.create`) for this
      *              particular key-value pair.
      *
      * The callback signature is:
      *
      *     callback(err, success)
      * @param key
      * @param value
      * @param options
      * @param callback
      */
    def set(key: String, value: String, options: Expires): js.Promise[Boolean] = js.native
    def set(
      key: String,
      value: String,
      options: Expires,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    def set(key: String, value: Buffer, options: Expires): js.Promise[Boolean] = js.native
    def set(
      key: String,
      value: Buffer,
      options: Expires,
      callback: js.Function2[/* err */ js.Error | Null, /* success */ Boolean | Null, Unit]
    ): Unit = js.native
    
    /**
      * STATS
      *
      * Fetches memcache stats from each connected server. The callback is invoked
      * **ONCE PER SERVER** and has the signature:
      *
      *     callback(err, server, stats)
      *
      * _server_ is the `"hostname:port"` of the server, and _stats_ is a
      * dictionary mapping the stat name to the value of the statistic as a string.
      * @param callback
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
      * Sends a memcache stats command with a key to each connected server. The
      * callback is invoked **ONCE PER SERVER** and has the signature:
      *
      *     callback(err, server, stats)
      *
      * _server_ is the `"hostname:port"` of the server, and _stats_ is a dictionary
      * mapping the stat name to the value of the statistic as a string.
      * @param key
      * @param callback
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
      * Touch sets an expiration value, given by _expires_, on the given _key_ in
      * memcache. The operation only succeeds if the key is already present. The
      * callback signature is:
      *
      *     callback(err, success)
      * @param key
      * @param expires
      * @param callback
      */
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
      * options. The config string should be of the form:
      *
      *     "[user:pass@]server1[:11211],[user:pass@]server2[:11211],..."
      *
      * If the argument is not given, fallback on the `MEMCACHIER_SERVERS` environment
      * variable, `MEMCACHE_SERVERS` environment variable or `"localhost:11211"`.
      *
      * The options hash may contain the options:
      *
      * * `retries` - the number of times to retry an operation in lieu of failures
      * (default 2)
      * * `expires` - the default expiration in seconds to use (default 0 - never
      * expire). If `expires` is greater than 30 days (60 x 60 x 24 x 30), it is
      * treated as a UNIX time (number of seconds since January 1, 1970).
      * * `logger` - a logger object that responds to `log(string)` method calls.
      * * `failover` - whether to failover to next server. Defaults to false.
      * * `failoverTime` - how much to wait until retring a failed server. Default
      *                    is 60 seconds.
      *
      *   ~~~~
      *     log(msg1[, msg2[, msg3[...]]])
      *   ~~~~
      *
      *   Defaults to `console`.
      *
      * Or options for the servers including:
      * * `username` and `password` for fallback SASL authentication credentials.
      * * `timeout` in seconds to determine failure for operations. Default is 0.5
      *             seconds.
      * * 'conntimeout' in seconds to connection failure. Default is twice the value
      *                 of `timeout`.
      * * `keepAlive` whether to enable keep-alive functionality. Defaults to false.
      * * `keepAliveDelay` in seconds to the initial delay before the first keepalive
      *                    probe is sent on an idle socket. Defaults is 30 seconds.
      */
    inline def create(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Client]
    inline def create(serversStr: String): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(serversStr.asInstanceOf[js.Any]).asInstanceOf[Client]
    inline def create(serversStr: String, options: ClientOptions): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(serversStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def create(serversStr: String, options: ServerOptions): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(serversStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def create(serversStr: Unit, options: ClientOptions): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(serversStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def create(serversStr: Unit, options: ServerOptions): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(serversStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
  }
  
  trait ClientOptions extends StObject {
    
    /**
      * The default expiration in seconds to use. A `0` means never expire,
      * if it is greater than 30 days (60 x 60 x 24 x 30), it is
      * treated as a UNIX time (number of seconds since January 1, 1970).
      * @default 0
      */
    var expires: js.UndefOr[Double] = js.undefined
    
    /**
      * How many seconds to wait until retrying a failed server.
      * @default 60
      */
    var failoverTime: js.UndefOr[Double] = js.undefined
    
    /**
      * A logger object that responds to `log(string)` method calls.
      * @default console
      */
    var logger: js.UndefOr[Log] = js.undefined
    
    /**
      * The number of times to retry an operation in lieu of failures.
      * @default 2
      */
    var retries: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 0.2
      */
    var retry_delay: js.UndefOr[Double] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setFailoverTime(value: Double): Self = StObject.set(x, "failoverTime", value.asInstanceOf[js.Any])
      
      inline def setFailoverTimeUndefined: Self = StObject.set(x, "failoverTime", js.undefined)
      
      inline def setLogger(value: Log): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetry_delay(value: Double): Self = StObject.set(x, "retry_delay", value.asInstanceOf[js.Any])
      
      inline def setRetry_delayUndefined: Self = StObject.set(x, "retry_delay", js.undefined)
    }
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
