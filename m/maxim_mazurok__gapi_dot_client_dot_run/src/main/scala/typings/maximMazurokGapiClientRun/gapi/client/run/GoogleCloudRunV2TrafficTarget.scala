package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2TrafficTarget extends StObject {
  
  /** Specifies percent of the traffic to this Revision. This defaults to zero if unspecified. */
  var percent: js.UndefOr[Double] = js.undefined
  
  /** Revision to which to send this portion of traffic, if traffic allocation is by revision. */
  var revision: js.UndefOr[String] = js.undefined
  
  /** Indicates a string to be part of the URI to exclusively reference this target. */
  var tag: js.UndefOr[String] = js.undefined
  
  /** The allocation type for this traffic target. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2TrafficTarget {
  
  inline def apply(): GoogleCloudRunV2TrafficTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2TrafficTarget]
  }
  
  extension [Self <: GoogleCloudRunV2TrafficTarget](x: Self) {
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
