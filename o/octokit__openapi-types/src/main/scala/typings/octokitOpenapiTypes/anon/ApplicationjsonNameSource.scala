package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNameSource extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NameSource
}
object ApplicationjsonNameSource {
  
  inline def apply(applicationSlashjson: NameSource): ApplicationjsonNameSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNameSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonNameSource] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: NameSource): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
