package typings.mraid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRAIDExpandProperties
  extends StObject
     with MRAIDSize {
  
  val isModal: Boolean
  
  // Deprecated in MRAID 3.0; should still be provided by SDKs for backwards compatibility, but may not be honoured
  var useCustomClose: Boolean
}
object MRAIDExpandProperties {
  
  inline def apply(height: Double, isModal: Boolean, useCustomClose: Boolean, width: Double): MRAIDExpandProperties = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isModal = isModal.asInstanceOf[js.Any], useCustomClose = useCustomClose.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRAIDExpandProperties]
  }
  
  extension [Self <: MRAIDExpandProperties](x: Self) {
    
    inline def setIsModal(value: Boolean): Self = StObject.set(x, "isModal", value.asInstanceOf[js.Any])
    
    inline def setUseCustomClose(value: Boolean): Self = StObject.set(x, "useCustomClose", value.asInstanceOf[js.Any])
  }
}
