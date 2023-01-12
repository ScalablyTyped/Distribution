package typings.pkijs.anon

import typings.pkijs.mod.OtherKeyAttributeSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Other extends StObject {
  
  var date: js.UndefOr[String] = js.undefined
  
  var other: js.UndefOr[OtherKeyAttributeSchema] = js.undefined
  
  var subjectKeyIdentifier: js.UndefOr[String] = js.undefined
}
object Other {
  
  inline def apply(): Other = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Other]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Other] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setOther(value: OtherKeyAttributeSchema): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setSubjectKeyIdentifier(value: String): Self = StObject.set(x, "subjectKeyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubjectKeyIdentifierUndefined: Self = StObject.set(x, "subjectKeyIdentifier", js.undefined)
  }
}
