package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTitle extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Title
}
object ApplicationjsonTitle {
  
  inline def apply(applicationSlashjson: Title): ApplicationjsonTitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonTitle] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Title): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
