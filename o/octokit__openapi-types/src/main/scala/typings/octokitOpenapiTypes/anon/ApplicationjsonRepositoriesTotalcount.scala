package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoriesTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RepositoriesTotalcount
}
object ApplicationjsonRepositoriesTotalcount {
  
  inline def apply(applicationSlashjson: RepositoriesTotalcount): ApplicationjsonRepositoriesTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoriesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRepositoriesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: RepositoriesTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
