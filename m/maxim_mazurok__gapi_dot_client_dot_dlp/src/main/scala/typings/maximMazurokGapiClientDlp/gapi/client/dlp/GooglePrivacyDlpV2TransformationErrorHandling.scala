package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TransformationErrorHandling extends StObject {
  
  /** Ignore errors */
  var leaveUntransformed: js.UndefOr[Any] = js.undefined
  
  /** Throw an error */
  var throwError: js.UndefOr[Any] = js.undefined
}
object GooglePrivacyDlpV2TransformationErrorHandling {
  
  inline def apply(): GooglePrivacyDlpV2TransformationErrorHandling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TransformationErrorHandling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2TransformationErrorHandling] (val x: Self) extends AnyVal {
    
    inline def setLeaveUntransformed(value: Any): Self = StObject.set(x, "leaveUntransformed", value.asInstanceOf[js.Any])
    
    inline def setLeaveUntransformedUndefined: Self = StObject.set(x, "leaveUntransformed", js.undefined)
    
    inline def setThrowError(value: Any): Self = StObject.set(x, "throwError", value.asInstanceOf[js.Any])
    
    inline def setThrowErrorUndefined: Self = StObject.set(x, "throwError", js.undefined)
  }
}
