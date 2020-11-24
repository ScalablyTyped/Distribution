package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShardingOption extends js.Object {
  
  /** Shards test cases into the specified groups of packages, classes, and/or methods. */
  var manualSharding: js.UndefOr[ManualSharding] = js.native
  
  /** Uniformly shards test cases given a total number of shards. */
  var uniformSharding: js.UndefOr[UniformSharding] = js.native
}
object ShardingOption {
  
  @scala.inline
  def apply(): ShardingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShardingOption]
  }
  
  @scala.inline
  implicit class ShardingOptionOps[Self <: ShardingOption] (val x: Self) extends AnyVal {
    
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
    def setManualSharding(value: ManualSharding): Self = this.set("manualSharding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualSharding: Self = this.set("manualSharding", js.undefined)
    
    @scala.inline
    def setUniformSharding(value: UniformSharding): Self = this.set("uniformSharding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniformSharding: Self = this.set("uniformSharding", js.undefined)
  }
}
