package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSelectedusernames extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Selectedusernames
}
object ApplicationjsonSelectedusernames {
  
  inline def apply(applicationSlashjson: Selectedusernames): ApplicationjsonSelectedusernames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSelectedusernames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSelectedusernames] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Selectedusernames): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
