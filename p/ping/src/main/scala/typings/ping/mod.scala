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
      * Executes the system ping utility.
      *
      * @param addr Hostname or IP address.
      * @param config Ping configuration.
      */
    inline def probe(addr: String): js.Promise[PingResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("probe")(addr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PingResponse]]
    inline def probe(addr: String, config: PingConfig): js.Promise[PingResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("probe")(addr.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PingResponse]]
  }
  
  object sys {
    
    @JSImport("ping", "sys")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Executes the system ping utility.
      *
      * @param addr Hostname or IP address.
      * @param cb Response callback.
      * @param cb.isAlive Whether ping request was successful.
      * @param cb.error Error or `null` if no error.
      * @param config Ping configuration.
      */
    inline def probe(addr: String, cb: js.Function2[/* isAlive */ Boolean | Null, /* error */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("probe")(addr.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def probe(
      addr: String,
      cb: js.Function2[/* isAlive */ Boolean | Null, /* error */ Any, Unit],
      config: PingConfig
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("probe")(addr.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait PingConfig extends StObject {
    
    /**
      * Specify a timeout, in seconds, before ping exits regardless of
      * how many packets have been sent or received. In this case ping
      * does not stop after count packet are sent, it waits either for
      * deadline expire or until count probes are answered or for some
      * error notification from network.
      *
      * This option is only available on Linux and Mac.
      */
    var deadline: js.UndefOr[Double] = js.undefined
    
    /**
      * Additional arguments.
      * @default []
      */
    var extra: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Exit after sending number of `ECHO_REQUEST`.
      * @default 1
      */
    var min_reply: js.UndefOr[Double] = js.undefined
    
    /**
      * Map IP address to hostname or not.
      * @default true
      */
    var numeric: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the number of data bytes to be sent.
      * @default 56 on Linux/Mac, 32 on Windows
      */
    var packetSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Source address for sending the ping.
      */
    var sourceAddr: js.UndefOr[String] = js.undefined
    
    /**
      * Timeout in seconds for each ping request.
      * @default 2 on Linux/Mac, 5 on Windows
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Ping via IPv6 or not.
      * @default false
      */
    var v6: js.UndefOr[Boolean] = js.undefined
  }
  object PingConfig {
    
    inline def apply(): PingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PingConfig]
    }
    
    extension [Self <: PingConfig](x: Self) {
      
      inline def setDeadline(value: Double): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      inline def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
      
      inline def setExtra(value: js.Array[String]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setExtraVarargs(value: String*): Self = StObject.set(x, "extra", js.Array(value*))
      
      inline def setMin_reply(value: Double): Self = StObject.set(x, "min_reply", value.asInstanceOf[js.Any])
      
      inline def setMin_replyUndefined: Self = StObject.set(x, "min_reply", js.undefined)
      
      inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      inline def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
      
      inline def setPacketSizeUndefined: Self = StObject.set(x, "packetSize", js.undefined)
      
      inline def setSourceAddr(value: String): Self = StObject.set(x, "sourceAddr", value.asInstanceOf[js.Any])
      
      inline def setSourceAddrUndefined: Self = StObject.set(x, "sourceAddr", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setV6(value: Boolean): Self = StObject.set(x, "v6", value.asInstanceOf[js.Any])
      
      inline def setV6Undefined: Self = StObject.set(x, "v6", js.undefined)
    }
  }
  
  trait PingResponse extends StObject {
    
    /**
      * `true` for existing host.
      */
    var alive: Boolean
    
    /**
      * Average time for collection records. `unknown` if ping fails.
      */
    var avg: String
    
    /**
      * Parsed host from system command's output. `unknown` if ping fails.
      */
    var host: String
    
    /**
      * The input IP address or host.
      */
    var inputHost: String
    
    /**
      * Maximum time for collection records. `unknown` if ping fails.
      */
    var max: String
    
    /**
      * Minimum time for collection records. `unknown` if ping fails.
      */
    var min: String
    
    /**
      * Numeric target IP address.
      */
    var numeric_host: js.UndefOr[String] = js.undefined
    
    /**
      * Raw stdout from system ping. `unknown` if ping fails.
      */
    var output: String
    
    /**
      * Packet losses in percent (100% -> "100.000"). `unknown` if ping fails.
      */
    var packetLoss: String
    
    /**
      * Standard deviation time for collected records. `unknown` if ping fails.
      */
    var stddev: String
    
    /**
      * Time (float) in ms for first successful ping response. `unknown` if ping fails.
      */
    var time: Double | unknown
    
    /**
      * Array of times (float) in ms for each ping response.
      */
    var times: js.Array[Double]
  }
  object PingResponse {
    
    inline def apply(
      alive: Boolean,
      avg: String,
      host: String,
      inputHost: String,
      max: String,
      min: String,
      output: String,
      packetLoss: String,
      stddev: String,
      time: Double | unknown,
      times: js.Array[Double]
    ): PingResponse = {
      val __obj = js.Dynamic.literal(alive = alive.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputHost = inputHost.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], packetLoss = packetLoss.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
      __obj.asInstanceOf[PingResponse]
    }
    
    extension [Self <: PingResponse](x: Self) {
      
      inline def setAlive(value: Boolean): Self = StObject.set(x, "alive", value.asInstanceOf[js.Any])
      
      inline def setAvg(value: String): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setInputHost(value: String): Self = StObject.set(x, "inputHost", value.asInstanceOf[js.Any])
      
      inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setNumeric_host(value: String): Self = StObject.set(x, "numeric_host", value.asInstanceOf[js.Any])
      
      inline def setNumeric_hostUndefined: Self = StObject.set(x, "numeric_host", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setPacketLoss(value: String): Self = StObject.set(x, "packetLoss", value.asInstanceOf[js.Any])
      
      inline def setStddev(value: String): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double | unknown): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
    }
  }
}
