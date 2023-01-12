package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLabels extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Labels
}
object ApplicationjsonLabels {
  
  inline def apply(applicationSlashjson: Labels): ApplicationjsonLabels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonLabels] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Labels): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
