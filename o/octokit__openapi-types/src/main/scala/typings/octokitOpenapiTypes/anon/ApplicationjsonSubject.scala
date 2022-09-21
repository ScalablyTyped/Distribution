package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSubject extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Subject
}
object ApplicationjsonSubject {
  
  inline def apply(applicationSlashjson: Subject): ApplicationjsonSubject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSubject]
  }
  
  extension [Self <: ApplicationjsonSubject](x: Self) {
    
    inline def setApplicationSlashjson(value: Subject): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
