package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDeletebranchonmerge extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Deletebranchonmerge
}
object ApplicationjsonDeletebranchonmerge {
  
  inline def apply(applicationSlashjson: Deletebranchonmerge): ApplicationjsonDeletebranchonmerge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDeletebranchonmerge]
  }
  
  extension [Self <: ApplicationjsonDeletebranchonmerge](x: Self) {
    
    inline def setApplicationSlashjson(value: Deletebranchonmerge): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
