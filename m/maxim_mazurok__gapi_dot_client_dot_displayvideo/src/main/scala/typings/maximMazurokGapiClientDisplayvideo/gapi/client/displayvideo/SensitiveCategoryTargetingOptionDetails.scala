package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitiveCategoryTargetingOptionDetails extends StObject {
  
  /** Output only. An enum for the DV360 Sensitive category content classifier. */
  var sensitiveCategory: js.UndefOr[String] = js.undefined
}
object SensitiveCategoryTargetingOptionDetails {
  
  @scala.inline
  def apply(): SensitiveCategoryTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitiveCategoryTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class SensitiveCategoryTargetingOptionDetailsMutableBuilder[Self <: SensitiveCategoryTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSensitiveCategory(value: String): Self = StObject.set(x, "sensitiveCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveCategoryUndefined: Self = StObject.set(x, "sensitiveCategory", js.undefined)
  }
}
