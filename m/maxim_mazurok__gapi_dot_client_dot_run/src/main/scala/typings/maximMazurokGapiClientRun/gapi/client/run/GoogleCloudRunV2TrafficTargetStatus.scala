package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2TrafficTargetStatus extends StObject {
  
  /** Specifies percent of the traffic to this Revision. */
  var percent: js.UndefOr[Double] = js.undefined
  
  /** Revision to which this traffic is sent. */
  var revision: js.UndefOr[String] = js.undefined
  
  /** Indicates the string used in the URI to exclusively reference this target. */
  var tag: js.UndefOr[String] = js.undefined
  
  /** The allocation type for this traffic target. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Displays the target URI. */
  var uri: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2TrafficTargetStatus {
  
  inline def apply(): GoogleCloudRunV2TrafficTargetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2TrafficTargetStatus]
  }
  
  extension [Self <: GoogleCloudRunV2TrafficTargetStatus](x: Self) {
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
