package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the language (e.g., "French"). */
  var displayName: js.UndefOr[String] = js.undefined
}
object LanguageTargetingOptionDetails {
  
  inline def apply(): LanguageTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageTargetingOptionDetails]
  }
  
  extension [Self <: LanguageTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
