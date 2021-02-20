package typings.ping

import typings.ping.pingStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object promise {
    
    /**
      * Performs a system ping utility.
      *
      * @param addr Hostname or IP address
      * @param config Optional configuration
      */
    @JSImport("ping", "promise.probe")
    @js.native
    def probe(addr: String): js.Promise[PingResponse] = js.native
    @JSImport("ping", "promise.probe")
    @js.native
    def probe(addr: String, config: PingConfig): js.Promise[PingResponse] = js.native
  }
  
  object sys {
    
    /**
      * Performs a system ping utility.
      *
      * @param addr Hostname or IP address
      * @param cb Response callback.
      *   First argument is successful response boolean.
      *   Second argument is any error, `null` if no error.
      * @param config Optional configuration
      */
    @JSImport("ping", "sys.probe")
    @js.native
    def probe(addr: String, cb: js.Function2[/* isAlive */ Boolean, /* error */ js.Any, Unit]): Unit = js.native
    @JSImport("ping", "sys.probe")
    @js.native
    def probe(
      addr: String,
      cb: js.Function2[/* isAlive */ Boolean, /* error */ js.Any, Unit],
      config: PingConfig
    ): Unit = js.native
  }
  
  @js.native
  trait PingConfig extends StObject {
    
    /**
      * Additional arguments. Default `[]`
      */
    var extra: js.UndefOr[js.Array[String]] = js.native
    
    /**
      *  Exit after sending number of `ECHO_REQUEST`. Default `1`
      */
    var min_reply: js.UndefOr[Double] = js.native
    
    /**
      * Map IP address to hostname or not. Default `true`
      */
    var numeric: js.UndefOr[Boolean] = js.native
    
    /**
      * Source address for sending the ping.
      */
    var sourceAddr: js.UndefOr[String] = js.native
    
    /**
      * Time duration, in seconds, for ping command to exit. Default `2` on Mac/Linux, `5` on Windows.
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * Ping via ipv6 or not. Default `false`
      */
    var v6: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait PingResponse extends StObject {
    
    /**
      * `true` for existing host
      */
    var alive: Boolean = js.native
    
    /**
      * Average time for collection records. `unknown` if ping fails.
      */
    var avg: String = js.native
    
    /**
      * The input IP address or host. `unknown` if ping fails.
      */
    var host: String = js.native
    
    /**
      * Maximum time for collection records. `unknown` if ping fails.
      */
    var max: String = js.native
    
    /**
      * Minimum time for collection records. `unknown` if ping fails.
      */
    var min: String = js.native
    
    /**
      * Numeric target IP address
      */
    var numeric_host: js.UndefOr[String] = js.native
    
    /**
      * Raw stdout from system ping
      */
    var output: String = js.native
    
    /**
      * Standard deviation time for collected records. `unknown` if ping fails.
      */
    var stddev: String = js.native
    
    /**
      * Time (float) in ms for first successful ping response. `unknown` if ping fails.
      */
    var time: Double | unknown = js.native
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
