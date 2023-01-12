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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSubject] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Subject): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
