package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualSharding extends StObject {
  
  /**
    * Required. Group of packages, classes, and/or test methods to be run for each shard. When any physical devices are selected, the number of test_targets_for_shard must be >= 1 and <=
    * 50. When no physical devices are selected, the number must be >= 1 and <= 500.
    */
  var testTargetsForShard: js.UndefOr[js.Array[TestTargetsForShard]] = js.undefined
}
object ManualSharding {
  
  @scala.inline
  def apply(): ManualSharding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualSharding]
  }
  
  @scala.inline
  implicit class ManualShardingMutableBuilder[Self <: ManualSharding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestTargetsForShard(value: js.Array[TestTargetsForShard]): Self = StObject.set(x, "testTargetsForShard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTargetsForShardUndefined: Self = StObject.set(x, "testTargetsForShard", js.undefined)
    
    @scala.inline
    def setTestTargetsForShardVarargs(value: TestTargetsForShard*): Self = StObject.set(x, "testTargetsForShard", js.Array(value :_*))
  }
}
