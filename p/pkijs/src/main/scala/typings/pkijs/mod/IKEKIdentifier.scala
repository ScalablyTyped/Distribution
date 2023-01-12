package typings.pkijs.mod

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKEKIdentifier extends StObject {
  
  var date: js.UndefOr[GeneralizedTime] = js.undefined
  
  var keyIdentifier: OctetString
  
  var other: js.UndefOr[OtherKeyAttribute] = js.undefined
}
object IKEKIdentifier {
  
  inline def apply(keyIdentifier: OctetString): IKEKIdentifier = {
    val __obj = js.Dynamic.literal(keyIdentifier = keyIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKEKIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKEKIdentifier] (val x: Self) extends AnyVal {
    
    inline def setDate(value: GeneralizedTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setKeyIdentifier(value: OctetString): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setOther(value: OtherKeyAttribute): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
  }
}
