package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatingSystemTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the operating system. */
  var displayName: js.UndefOr[String] = js.undefined
}
object OperatingSystemTargetingOptionDetails {
  
  inline def apply(): OperatingSystemTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemTargetingOptionDetails]
  }
  
  extension [Self <: OperatingSystemTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
