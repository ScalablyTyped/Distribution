package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDismissedcomment extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Dismissedcomment
}
object ApplicationjsonDismissedcomment {
  
  inline def apply(applicationSlashjson: Dismissedcomment): ApplicationjsonDismissedcomment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDismissedcomment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDismissedcomment] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Dismissedcomment): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
