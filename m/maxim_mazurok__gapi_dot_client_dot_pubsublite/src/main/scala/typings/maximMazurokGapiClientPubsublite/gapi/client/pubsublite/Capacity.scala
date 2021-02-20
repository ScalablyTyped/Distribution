package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Capacity extends StObject {
  
  /** Publish throughput capacity per partition in MiB/s. Must be >= 4 and <= 16. */
  var publishMibPerSec: js.UndefOr[Double] = js.native
  
  /** Subscribe throughput capacity per partition in MiB/s. Must be >= 4 and <= 32. */
  var subscribeMibPerSec: js.UndefOr[Double] = js.native
}
object Capacity {
  
  @scala.inline
  def apply(): Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capacity]
  }
  
  @scala.inline
  implicit class CapacityMutableBuilder[Self <: Capacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublishMibPerSec(value: Double): Self = StObject.set(x, "publishMibPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishMibPerSecUndefined: Self = StObject.set(x, "publishMibPerSec", js.undefined)
    
    @scala.inline
    def setSubscribeMibPerSec(value: Double): Self = StObject.set(x, "subscribeMibPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribeMibPerSecUndefined: Self = StObject.set(x, "subscribeMibPerSec", js.undefined)
  }
}
