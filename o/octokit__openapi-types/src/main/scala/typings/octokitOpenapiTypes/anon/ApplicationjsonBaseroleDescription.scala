package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBaseroleDescription extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BaseroleDescription
}
object ApplicationjsonBaseroleDescription {
  
  inline def apply(applicationSlashjson: BaseroleDescription): ApplicationjsonBaseroleDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBaseroleDescription]
  }
  
  extension [Self <: ApplicationjsonBaseroleDescription](x: Self) {
    
    inline def setApplicationSlashjson(value: BaseroleDescription): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
