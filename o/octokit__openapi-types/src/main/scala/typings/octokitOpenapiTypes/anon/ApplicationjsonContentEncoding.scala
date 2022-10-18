package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContentEncoding extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ContentEncoding
}
object ApplicationjsonContentEncoding {
  
  inline def apply(applicationSlashjson: ContentEncoding): ApplicationjsonContentEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContentEncoding]
  }
  
  extension [Self <: ApplicationjsonContentEncoding](x: Self) {
    
    inline def setApplicationSlashjson(value: ContentEncoding): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
