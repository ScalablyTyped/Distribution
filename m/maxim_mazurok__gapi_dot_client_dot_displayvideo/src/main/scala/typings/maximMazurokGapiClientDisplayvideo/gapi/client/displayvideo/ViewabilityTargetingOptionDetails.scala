package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewabilityTargetingOptionDetails extends StObject {
  
  /** Output only. The predicted viewability percentage. */
  var viewability: js.UndefOr[String] = js.undefined
}
object ViewabilityTargetingOptionDetails {
  
  @scala.inline
  def apply(): ViewabilityTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewabilityTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ViewabilityTargetingOptionDetailsMutableBuilder[Self <: ViewabilityTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewability(value: String): Self = StObject.set(x, "viewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityUndefined: Self = StObject.set(x, "viewability", js.undefined)
  }
}
