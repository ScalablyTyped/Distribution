package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMergecommitsha extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Mergecommitsha
}
object ApplicationjsonMergecommitsha {
  
  inline def apply(applicationSlashjson: Mergecommitsha): ApplicationjsonMergecommitsha = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMergecommitsha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonMergecommitsha] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Mergecommitsha): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
