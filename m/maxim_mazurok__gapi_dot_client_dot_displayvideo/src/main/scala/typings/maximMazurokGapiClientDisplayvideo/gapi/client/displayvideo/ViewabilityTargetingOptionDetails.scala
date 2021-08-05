package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewabilityTargetingOptionDetails extends StObject {
  
  /** Output only. The predicted viewability percentage. */
  var viewability: js.UndefOr[String] = js.undefined
}
object ViewabilityTargetingOptionDetails {
  
  inline def apply(): ViewabilityTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewabilityTargetingOptionDetails]
  }
  
  extension [Self <: ViewabilityTargetingOptionDetails](x: Self) {
    
    inline def setViewability(value: String): Self = StObject.set(x, "viewability", value.asInstanceOf[js.Any])
    
    inline def setViewabilityUndefined: Self = StObject.set(x, "viewability", js.undefined)
  }
}
