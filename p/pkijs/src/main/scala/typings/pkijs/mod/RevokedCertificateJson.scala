package typings.pkijs.mod

import typings.asn1js.mod.IntegerJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokedCertificateJson extends StObject {
  
  var crlEntryExtensions: js.UndefOr[ExtensionsJson] = js.undefined
  
  var revocationDate: TimeJson
  
  var userCertificate: IntegerJson
}
object RevokedCertificateJson {
  
  inline def apply(revocationDate: TimeJson, userCertificate: IntegerJson): RevokedCertificateJson = {
    val __obj = js.Dynamic.literal(revocationDate = revocationDate.asInstanceOf[js.Any], userCertificate = userCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokedCertificateJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevokedCertificateJson] (val x: Self) extends AnyVal {
    
    inline def setCrlEntryExtensions(value: ExtensionsJson): Self = StObject.set(x, "crlEntryExtensions", value.asInstanceOf[js.Any])
    
    inline def setCrlEntryExtensionsUndefined: Self = StObject.set(x, "crlEntryExtensions", js.undefined)
    
    inline def setRevocationDate(value: TimeJson): Self = StObject.set(x, "revocationDate", value.asInstanceOf[js.Any])
    
    inline def setUserCertificate(value: IntegerJson): Self = StObject.set(x, "userCertificate", value.asInstanceOf[js.Any])
  }
}
