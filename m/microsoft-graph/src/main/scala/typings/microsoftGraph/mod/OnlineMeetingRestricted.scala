package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlineMeetingRestricted extends StObject {
  
  /**
    * Specifies the reason shared content from this participant is disabled. Possible values are: watermarkProtection,
    * unknownFutureValue.
    */
  var contentSharingDisabled: js.UndefOr[NullableOption[OnlineMeetingContentSharingDisabledReason]] = js.undefined
  
  /**
    * Specifies the reason video from this participant is disabled. Possible values are: watermarkProtection,
    * unknownFutureValue.
    */
  var videoDisabled: js.UndefOr[NullableOption[OnlineMeetingVideoDisabledReason]] = js.undefined
}
object OnlineMeetingRestricted {
  
  inline def apply(): OnlineMeetingRestricted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineMeetingRestricted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlineMeetingRestricted] (val x: Self) extends AnyVal {
    
    inline def setContentSharingDisabled(value: NullableOption[OnlineMeetingContentSharingDisabledReason]): Self = StObject.set(x, "contentSharingDisabled", value.asInstanceOf[js.Any])
    
    inline def setContentSharingDisabledNull: Self = StObject.set(x, "contentSharingDisabled", null)
    
    inline def setContentSharingDisabledUndefined: Self = StObject.set(x, "contentSharingDisabled", js.undefined)
    
    inline def setVideoDisabled(value: NullableOption[OnlineMeetingVideoDisabledReason]): Self = StObject.set(x, "videoDisabled", value.asInstanceOf[js.Any])
    
    inline def setVideoDisabledNull: Self = StObject.set(x, "videoDisabled", null)
    
    inline def setVideoDisabledUndefined: Self = StObject.set(x, "videoDisabled", js.undefined)
  }
}
