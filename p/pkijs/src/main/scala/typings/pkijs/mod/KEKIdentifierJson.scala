package typings.pkijs.mod

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KEKIdentifierJson extends StObject {
  
  var date: js.UndefOr[GeneralizedTime] = js.undefined
  
  var keyIdentifier: OctetStringJson
  
  var other: js.UndefOr[OtherKeyAttributeJson] = js.undefined
}
object KEKIdentifierJson {
  
  inline def apply(keyIdentifier: OctetStringJson): KEKIdentifierJson = {
    val __obj = js.Dynamic.literal(keyIdentifier = keyIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[KEKIdentifierJson]
  }
  
  extension [Self <: KEKIdentifierJson](x: Self) {
    
    inline def setDate(value: GeneralizedTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setKeyIdentifier(value: OctetStringJson): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setOther(value: OtherKeyAttributeJson): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
  }
}
