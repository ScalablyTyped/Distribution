package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCustomrolesTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CustomrolesTotalcount
}
object ApplicationjsonCustomrolesTotalcount {
  
  inline def apply(applicationSlashjson: CustomrolesTotalcount): ApplicationjsonCustomrolesTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCustomrolesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCustomrolesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CustomrolesTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
