package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniformSharding extends js.Object {
  
  /**
    * Required. Total number of shards. When any physical devices are selected, the number must be >= 1 and <= 50. When no physical devices are selected, the number must be >= 1 and <=
    * 500.
    */
  var numShards: js.UndefOr[Double] = js.native
}
object UniformSharding {
  
  @scala.inline
  def apply(): UniformSharding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniformSharding]
  }
  
  @scala.inline
  implicit class UniformShardingOps[Self <: UniformSharding] (val x: Self) extends AnyVal {
    
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
    def setNumShards(value: Double): Self = this.set("numShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumShards: Self = this.set("numShards", js.undefined)
  }
}
