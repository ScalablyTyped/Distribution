package typings.ping.mod

import typings.ping.pingStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PingResponse extends js.Object {
  
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
  implicit class PingResponseOps[Self <: PingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlive(value: Boolean): Self = this.set("alive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvg(value: String): Self = this.set("avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddev(value: String): Self = this.set("stddev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double | unknown): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeric_host(value: String): Self = this.set("numeric_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumeric_host: Self = this.set("numeric_host", js.undefined)
  }
}
