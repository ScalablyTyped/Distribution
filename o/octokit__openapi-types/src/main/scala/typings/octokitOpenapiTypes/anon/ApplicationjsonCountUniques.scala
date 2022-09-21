package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCountUniques extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CountUniques
}
object ApplicationjsonCountUniques {
  
  inline def apply(applicationSlashjson: CountUniques): ApplicationjsonCountUniques = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCountUniques]
  }
  
  extension [Self <: ApplicationjsonCountUniques](x: Self) {
    
    inline def setApplicationSlashjson(value: CountUniques): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
