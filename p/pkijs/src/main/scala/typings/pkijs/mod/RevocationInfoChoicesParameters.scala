package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRevocationInfoChoices> */
trait RevocationInfoChoicesParameters extends StObject {
  
  var crls: js.UndefOr[js.Array[CertificateRevocationList]] = js.undefined
  
  var otherRevocationInfos: js.UndefOr[js.Array[OtherRevocationInfoFormat]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object RevocationInfoChoicesParameters {
  
  inline def apply(): RevocationInfoChoicesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevocationInfoChoicesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevocationInfoChoicesParameters] (val x: Self) extends AnyVal {
    
    inline def setCrls(value: js.Array[CertificateRevocationList]): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
    
    inline def setCrlsVarargs(value: CertificateRevocationList*): Self = StObject.set(x, "crls", js.Array(value*))
    
    inline def setOtherRevocationInfos(value: js.Array[OtherRevocationInfoFormat]): Self = StObject.set(x, "otherRevocationInfos", value.asInstanceOf[js.Any])
    
    inline def setOtherRevocationInfosUndefined: Self = StObject.set(x, "otherRevocationInfos", js.undefined)
    
    inline def setOtherRevocationInfosVarargs(value: OtherRevocationInfoFormat*): Self = StObject.set(x, "otherRevocationInfos", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
