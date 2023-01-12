package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRevokedCertificate extends StObject {
  
  var crlEntryExtensions: js.UndefOr[Extensions] = js.undefined
  
  var revocationDate: Time
  
  var userCertificate: Integer
}
object IRevokedCertificate {
  
  inline def apply(revocationDate: Time, userCertificate: Integer): IRevokedCertificate = {
    val __obj = js.Dynamic.literal(revocationDate = revocationDate.asInstanceOf[js.Any], userCertificate = userCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRevokedCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRevokedCertificate] (val x: Self) extends AnyVal {
    
    inline def setCrlEntryExtensions(value: Extensions): Self = StObject.set(x, "crlEntryExtensions", value.asInstanceOf[js.Any])
    
    inline def setCrlEntryExtensionsUndefined: Self = StObject.set(x, "crlEntryExtensions", js.undefined)
    
    inline def setRevocationDate(value: Time): Self = StObject.set(x, "revocationDate", value.asInstanceOf[js.Any])
    
    inline def setUserCertificate(value: Integer): Self = StObject.set(x, "userCertificate", value.asInstanceOf[js.Any])
  }
}
