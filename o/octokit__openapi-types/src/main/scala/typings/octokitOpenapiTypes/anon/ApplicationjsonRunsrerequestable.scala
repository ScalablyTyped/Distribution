package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRunsrerequestable extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Runsrerequestable
}
object ApplicationjsonRunsrerequestable {
  
  inline def apply(applicationSlashjson: Runsrerequestable): ApplicationjsonRunsrerequestable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRunsrerequestable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRunsrerequestable] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Runsrerequestable): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
