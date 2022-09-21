package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonChecksuitesTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ChecksuitesTotalcount
}
object ApplicationjsonChecksuitesTotalcount {
  
  inline def apply(applicationSlashjson: ChecksuitesTotalcount): ApplicationjsonChecksuitesTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonChecksuitesTotalcount]
  }
  
  extension [Self <: ApplicationjsonChecksuitesTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: ChecksuitesTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
