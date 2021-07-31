package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardingOption extends StObject {
  
  /** Shards test cases into the specified groups of packages, classes, and/or methods. */
  var manualSharding: js.UndefOr[ManualSharding] = js.undefined
  
  /** Uniformly shards test cases given a total number of shards. */
  var uniformSharding: js.UndefOr[UniformSharding] = js.undefined
}
object ShardingOption {
  
  @scala.inline
  def apply(): ShardingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShardingOption]
  }
  
  @scala.inline
  implicit class ShardingOptionMutableBuilder[Self <: ShardingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManualSharding(value: ManualSharding): Self = StObject.set(x, "manualSharding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualShardingUndefined: Self = StObject.set(x, "manualSharding", js.undefined)
    
    @scala.inline
    def setUniformSharding(value: UniformSharding): Self = StObject.set(x, "uniformSharding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformShardingUndefined: Self = StObject.set(x, "uniformSharding", js.undefined)
  }
}
