package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotAfter extends StObject {
  
  var notAfter: js.UndefOr[String] = js.undefined
  
  var notBefore: js.UndefOr[String] = js.undefined
}
object NotAfter {
  
  inline def apply(): NotAfter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotAfter]
  }
  
  extension [Self <: NotAfter](x: Self) {
    
    inline def setNotAfter(value: String): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    inline def setNotBefore(value: String): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
  }
}
