package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2RevisionScaling extends StObject {
  
  /** Maximum number of serving instances that this resource should have. */
  var maxInstanceCount: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of serving instances that this resource should have. */
  var minInstanceCount: js.UndefOr[Double] = js.undefined
}
object GoogleCloudRunV2RevisionScaling {
  
  inline def apply(): GoogleCloudRunV2RevisionScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2RevisionScaling]
  }
  
  extension [Self <: GoogleCloudRunV2RevisionScaling](x: Self) {
    
    inline def setMaxInstanceCount(value: Double): Self = StObject.set(x, "maxInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setMaxInstanceCountUndefined: Self = StObject.set(x, "maxInstanceCount", js.undefined)
    
    inline def setMinInstanceCount(value: Double): Self = StObject.set(x, "minInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setMinInstanceCountUndefined: Self = StObject.set(x, "minInstanceCount", js.undefined)
  }
}
