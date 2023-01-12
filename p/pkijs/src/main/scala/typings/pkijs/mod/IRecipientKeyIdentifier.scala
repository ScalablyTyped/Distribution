package typings.pkijs.mod

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecipientKeyIdentifier extends StObject {
  
  var date: js.UndefOr[GeneralizedTime] = js.undefined
  
  var other: js.UndefOr[OtherKeyAttribute] = js.undefined
  
  var subjectKeyIdentifier: OctetString
}
object IRecipientKeyIdentifier {
  
  inline def apply(subjectKeyIdentifier: OctetString): IRecipientKeyIdentifier = {
    val __obj = js.Dynamic.literal(subjectKeyIdentifier = subjectKeyIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecipientKeyIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRecipientKeyIdentifier] (val x: Self) extends AnyVal {
    
    inline def setDate(value: GeneralizedTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setOther(value: OtherKeyAttribute): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setSubjectKeyIdentifier(value: OctetString): Self = StObject.set(x, "subjectKeyIdentifier", value.asInstanceOf[js.Any])
  }
}
