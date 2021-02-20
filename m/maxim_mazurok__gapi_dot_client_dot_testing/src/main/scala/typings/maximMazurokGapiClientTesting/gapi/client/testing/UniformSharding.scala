package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniformSharding extends StObject {
  
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
  implicit class UniformShardingMutableBuilder[Self <: UniformSharding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumShards(value: Double): Self = StObject.set(x, "numShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumShardsUndefined: Self = StObject.set(x, "numShards", js.undefined)
  }
}
