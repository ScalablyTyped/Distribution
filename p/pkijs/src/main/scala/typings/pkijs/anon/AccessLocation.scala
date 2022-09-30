package typings.pkijs.anon

import typings.pkijs.mod.GeneralNameSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessLocation extends StObject {
  
  var accessLocation: js.UndefOr[GeneralNameSchema] = js.undefined
  
  var accessMethod: js.UndefOr[String] = js.undefined
}
object AccessLocation {
  
  inline def apply(): AccessLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLocation]
  }
  
  extension [Self <: AccessLocation](x: Self) {
    
    inline def setAccessLocation(value: GeneralNameSchema): Self = StObject.set(x, "accessLocation", value.asInstanceOf[js.Any])
    
    inline def setAccessLocationUndefined: Self = StObject.set(x, "accessLocation", js.undefined)
    
    inline def setAccessMethod(value: String): Self = StObject.set(x, "accessMethod", value.asInstanceOf[js.Any])
    
    inline def setAccessMethodUndefined: Self = StObject.set(x, "accessMethod", js.undefined)
  }
}
