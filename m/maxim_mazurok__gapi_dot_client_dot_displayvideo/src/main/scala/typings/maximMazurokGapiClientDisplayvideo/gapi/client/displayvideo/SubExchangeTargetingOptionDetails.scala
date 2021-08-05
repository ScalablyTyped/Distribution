package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubExchangeTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the sub-exchange. */
  var displayName: js.UndefOr[String] = js.undefined
}
object SubExchangeTargetingOptionDetails {
  
  inline def apply(): SubExchangeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubExchangeTargetingOptionDetails]
  }
  
  extension [Self <: SubExchangeTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
