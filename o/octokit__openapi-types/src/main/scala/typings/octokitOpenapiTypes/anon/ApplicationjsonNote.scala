package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNote extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Note
}
object ApplicationjsonNote {
  
  inline def apply(applicationSlashjson: Note): ApplicationjsonNote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNote]
  }
  
  extension [Self <: ApplicationjsonNote](x: Self) {
    
    inline def setApplicationSlashjson(value: Note): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
