package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionConfig extends StObject {
  
  /** The capacity configuration. */
  var capacity: js.UndefOr[Capacity] = js.undefined
  
  /** The number of partitions in the topic. Must be at least 1. */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * DEPRECATED: Use capacity instead which can express a superset of configurations. Every partition in the topic is allocated throughput equivalent to `scale` times the standard
    * partition throughput (4 MiB/s). This is also reflected in the cost of this topic; a topic with `scale` of 2 and count of 10 is charged for 20 partitions. This value must be in the
    * range [1,4].
    */
  var scale: js.UndefOr[Double] = js.undefined
}
object PartitionConfig {
  
  inline def apply(): PartitionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionConfig]
  }
  
  extension [Self <: PartitionConfig](x: Self) {
    
    inline def setCapacity(value: Capacity): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
