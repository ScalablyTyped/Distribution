package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRunnergroupsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RunnergroupsTotalcount
}
object ApplicationjsonRunnergroupsTotalcount {
  
  inline def apply(applicationSlashjson: RunnergroupsTotalcount): ApplicationjsonRunnergroupsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRunnergroupsTotalcount]
  }
  
  extension [Self <: ApplicationjsonRunnergroupsTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: RunnergroupsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
