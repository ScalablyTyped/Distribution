package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualSharding extends StObject {
  
  /**
    * Required. Group of packages, classes, and/or test methods to be run for each manually-created shard. You must specify at least one shard if this field is present. When you select
    * one or more physical devices, the number of repeated test_targets_for_shard must be <= 50. When you select one or more ARM virtual devices, it must be <= 50. When you select only
    * x86 virtual devices, it must be <= 500.
    */
  var testTargetsForShard: js.UndefOr[js.Array[TestTargetsForShard]] = js.undefined
}
object ManualSharding {
  
  inline def apply(): ManualSharding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualSharding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManualSharding] (val x: Self) extends AnyVal {
    
    inline def setTestTargetsForShard(value: js.Array[TestTargetsForShard]): Self = StObject.set(x, "testTargetsForShard", value.asInstanceOf[js.Any])
    
    inline def setTestTargetsForShardUndefined: Self = StObject.set(x, "testTargetsForShard", js.undefined)
    
    inline def setTestTargetsForShardVarargs(value: TestTargetsForShard*): Self = StObject.set(x, "testTargetsForShard", js.Array(value*))
  }
}
