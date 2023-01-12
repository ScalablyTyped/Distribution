package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRevokedCertificate> */
trait RevokedCertificateParameters extends StObject {
  
  var crlEntryExtensions: js.UndefOr[Extensions] = js.undefined
  
  var revocationDate: js.UndefOr[Time] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var userCertificate: js.UndefOr[Integer] = js.undefined
}
object RevokedCertificateParameters {
  
  inline def apply(): RevokedCertificateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokedCertificateParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevokedCertificateParameters] (val x: Self) extends AnyVal {
    
    inline def setCrlEntryExtensions(value: Extensions): Self = StObject.set(x, "crlEntryExtensions", value.asInstanceOf[js.Any])
    
    inline def setCrlEntryExtensionsUndefined: Self = StObject.set(x, "crlEntryExtensions", js.undefined)
    
    inline def setRevocationDate(value: Time): Self = StObject.set(x, "revocationDate", value.asInstanceOf[js.Any])
    
    inline def setRevocationDateUndefined: Self = StObject.set(x, "revocationDate", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setUserCertificate(value: Integer): Self = StObject.set(x, "userCertificate", value.asInstanceOf[js.Any])
    
    inline def setUserCertificateUndefined: Self = StObject.set(x, "userCertificate", js.undefined)
  }
}
