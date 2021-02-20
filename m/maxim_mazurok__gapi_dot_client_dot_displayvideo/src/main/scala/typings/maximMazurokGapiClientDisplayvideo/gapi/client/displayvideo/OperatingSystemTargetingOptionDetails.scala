package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystemTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the operating system. */
  var displayName: js.UndefOr[String] = js.native
}
object OperatingSystemTargetingOptionDetails {
  
  @scala.inline
  def apply(): OperatingSystemTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class OperatingSystemTargetingOptionDetailsMutableBuilder[Self <: OperatingSystemTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
