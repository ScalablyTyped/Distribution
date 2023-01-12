package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificationControl extends StObject {
  
  // Certification control name
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URL for the Microsoft Service Trust Portal
  var url: js.UndefOr[NullableOption[String]] = js.undefined
}
object CertificationControl {
  
  inline def apply(): CertificationControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificationControl] (val x: Self) extends AnyVal {
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
