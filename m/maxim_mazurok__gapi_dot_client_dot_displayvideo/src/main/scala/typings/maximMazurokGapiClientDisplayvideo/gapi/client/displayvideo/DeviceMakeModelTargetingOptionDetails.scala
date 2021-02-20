package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMakeModelTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the device make and model. */
  var displayName: js.UndefOr[String] = js.native
}
object DeviceMakeModelTargetingOptionDetails {
  
  @scala.inline
  def apply(): DeviceMakeModelTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMakeModelTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class DeviceMakeModelTargetingOptionDetailsMutableBuilder[Self <: DeviceMakeModelTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
