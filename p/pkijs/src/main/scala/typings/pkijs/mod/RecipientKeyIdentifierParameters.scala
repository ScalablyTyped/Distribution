package typings.pkijs.mod

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRecipientKeyIdentifier> */
trait RecipientKeyIdentifierParameters extends StObject {
  
  var date: js.UndefOr[GeneralizedTime] = js.undefined
  
  var other: js.UndefOr[OtherKeyAttribute] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var subjectKeyIdentifier: js.UndefOr[OctetString] = js.undefined
}
object RecipientKeyIdentifierParameters {
  
  inline def apply(): RecipientKeyIdentifierParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientKeyIdentifierParameters]
  }
  
  extension [Self <: RecipientKeyIdentifierParameters](x: Self) {
    
    inline def setDate(value: GeneralizedTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setOther(value: OtherKeyAttribute): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSubjectKeyIdentifier(value: OctetString): Self = StObject.set(x, "subjectKeyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubjectKeyIdentifierUndefined: Self = StObject.set(x, "subjectKeyIdentifier", js.undefined)
  }
}
