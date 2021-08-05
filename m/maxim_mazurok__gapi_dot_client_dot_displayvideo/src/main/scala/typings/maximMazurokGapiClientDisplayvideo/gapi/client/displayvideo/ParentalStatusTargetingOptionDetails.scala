package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentalStatusTargetingOptionDetails extends StObject {
  
  /** Output only. The parental status of an audience. */
  var parentalStatus: js.UndefOr[String] = js.undefined
}
object ParentalStatusTargetingOptionDetails {
  
  inline def apply(): ParentalStatusTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentalStatusTargetingOptionDetails]
  }
  
  extension [Self <: ParentalStatusTargetingOptionDetails](x: Self) {
    
    inline def setParentalStatus(value: String): Self = StObject.set(x, "parentalStatus", value.asInstanceOf[js.Any])
    
    inline def setParentalStatusUndefined: Self = StObject.set(x, "parentalStatus", js.undefined)
  }
}
