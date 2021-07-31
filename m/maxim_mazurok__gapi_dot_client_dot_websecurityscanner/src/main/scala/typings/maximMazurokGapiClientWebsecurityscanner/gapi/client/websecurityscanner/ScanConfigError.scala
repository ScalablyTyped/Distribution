package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanConfigError extends StObject {
  
  /** Output only. Indicates the reason code for a configuration failure. */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Indicates the full name of the ScanConfig field that triggers this error, for example "scan_config.max_qps". This field is provided for troubleshooting purposes only
    * and its actual value can change in the future.
    */
  var fieldName: js.UndefOr[String] = js.undefined
}
object ScanConfigError {
  
  @scala.inline
  def apply(): ScanConfigError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanConfigError]
  }
  
  @scala.inline
  implicit class ScanConfigErrorMutableBuilder[Self <: ScanConfigError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
  }
}
