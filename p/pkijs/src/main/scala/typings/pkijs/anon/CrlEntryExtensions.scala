package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrlEntryExtensions extends StObject {
  
  var crlEntryExtensions: js.UndefOr[String] = js.undefined
  
  var revocationDate: js.UndefOr[String] = js.undefined
  
  var userCertificate: js.UndefOr[String] = js.undefined
}
object CrlEntryExtensions {
  
  inline def apply(): CrlEntryExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrlEntryExtensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrlEntryExtensions] (val x: Self) extends AnyVal {
    
    inline def setCrlEntryExtensions(value: String): Self = StObject.set(x, "crlEntryExtensions", value.asInstanceOf[js.Any])
    
    inline def setCrlEntryExtensionsUndefined: Self = StObject.set(x, "crlEntryExtensions", js.undefined)
    
    inline def setRevocationDate(value: String): Self = StObject.set(x, "revocationDate", value.asInstanceOf[js.Any])
    
    inline def setRevocationDateUndefined: Self = StObject.set(x, "revocationDate", js.undefined)
    
    inline def setUserCertificate(value: String): Self = StObject.set(x, "userCertificate", value.asInstanceOf[js.Any])
    
    inline def setUserCertificateUndefined: Self = StObject.set(x, "userCertificate", js.undefined)
  }
}
