package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentalStatusTargetingOptionDetails extends StObject {
  
  /** Output only. The parental status of an audience. */
  var parentalStatus: js.UndefOr[String] = js.native
}
object ParentalStatusTargetingOptionDetails {
  
  @scala.inline
  def apply(): ParentalStatusTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentalStatusTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ParentalStatusTargetingOptionDetailsMutableBuilder[Self <: ParentalStatusTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentalStatus(value: String): Self = StObject.set(x, "parentalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentalStatusUndefined: Self = StObject.set(x, "parentalStatus", js.undefined)
  }
}
