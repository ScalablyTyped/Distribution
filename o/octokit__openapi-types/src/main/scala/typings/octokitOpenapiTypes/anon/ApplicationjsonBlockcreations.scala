package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBlockcreations extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Blockcreations
}
object ApplicationjsonBlockcreations {
  
  inline def apply(applicationSlashjson: Blockcreations): ApplicationjsonBlockcreations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBlockcreations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBlockcreations] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Blockcreations): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
