package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSbom extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Sbom
}
object ApplicationjsonSbom {
  
  inline def apply(applicationSlashjson: Sbom): ApplicationjsonSbom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSbom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSbom] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Sbom): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
