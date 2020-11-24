package typings.overloadProtection.mod

import typings.overloadProtection.overloadProtectionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectionConfig extends js.Object {
  
  var clientRetrySecs: js.UndefOr[Double] = js.native
  
  var errorPropagationMode: js.UndefOr[Boolean] = js.native
  
  var logStatsOnReq: js.UndefOr[`false`] = js.native
  
  var logging: js.UndefOr[Boolean | String | (js.Function1[/* msg */ String, Unit])] = js.native
  
  var maxEventLoopDelay: js.UndefOr[Double] = js.native
  
  var maxHeapUsedBytes: js.UndefOr[Double] = js.native
  
  var maxRssBytes: js.UndefOr[Double] = js.native
  
  var production: js.UndefOr[Boolean] = js.native
  
  var sampleInterval: js.UndefOr[Double] = js.native
}
object ProtectionConfig {
  
  @scala.inline
  def apply(): ProtectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectionConfig]
  }
  
  @scala.inline
  implicit class ProtectionConfigOps[Self <: ProtectionConfig] (val x: Self) extends AnyVal {
    
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
    def setClientRetrySecs(value: Double): Self = this.set("clientRetrySecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRetrySecs: Self = this.set("clientRetrySecs", js.undefined)
    
    @scala.inline
    def setErrorPropagationMode(value: Boolean): Self = this.set("errorPropagationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorPropagationMode: Self = this.set("errorPropagationMode", js.undefined)
    
    @scala.inline
    def setLogStatsOnReq(value: `false`): Self = this.set("logStatsOnReq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStatsOnReq: Self = this.set("logStatsOnReq", js.undefined)
    
    @scala.inline
    def setLoggingFunction1(value: /* msg */ String => Unit): Self = this.set("logging", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogging(value: Boolean | String | (js.Function1[/* msg */ String, Unit])): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMaxEventLoopDelay(value: Double): Self = this.set("maxEventLoopDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxEventLoopDelay: Self = this.set("maxEventLoopDelay", js.undefined)
    
    @scala.inline
    def setMaxHeapUsedBytes(value: Double): Self = this.set("maxHeapUsedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeapUsedBytes: Self = this.set("maxHeapUsedBytes", js.undefined)
    
    @scala.inline
    def setMaxRssBytes(value: Double): Self = this.set("maxRssBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRssBytes: Self = this.set("maxRssBytes", js.undefined)
    
    @scala.inline
    def setProduction(value: Boolean): Self = this.set("production", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduction: Self = this.set("production", js.undefined)
    
    @scala.inline
    def setSampleInterval(value: Double): Self = this.set("sampleInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleInterval: Self = this.set("sampleInterval", js.undefined)
  }
}
