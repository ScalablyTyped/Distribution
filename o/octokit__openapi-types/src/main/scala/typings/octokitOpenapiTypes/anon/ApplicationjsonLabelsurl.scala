package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLabelsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Labelsurl
}
object ApplicationjsonLabelsurl {
  
  inline def apply(applicationSlashjson: Labelsurl): ApplicationjsonLabelsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLabelsurl]
  }
  
  extension [Self <: ApplicationjsonLabelsurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Labelsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
