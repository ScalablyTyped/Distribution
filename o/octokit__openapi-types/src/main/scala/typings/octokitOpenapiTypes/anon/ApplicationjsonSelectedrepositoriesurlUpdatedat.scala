package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSelectedrepositoriesurlUpdatedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: SelectedrepositoriesurlUpdatedat
}
object ApplicationjsonSelectedrepositoriesurlUpdatedat {
  
  inline def apply(applicationSlashjson: SelectedrepositoriesurlUpdatedat): ApplicationjsonSelectedrepositoriesurlUpdatedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSelectedrepositoriesurlUpdatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSelectedrepositoriesurlUpdatedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: SelectedrepositoriesurlUpdatedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
