package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreator extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Creator
}
object ApplicationjsonCreator {
  
  inline def apply(applicationSlashjson: Creator): ApplicationjsonCreator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreator]
  }
  
  extension [Self <: ApplicationjsonCreator](x: Self) {
    
    inline def setApplicationSlashjson(value: Creator): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
