package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyAgreeRecipientIdentifierJson extends StObject {
  
  var value: js.UndefOr[IssuerAndSerialNumberJson | RecipientKeyIdentifierJson] = js.undefined
  
  var variant: Double
}
object KeyAgreeRecipientIdentifierJson {
  
  inline def apply(variant: Double): KeyAgreeRecipientIdentifierJson = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAgreeRecipientIdentifierJson]
  }
  
  extension [Self <: KeyAgreeRecipientIdentifierJson](x: Self) {
    
    inline def setValue(value: IssuerAndSerialNumberJson | RecipientKeyIdentifierJson): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
