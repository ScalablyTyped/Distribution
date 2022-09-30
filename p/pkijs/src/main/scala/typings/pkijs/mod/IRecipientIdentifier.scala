package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecipientIdentifier extends StObject {
  
  var value: IssuerAndSerialNumber | OctetString
  
  var variant: Double
}
object IRecipientIdentifier {
  
  inline def apply(value: IssuerAndSerialNumber | OctetString, variant: Double): IRecipientIdentifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecipientIdentifier]
  }
  
  extension [Self <: IRecipientIdentifier](x: Self) {
    
    inline def setValue(value: IssuerAndSerialNumber | OctetString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
