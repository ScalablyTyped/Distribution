package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TransformationErrorHandling extends StObject {
  
  /** Ignore errors */
  var leaveUntransformed: js.UndefOr[js.Any] = js.undefined
  
  /** Throw an error */
  var throwError: js.UndefOr[js.Any] = js.undefined
}
object GooglePrivacyDlpV2TransformationErrorHandling {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2TransformationErrorHandling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TransformationErrorHandling]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TransformationErrorHandlingMutableBuilder[Self <: GooglePrivacyDlpV2TransformationErrorHandling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaveUntransformed(value: js.Any): Self = StObject.set(x, "leaveUntransformed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveUntransformedUndefined: Self = StObject.set(x, "leaveUntransformed", js.undefined)
    
    @scala.inline
    def setThrowError(value: js.Any): Self = StObject.set(x, "throwError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowErrorUndefined: Self = StObject.set(x, "throwError", js.undefined)
  }
}
