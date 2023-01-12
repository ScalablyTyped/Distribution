package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonForks extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Forks
}
object ApplicationjsonForks {
  
  inline def apply(applicationSlashjson: Forks): ApplicationjsonForks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonForks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonForks] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Forks): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
