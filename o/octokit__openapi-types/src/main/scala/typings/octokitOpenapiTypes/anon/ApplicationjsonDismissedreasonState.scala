package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDismissedreasonState extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DismissedreasonState
}
object ApplicationjsonDismissedreasonState {
  
  inline def apply(applicationSlashjson: DismissedreasonState): ApplicationjsonDismissedreasonState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDismissedreasonState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDismissedreasonState] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: DismissedreasonState): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
