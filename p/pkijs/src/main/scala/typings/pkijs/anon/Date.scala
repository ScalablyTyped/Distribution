package typings.pkijs.anon

import typings.pkijs.mod.OtherKeyAttributeSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var date: js.UndefOr[String] = js.undefined
  
  var keyIdentifier: js.UndefOr[String] = js.undefined
  
  var other: js.UndefOr[OtherKeyAttributeSchema] = js.undefined
}
object Date {
  
  inline def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setKeyIdentifier(value: String): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setKeyIdentifierUndefined: Self = StObject.set(x, "keyIdentifier", js.undefined)
    
    inline def setOther(value: OtherKeyAttributeSchema): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
  }
}
