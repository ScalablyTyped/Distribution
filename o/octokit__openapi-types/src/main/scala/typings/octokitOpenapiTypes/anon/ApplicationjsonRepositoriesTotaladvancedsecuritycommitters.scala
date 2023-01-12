package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoriesTotaladvancedsecuritycommitters extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RepositoriesTotaladvancedsecuritycommitters
}
object ApplicationjsonRepositoriesTotaladvancedsecuritycommitters {
  
  inline def apply(applicationSlashjson: RepositoriesTotaladvancedsecuritycommitters): ApplicationjsonRepositoriesTotaladvancedsecuritycommitters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoriesTotaladvancedsecuritycommitters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRepositoriesTotaladvancedsecuritycommitters] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: RepositoriesTotaladvancedsecuritycommitters): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
