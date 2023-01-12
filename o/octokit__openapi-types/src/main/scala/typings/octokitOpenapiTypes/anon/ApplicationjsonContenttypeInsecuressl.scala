package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContenttypeInsecuressl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ContenttypeInsecuressl
}
object ApplicationjsonContenttypeInsecuressl {
  
  inline def apply(applicationSlashjson: ContenttypeInsecuressl): ApplicationjsonContenttypeInsecuressl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContenttypeInsecuressl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonContenttypeInsecuressl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ContenttypeInsecuressl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
