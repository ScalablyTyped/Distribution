package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IOriginatorInfo> */
trait OriginatorInfoParameters extends StObject {
  
  var certs: js.UndefOr[CertificateSet] = js.undefined
  
  var crls: js.UndefOr[RevocationInfoChoices] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object OriginatorInfoParameters {
  
  inline def apply(): OriginatorInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginatorInfoParameters]
  }
  
  extension [Self <: OriginatorInfoParameters](x: Self) {
    
    inline def setCerts(value: CertificateSet): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCrls(value: RevocationInfoChoices): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
