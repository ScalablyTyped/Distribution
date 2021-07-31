package typings.ping

import typings.ping.pingStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object promise {
    
    @JSImport("ping", "promise")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Performs a system ping utility.
      *
      * @param addr Hostname or IP address
      * @param config Optional configuration
      */
    @scala.inline
    def probe(addr: String): js.Promise[PingResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("probe")(addr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PingResponse]]
    @scala.inline
    def probe(addr: String, config: PingConfig): js.Promise[PingResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("probe")(addr.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PingResponse]]
  }
  
  object sys {
    
    @JSImport("ping", "sys")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Performs a system ping utility.
      *
      * @param addr Hostname or IP address
      * @param cb Response callback.
      *   First argument is successful response boolean.
      *   Second argument is any error, `null` if no error.
      * @param config Optional configuration
      */
    @scala.inline
    def probe(addr: String, cb: js.Function2[/* isAlive */ Boolean, /* error */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("probe")(addr.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def probe(
      addr: String,
      cb: js.Function2[/* isAlive */ Boolean, /* error */ js.Any, Unit],
      config: PingConfig
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("probe")(addr.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait PingConfig extends StObject {
    
    /**
      * Additional arguments. Default `[]`
      */
    var extra: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  Exit after sending number of `ECHO_REQUEST`. Default `1`
      */
    var min_reply: js.UndefOr[Double] = js.undefined
    
    /**
      * Map IP address to hostname or not. Default `true`
      */
    var numeric: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Source address for sending the ping.
      */
    var sourceAddr: js.UndefOr[String] = js.undefined
    
    /**
      * Time duration, in seconds, for ping command to exit. Default `2` on Mac/Linux, `5` on Windows.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Ping via ipv6 or not. Default `false`
      */
    var v6: js.UndefOr[Boolean] = js.undefined
  }
  object PingConfig {
    
    @scala.inline
    def apply(): PingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PingConfig]
    }
    
    @scala.inline
    implicit class PingConfigMutableBuilder[Self <: PingConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: js.Array[String]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setExtraVarargs(value: String*): Self = StObject.set(x, "extra", js.Array(value :_*))
      
      @scala.inline
      def setMin_reply(value: Double): Self = StObject.set(x, "min_reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin_replyUndefined: Self = StObject.set(x, "min_reply", js.undefined)
      
      @scala.inline
      def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      @scala.inline
      def setSourceAddr(value: String): Self = StObject.set(x, "sourceAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceAddrUndefined: Self = StObject.set(x, "sourceAddr", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setV6(value: Boolean): Self = StObject.set(x, "v6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV6Undefined: Self = StObject.set(x, "v6", js.undefined)
    }
  }
  
  trait PingResponse extends StObject {
    
    /**
      * `true` for existing host
      */
    var alive: Boolean
    
    /**
      * Average time for collection records. `unknown` if ping fails.
      */
    var avg: String
    
    /**
      * The input IP address or host. `unknown` if ping fails.
      */
    var host: String
    
    /**
      * Maximum time for collection records. `unknown` if ping fails.
      */
    var max: String
    
    /**
      * Minimum time for collection records. `unknown` if ping fails.
      */
    var min: String
    
    /**
      * Numeric target IP address
      */
    var numeric_host: js.UndefOr[String] = js.undefined
    
    /**
      * Raw stdout from system ping
      */
    var output: String
    
    /**
      * Standard deviation time for collected records. `unknown` if ping fails.
      */
    var stddev: String
    
    /**
      * Time (float) in ms for first successful ping response. `unknown` if ping fails.
      */
    var time: Double | unknown
  }
  object PingResponse {
    
    @scala.inline
    def apply(
      alive: Boolean,
      avg: String,
      host: String,
      max: String,
      min: String,
      output: String,
      stddev: String,
      time: Double | unknown
    ): PingResponse = {
      val __obj = js.Dynamic.literal(alive = alive.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[PingResponse]
    }
    
    @scala.inline
    implicit class PingResponseMutableBuilder[Self <: PingResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlive(value: Boolean): Self = StObject.set(x, "alive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvg(value: String): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeric_host(value: String): Self = StObject.set(x, "numeric_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeric_hostUndefined: Self = StObject.set(x, "numeric_host", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStddev(value: String): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double | unknown): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
