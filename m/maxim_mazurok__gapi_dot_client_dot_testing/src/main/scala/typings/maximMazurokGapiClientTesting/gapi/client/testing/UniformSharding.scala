package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniformSharding extends StObject {
  
  /**
    * Required. The total number of shards to create. This must always be a positive number that is no greater than the total number of test cases. When you select one or more physical
    * devices, the number of shards must be <= 50. When you select one or more ARM virtual devices, it must be <= 50. When you select only x86 virtual devices, it must be <= 500.
    */
  var numShards: js.UndefOr[Double] = js.undefined
}
object UniformSharding {
  
  inline def apply(): UniformSharding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniformSharding]
  }
  
  extension [Self <: UniformSharding](x: Self) {
    
    inline def setNumShards(value: Double): Self = StObject.set(x, "numShards", value.asInstanceOf[js.Any])
    
    inline def setNumShardsUndefined: Self = StObject.set(x, "numShards", js.undefined)
  }
}
