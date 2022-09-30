package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientIdentifierJson extends StObject {
  
  var value: js.UndefOr[IssuerAndSerialNumberJson | OctetStringJson] = js.undefined
  
  var variant: Double
}
object RecipientIdentifierJson {
  
  inline def apply(variant: Double): RecipientIdentifierJson = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientIdentifierJson]
  }
  
  extension [Self <: RecipientIdentifierJson](x: Self) {
    
    inline def setValue(value: IssuerAndSerialNumberJson | OctetStringJson): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
