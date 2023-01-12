package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningCertificateUpdateStatus extends StObject {
  
  // Status of the last certificate update. Read-only. For a list of statuses, see certificateUpdateResult status.
  var certificateUpdateResult: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time in ISO 8601 format and in UTC time when the certificate was last updated. Read-only.
  var lastRunDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object SigningCertificateUpdateStatus {
  
  inline def apply(): SigningCertificateUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningCertificateUpdateStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SigningCertificateUpdateStatus] (val x: Self) extends AnyVal {
    
    inline def setCertificateUpdateResult(value: NullableOption[String]): Self = StObject.set(x, "certificateUpdateResult", value.asInstanceOf[js.Any])
    
    inline def setCertificateUpdateResultNull: Self = StObject.set(x, "certificateUpdateResult", null)
    
    inline def setCertificateUpdateResultUndefined: Self = StObject.set(x, "certificateUpdateResult", js.undefined)
    
    inline def setLastRunDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastRunDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastRunDateTimeNull: Self = StObject.set(x, "lastRunDateTime", null)
    
    inline def setLastRunDateTimeUndefined: Self = StObject.set(x, "lastRunDateTime", js.undefined)
  }
}
