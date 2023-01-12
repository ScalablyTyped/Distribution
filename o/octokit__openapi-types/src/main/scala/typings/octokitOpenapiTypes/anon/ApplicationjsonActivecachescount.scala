package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonActivecachescount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Activecachescount
}
object ApplicationjsonActivecachescount {
  
  inline def apply(applicationSlashjson: Activecachescount): ApplicationjsonActivecachescount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonActivecachescount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonActivecachescount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Activecachescount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
