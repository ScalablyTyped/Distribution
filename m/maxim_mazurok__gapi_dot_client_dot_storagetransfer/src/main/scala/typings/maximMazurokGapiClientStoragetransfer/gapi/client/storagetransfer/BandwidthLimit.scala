package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandwidthLimit extends StObject {
  
  /** Bandwidth rate in megabytes per second, distributed across all the agents in the pool. */
  var limitMbps: js.UndefOr[String] = js.undefined
}
object BandwidthLimit {
  
  inline def apply(): BandwidthLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandwidthLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BandwidthLimit] (val x: Self) extends AnyVal {
    
    inline def setLimitMbps(value: String): Self = StObject.set(x, "limitMbps", value.asInstanceOf[js.Any])
    
    inline def setLimitMbpsUndefined: Self = StObject.set(x, "limitMbps", js.undefined)
  }
}
