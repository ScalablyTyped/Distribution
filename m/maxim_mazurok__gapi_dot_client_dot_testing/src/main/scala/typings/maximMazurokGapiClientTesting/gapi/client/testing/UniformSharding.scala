package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniformSharding extends StObject {
  
  /**
    * Required. Total number of shards. When any physical devices are selected, the number must be >= 1 and <= 50. When no physical devices are selected, the number must be >= 1 and <=
    * 500.
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
