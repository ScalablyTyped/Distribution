package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the language (e.g., "French"). */
  var displayName: js.UndefOr[String] = js.native
}
object LanguageTargetingOptionDetails {
  
  @scala.inline
  def apply(): LanguageTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class LanguageTargetingOptionDetailsMutableBuilder[Self <: LanguageTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
