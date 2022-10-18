package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLastreadatRead extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: LastreadatRead
}
object ApplicationjsonLastreadatRead {
  
  inline def apply(applicationSlashjson: LastreadatRead): ApplicationjsonLastreadatRead = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLastreadatRead]
  }
  
  extension [Self <: ApplicationjsonLastreadatRead](x: Self) {
    
    inline def setApplicationSlashjson(value: LastreadatRead): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
