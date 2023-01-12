package typings.pkijs.mod

import typings.asn1js.mod.BaseBlockJson
import typings.asn1js.mod.LocalBaseBlockJson
import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientKeyIdentifierJson extends StObject {
  
  var date: js.UndefOr[BaseBlockJson[LocalBaseBlockJson]] = js.undefined
  
  var other: js.UndefOr[OtherKeyAttributeJson] = js.undefined
  
  var subjectKeyIdentifier: OctetStringJson
}
object RecipientKeyIdentifierJson {
  
  inline def apply(subjectKeyIdentifier: OctetStringJson): RecipientKeyIdentifierJson = {
    val __obj = js.Dynamic.literal(subjectKeyIdentifier = subjectKeyIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientKeyIdentifierJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientKeyIdentifierJson] (val x: Self) extends AnyVal {
    
    inline def setDate(value: BaseBlockJson[LocalBaseBlockJson]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setOther(value: OtherKeyAttributeJson): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setSubjectKeyIdentifier(value: OctetStringJson): Self = StObject.set(x, "subjectKeyIdentifier", value.asInstanceOf[js.Any])
  }
}
