package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capacity extends StObject {
  
  /** Publish throughput capacity per partition in MiB/s. Must be >= 4 and <= 16. */
  var publishMibPerSec: js.UndefOr[Double] = js.undefined
  
  /** Subscribe throughput capacity per partition in MiB/s. Must be >= 4 and <= 32. */
  var subscribeMibPerSec: js.UndefOr[Double] = js.undefined
}
object Capacity {
  
  inline def apply(): Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capacity]
  }
  
  extension [Self <: Capacity](x: Self) {
    
    inline def setPublishMibPerSec(value: Double): Self = StObject.set(x, "publishMibPerSec", value.asInstanceOf[js.Any])
    
    inline def setPublishMibPerSecUndefined: Self = StObject.set(x, "publishMibPerSec", js.undefined)
    
    inline def setSubscribeMibPerSec(value: Double): Self = StObject.set(x, "subscribeMibPerSec", value.asInstanceOf[js.Any])
    
    inline def setSubscribeMibPerSecUndefined: Self = StObject.set(x, "subscribeMibPerSec", js.undefined)
  }
}
