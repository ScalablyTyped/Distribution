package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomBiddingModelReadinessState extends StObject {
  
  /** The unique ID of the relevant advertiser. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** The readiness state of custom bidding model. */
  var readinessState: js.UndefOr[String] = js.undefined
}
object CustomBiddingModelReadinessState {
  
  inline def apply(): CustomBiddingModelReadinessState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomBiddingModelReadinessState]
  }
  
  extension [Self <: CustomBiddingModelReadinessState](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setReadinessState(value: String): Self = StObject.set(x, "readinessState", value.asInstanceOf[js.Any])
    
    inline def setReadinessStateUndefined: Self = StObject.set(x, "readinessState", js.undefined)
  }
}
