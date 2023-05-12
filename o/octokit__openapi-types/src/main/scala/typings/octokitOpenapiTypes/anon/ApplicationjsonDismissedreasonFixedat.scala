package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDismissedreasonFixedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DismissedreasonFixedat
}
object ApplicationjsonDismissedreasonFixedat {
  
  inline def apply(applicationSlashjson: DismissedreasonFixedat): ApplicationjsonDismissedreasonFixedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDismissedreasonFixedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDismissedreasonFixedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: DismissedreasonFixedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
