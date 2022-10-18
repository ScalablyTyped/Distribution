package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Homephone extends StObject {
  
  var home_phone: js.UndefOr[String] = js.undefined
  
  var mobile_phone: js.UndefOr[String] = js.undefined
}
object Homephone {
  
  inline def apply(): Homephone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Homephone]
  }
  
  extension [Self <: Homephone](x: Self) {
    
    inline def setHome_phone(value: String): Self = StObject.set(x, "home_phone", value.asInstanceOf[js.Any])
    
    inline def setHome_phoneUndefined: Self = StObject.set(x, "home_phone", js.undefined)
    
    inline def setMobile_phone(value: String): Self = StObject.set(x, "mobile_phone", value.asInstanceOf[js.Any])
    
    inline def setMobile_phoneUndefined: Self = StObject.set(x, "mobile_phone", js.undefined)
  }
}
