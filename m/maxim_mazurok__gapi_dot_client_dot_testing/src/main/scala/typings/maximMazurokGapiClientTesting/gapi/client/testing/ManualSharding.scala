package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualSharding extends js.Object {
  
  /**
    * Required. Group of packages, classes, and/or test methods to be run for each shard. When any physical devices are selected, the number of test_targets_for_shard must be >= 1 and <=
    * 50. When no physical devices are selected, the number must be >= 1 and <= 500.
    */
  var testTargetsForShard: js.UndefOr[js.Array[TestTargetsForShard]] = js.native
}
object ManualSharding {
  
  @scala.inline
  def apply(): ManualSharding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualSharding]
  }
  
  @scala.inline
  implicit class ManualShardingOps[Self <: ManualSharding] (val x: Self) extends AnyVal {
    
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
    def setTestTargetsForShardVarargs(value: TestTargetsForShard*): Self = this.set("testTargetsForShard", js.Array(value :_*))
    
    @scala.inline
    def setTestTargetsForShard(value: js.Array[TestTargetsForShard]): Self = this.set("testTargetsForShard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTargetsForShard: Self = this.set("testTargetsForShard", js.undefined)
  }
}
