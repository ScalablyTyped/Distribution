package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonVulnerabilities extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Vulnerabilities
}
object ApplicationjsonVulnerabilities {
  
  inline def apply(applicationSlashjson: Vulnerabilities): ApplicationjsonVulnerabilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonVulnerabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonVulnerabilities] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Vulnerabilities): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
