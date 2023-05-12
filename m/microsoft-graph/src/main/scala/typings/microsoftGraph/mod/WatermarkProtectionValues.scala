package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatermarkProtectionValues extends StObject {
  
  // Indicates whether to apply a watermark to any shared content.
  var isEnabledForContentSharing: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether to apply a watermark to everyone's video feed.
  var isEnabledForVideo: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object WatermarkProtectionValues {
  
  inline def apply(): WatermarkProtectionValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatermarkProtectionValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatermarkProtectionValues] (val x: Self) extends AnyVal {
    
    inline def setIsEnabledForContentSharing(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabledForContentSharing", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledForContentSharingNull: Self = StObject.set(x, "isEnabledForContentSharing", null)
    
    inline def setIsEnabledForContentSharingUndefined: Self = StObject.set(x, "isEnabledForContentSharing", js.undefined)
    
    inline def setIsEnabledForVideo(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabledForVideo", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledForVideoNull: Self = StObject.set(x, "isEnabledForVideo", null)
    
    inline def setIsEnabledForVideoUndefined: Self = StObject.set(x, "isEnabledForVideo", js.undefined)
  }
}
