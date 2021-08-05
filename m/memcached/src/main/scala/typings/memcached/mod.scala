package typings.memcached

import org.scalablytyped.runtime.StringDictionary
import typings.memcached.anon.Dictkey
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memcached", JSImport.Namespace)
  @js.native
  class ^ protected () extends Memcached {
    /**
      * Connect to a single Memcached server or cluster
      * @param location Server locations
      * @param options options
      */
    def this(location: Location) = this()
    def this(location: Location, options: typings.memcached.mod.options) = this()
  }
  @JSImport("memcached", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("memcached", "config")
  @js.native
  def config: options = js.native
  inline def config_=(x: options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
  
  trait CacheDumpData extends StObject {
    
    var b: Double
    
    var key: String
    
    var s: Double
  }
  object CacheDumpData {
    
    inline def apply(b: Double, key: String, s: Double): CacheDumpData = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheDumpData]
    }
    
    extension [Self <: CacheDumpData](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandData extends StObject {
    
    def callback(args: js.Any*): js.Any
    
    var cas: js.UndefOr[String] = js.undefined
    
    var command: String
    
    var execution: Double
    
    var key: js.UndefOr[String] = js.undefined
    
    var lifetime: js.UndefOr[Double] = js.undefined
    
    var redundancyEnabled: js.UndefOr[Boolean] = js.undefined
    
    var start: Double
    
    var `type`: String
    
    var validate: js.Array[js.Tuple2[String, js.Function1[/* repeated */ js.Any, js.Any]]]
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object CommandData {
    
    inline def apply(
      callback: /* repeated */ js.Any => js.Any,
      command: String,
      execution: Double,
      start: Double,
      `type`: String,
      validate: js.Array[js.Tuple2[String, js.Function1[/* repeated */ js.Any, js.Any]]]
    ): CommandData = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), command = command.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandData]
    }
    
    extension [Self <: CommandData](x: Self) {
      
      inline def setCallback(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCas(value: String): Self = StObject.set(x, "cas", value.asInstanceOf[js.Any])
      
      inline def setCasUndefined: Self = StObject.set(x, "cas", js.undefined)
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setExecution(value: Double): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      inline def setRedundancyEnabled(value: Boolean): Self = StObject.set(x, "redundancyEnabled", value.asInstanceOf[js.Any])
      
      inline def setRedundancyEnabledUndefined: Self = StObject.set(x, "redundancyEnabled", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: js.Array[js.Tuple2[String, js.Function1[/* repeated */ js.Any, js.Any]]]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateVarargs(value: (js.Tuple2[String, js.Function1[/* repeated */ js.Any, js.Any]])*): Self = StObject.set(x, "validate", js.Array(value :_*))
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /**
    * <ul>
    *     <li><b>issue</b> a issue occurred on a server, we are going to attempt a retry next.</li>
    *     <li><b>failure</b> a server has been marked as failure or dead.</li>
    *     <li><b>reconnecting</b> we are going to attempt to reconnect the to the failed server.</li>
    *     <li><b>reconnect</b> successfully reconnected to the memcached server.</li>
    *     <li><b>remove</b> removing the server from our consistent hashing.</li>
    * </ul>
    */
  /* Rewritten from type alias, can be one of: 
    - typings.memcached.memcachedStrings.issue
    - typings.memcached.memcachedStrings.failure
    - typings.memcached.memcachedStrings.reconnecting
    - typings.memcached.memcachedStrings.reconnect
    - typings.memcached.memcachedStrings.remove
  */
  trait EventNames extends StObject
  object EventNames {
    
    inline def failure: typings.memcached.memcachedStrings.failure = "failure".asInstanceOf[typings.memcached.memcachedStrings.failure]
    
    inline def issue: typings.memcached.memcachedStrings.issue = "issue".asInstanceOf[typings.memcached.memcachedStrings.issue]
    
    inline def reconnect: typings.memcached.memcachedStrings.reconnect = "reconnect".asInstanceOf[typings.memcached.memcachedStrings.reconnect]
    
    inline def reconnecting: typings.memcached.memcachedStrings.reconnecting = "reconnecting".asInstanceOf[typings.memcached.memcachedStrings.reconnecting]
    
    inline def remove: typings.memcached.memcachedStrings.remove = "remove".asInstanceOf[typings.memcached.memcachedStrings.remove]
  }
  
  trait IssueData extends StObject {
    
    var failures: js.UndefOr[Double] = js.undefined
    
    var messages: js.Array[String]
    
    var server: String
    
    var tokens: js.Tuple2[String, String]
    
    var totalDownTime: js.UndefOr[Double] = js.undefined
    
    var totalFailures: js.UndefOr[Double] = js.undefined
    
    var totalReconnectsAttempted: js.UndefOr[Double] = js.undefined
    
    var totalReconnectsFailed: js.UndefOr[Double] = js.undefined
    
    var totalReconnectsSuccess: js.UndefOr[Double] = js.undefined
  }
  object IssueData {
    
    inline def apply(messages: js.Array[String], server: String, tokens: js.Tuple2[String, String]): IssueData = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueData]
    }
    
    extension [Self <: IssueData](x: Self) {
      
      inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
      
      inline def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Tuple2[String, String]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTotalDownTime(value: Double): Self = StObject.set(x, "totalDownTime", value.asInstanceOf[js.Any])
      
      inline def setTotalDownTimeUndefined: Self = StObject.set(x, "totalDownTime", js.undefined)
      
      inline def setTotalFailures(value: Double): Self = StObject.set(x, "totalFailures", value.asInstanceOf[js.Any])
      
      inline def setTotalFailuresUndefined: Self = StObject.set(x, "totalFailures", js.undefined)
      
      inline def setTotalReconnectsAttempted(value: Double): Self = StObject.set(x, "totalReconnectsAttempted", value.asInstanceOf[js.Any])
      
      inline def setTotalReconnectsAttemptedUndefined: Self = StObject.set(x, "totalReconnectsAttempted", js.undefined)
      
      inline def setTotalReconnectsFailed(value: Double): Self = StObject.set(x, "totalReconnectsFailed", value.asInstanceOf[js.Any])
      
      inline def setTotalReconnectsFailedUndefined: Self = StObject.set(x, "totalReconnectsFailed", js.undefined)
      
      inline def setTotalReconnectsSuccess(value: Double): Self = StObject.set(x, "totalReconnectsSuccess", value.asInstanceOf[js.Any])
      
      inline def setTotalReconnectsSuccessUndefined: Self = StObject.set(x, "totalReconnectsSuccess", js.undefined)
    }
  }
  
  /**
    * Declaration for single server or Memcached cluster location
    *
    * to connect to a single server use
    * "127.0.0.1:11211"
    *
    * to connect to a cluster of Memcached servers use
    * ["127.0.0.1:11211","127.0.0.1:11212"]
    *
    * to connect to servers with weight use
    * {"127.0.0.1:11211": 1,"127.0.0.1:11212": 2}
    */
  type Location = String | js.Array[String] | StringDictionary[Double]
  
  @js.native
  trait Memcached extends EventEmitter {
    
    /**
      * Add the value, only if it's not in memcached already.
      * @param key The key
      * @param value Either a buffer, JSON, number or string that you want to store.
      */
    def add(
      key: String,
      value: js.Any,
      lifetime: Double,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
    ): Unit = js.native
    
    /**
      * Add the given value string to the value of an existing item.
      * @param key The key
      * @param value Either a buffer, JSON, number or string that you want to store.
      */
    def append(
      key: String,
      value: js.Any,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
    ): Unit = js.native
    
    /**
      * Inspect cache, see examples for a detailed explanation.
      */
    def cachedump(
      server: String,
      slabid: Double,
      number: Double,
      cb: js.Function2[/* err */ js.Any, /* cachedump */ CacheDumpData | js.Array[CacheDumpData], Unit]
    ): Unit = js.native
    
    /**
      * Add the value, only if it matches the given CAS value.
      * @param key The key
      * @param value Either a buffer, JSON, number or string that you want to store.
      */
    def cas(
      key: String,
      value: js.Any,
      cas: String,
      lifetime: Double,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
    ): Unit = js.native
    
    /**
      * Decrement a given key.
      * @param key The key
      * @param amount The decrement
      */
    def decr(
      key: String,
      amount: Double,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean | Double, Unit]
    ): Unit = js.native
    
    /**
      * Remove the key from memcached.
      * @param key The key
      */
    def del(
      key: String,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
    ): Unit = js.native
    
    /**
      * Closes all active memcached connections.
      */
    def end(): Unit = js.native
    
    /**
      * Flushes the memcached server.
      */
    def flush(cb: js.ThisFunction2[/* this */ Unit, /* err */ js.Any, /* results */ js.Array[Boolean], Unit]): Unit = js.native
    
    /**
      * Get the value for the given key.
      * @param key The key
      */
    def get(
      key: String,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* data */ js.Any, Unit]
    ): Unit = js.native
    
    /**
      * Retrieves a bunch of values from multiple keys.
      * @param keys all the keys that needs to be fetched
      */
    def getMulti(
      keys: js.Array[String],
      cb: js.ThisFunction2[/* this */ Unit, /* err */ js.Any, /* data */ StringDictionary[js.Any], Unit]
    ): Unit = js.native
    
    /**
      * Get the value and the CAS id.
      * @param key The key
      */
    def gets(
      key: String,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* data */ Dictkey, Unit]
    ): Unit = js.native
    
    /**
      * Increment a given key.
      * @param key The key
      * @param amount The increment
      */
    def incr(
      key: String,
      amount: Double,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean | Double, Unit]
    ): Unit = js.native
    
    /**
      * Retrieves stats items information.
      */
    def items(cb: js.Function2[/* err */ js.Any, /* stats */ js.Array[StatusData], Unit]): Unit = js.native
    
    /**
      * Register event listener
      */
    def on(event: EventNames, cb: js.Function1[/* err */ IssueData, Unit]): this.type = js.native
    
    /**
      * Add the given value string to the value of an existing item.
      * @param key The key
      * @param value Either a buffer, JSON, number or string that you want to store.
      */
    def prepend(
      key: String,
      value: js.Any,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
    ): Unit = js.native
    
    /**
      * Replaces the value in memcached.
      * @param key The key
      * @param value Either a buffer, JSON, number or string that you want to store.
      */
    def replace(
      key: String,
      value: js.Any,
      lifetime: Double,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
    ): Unit = js.native
    
    /**
      * Stores a new value in Memcached.
      *
      * @param key The key
      * @param value Either a buffer, JSON, number or string that you want to store.
      */
    def set(
      key: String,
      value: js.Any,
      lifetime: Double,
      cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
    ): Unit = js.native
    
    /**
      * Retrieves your stats settings.
      */
    def settings(cb: js.Function2[/* err */ js.Any, /* settings */ js.Array[StatusData], Unit]): Unit = js.native
    
    /**
      * Retrieves stats slabs information.
      */
    def slabs(cb: js.Function2[/* err */ js.Any, /* stats */ js.Array[StatusData], Unit]): Unit = js.native
    
    /**
      * Retrieves stats from your memcached server.
      */
    def stats(cb: js.Function2[/* err */ js.Any, /* stats */ js.Array[StatusData], Unit]): Unit = js.native
    
    /**
      * Touches the given key.
      * @param key The key
      * @param lifetime After how long should the key expire measured in seconds
      */
    def touch(
      key: String,
      lifetime: Double,
      cb: js.ThisFunction1[/* this */ CommandData, /* err */ js.Any, Unit]
    ): Unit = js.native
    
    /**
      * Retrieves the version number of your server.
      */
    def version(cb: js.Function2[/* err */ js.Any, /* version */ js.Array[VersionData], Unit]): Unit = js.native
  }
  
  trait StatusData
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String | Boolean | Double]] {
    
    var server: js.UndefOr[String] = js.undefined
  }
  object StatusData {
    
    inline def apply(): StatusData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusData]
    }
    
    extension [Self <: StatusData](x: Self) {
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  trait VersionData
    extends StObject
       with StatusData {
    
    var bugfix: String
    
    var major: String
    
    var minor: String
    
    var version: String
  }
  object VersionData {
    
    inline def apply(bugfix: String, major: String, minor: String, version: String): VersionData = {
      val __obj = js.Dynamic.literal(bugfix = bugfix.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VersionData]
    }
    
    extension [Self <: VersionData](x: Self) {
      
      inline def setBugfix(value: String): Self = StObject.set(x, "bugfix", value.asInstanceOf[js.Any])
      
      inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait options extends StObject {
    
    /**
      * md5, the hashing algorithm used to generate the hashRing values.
      */
    var algorithm: js.UndefOr[String] = js.undefined
    
    /**
      * undefined, an array of server_locations to replace servers that fail and that are removed from the consistent hashing scheme.
      */
    var failOverServers: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * 5, the number of failed-attempts to a server before it is regarded as 'dead'.
      */
    var failures: js.UndefOr[Double] = js.undefined
    
    /**
      * 5000, the idle timeout for the connections.
      */
    var idle: js.UndefOr[Double] = js.undefined
    
    /**
      * true, whether to use md5 as hashing scheme when keys exceed maxKeySize.
      */
    var keyCompression: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 2592000, the maximum expiration time of keys (in seconds).
      */
    var maxExpiration: js.UndefOr[Double] = js.undefined
    
    /**
      * 250, the maximum key size allowed.
      */
    var maxKeySize: js.UndefOr[Double] = js.undefined
    
    /**
      * 1048576, the maximum size of a value.
      */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /**
      * '', sentinel to prepend to all memcache keys for namespacing the entries.
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * 10, the maximum size of the connection pool.
      */
    var poolSize: js.UndefOr[Double] = js.undefined
    
    /**
      * 18000000, the time between reconnection attempts (in milliseconds).
      */
    var reconnect: js.UndefOr[Double] = js.undefined
    
    /**
      * false, if true, authorizes the automatic removal of dead servers from the pool.
      */
    var remove: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 5, the number of socket allocation retries per request.
      */
    var retries: js.UndefOr[Double] = js.undefined
    
    /**
      * 30000, the time between a server failure and an attempt to set it up back in service.
      */
    var retry: js.UndefOr[Double] = js.undefined
    
    /**
      * 5000, the time after which Memcached sends a connection timeout (in milliseconds).
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object options {
    
    inline def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    extension [Self <: options](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setFailOverServers(value: String | js.Array[String]): Self = StObject.set(x, "failOverServers", value.asInstanceOf[js.Any])
      
      inline def setFailOverServersUndefined: Self = StObject.set(x, "failOverServers", js.undefined)
      
      inline def setFailOverServersVarargs(value: String*): Self = StObject.set(x, "failOverServers", js.Array(value :_*))
      
      inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
      
      inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
      
      inline def setKeyCompression(value: Boolean): Self = StObject.set(x, "keyCompression", value.asInstanceOf[js.Any])
      
      inline def setKeyCompressionUndefined: Self = StObject.set(x, "keyCompression", js.undefined)
      
      inline def setMaxExpiration(value: Double): Self = StObject.set(x, "maxExpiration", value.asInstanceOf[js.Any])
      
      inline def setMaxExpirationUndefined: Self = StObject.set(x, "maxExpiration", js.undefined)
      
      inline def setMaxKeySize(value: Double): Self = StObject.set(x, "maxKeySize", value.asInstanceOf[js.Any])
      
      inline def setMaxKeySizeUndefined: Self = StObject.set(x, "maxKeySize", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      inline def setReconnect(value: Double): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
