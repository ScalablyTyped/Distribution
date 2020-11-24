package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadPolicyConfig extends js.Object {
  
  var maxEventLoopDelay: js.UndefOr[Double] = js.native
  
  var maxHeapUsedBytes: js.UndefOr[Double] = js.native
  
  var maxRssBytes: js.UndefOr[Double] = js.native
}
object LoadPolicyConfig {
  
  @scala.inline
  def apply(): LoadPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPolicyConfig]
  }
  
  @scala.inline
  implicit class LoadPolicyConfigOps[Self <: LoadPolicyConfig] (val x: Self) extends AnyVal {
    
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
  }
}
