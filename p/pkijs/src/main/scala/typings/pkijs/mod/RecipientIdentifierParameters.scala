package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRecipientIdentifier> */
trait RecipientIdentifierParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var value: js.UndefOr[IssuerAndSerialNumber | OctetString] = js.undefined
  
  var variant: js.UndefOr[Double] = js.undefined
}
object RecipientIdentifierParameters {
  
  inline def apply(): RecipientIdentifierParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentifierParameters]
  }
  
  extension [Self <: RecipientIdentifierParameters](x: Self) {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setValue(value: IssuerAndSerialNumber | OctetString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
