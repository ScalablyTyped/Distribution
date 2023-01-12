package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDeletedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Deletedat
}
object ApplicationjsonDeletedat {
  
  inline def apply(applicationSlashjson: Deletedat): ApplicationjsonDeletedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDeletedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDeletedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Deletedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
