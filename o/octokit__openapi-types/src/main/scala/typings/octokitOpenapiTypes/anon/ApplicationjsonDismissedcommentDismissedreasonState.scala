package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDismissedcommentDismissedreasonState extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DismissedcommentDismissedreasonState
}
object ApplicationjsonDismissedcommentDismissedreasonState {
  
  inline def apply(applicationSlashjson: DismissedcommentDismissedreasonState): ApplicationjsonDismissedcommentDismissedreasonState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDismissedcommentDismissedreasonState]
  }
  
  extension [Self <: ApplicationjsonDismissedcommentDismissedreasonState](x: Self) {
    
    inline def setApplicationSlashjson(value: DismissedcommentDismissedreasonState): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
