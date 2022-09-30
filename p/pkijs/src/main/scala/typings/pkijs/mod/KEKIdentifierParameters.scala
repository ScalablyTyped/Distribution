package typings.pkijs.mod

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IKEKIdentifier> */
trait KEKIdentifierParameters extends StObject {
  
  var date: js.UndefOr[GeneralizedTime] = js.undefined
  
  var keyIdentifier: js.UndefOr[OctetString] = js.undefined
  
  var other: js.UndefOr[OtherKeyAttribute] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object KEKIdentifierParameters {
  
  inline def apply(): KEKIdentifierParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KEKIdentifierParameters]
  }
  
  extension [Self <: KEKIdentifierParameters](x: Self) {
    
    inline def setDate(value: GeneralizedTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setKeyIdentifier(value: OctetString): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setKeyIdentifierUndefined: Self = StObject.set(x, "keyIdentifier", js.undefined)
    
    inline def setOther(value: OtherKeyAttribute): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
