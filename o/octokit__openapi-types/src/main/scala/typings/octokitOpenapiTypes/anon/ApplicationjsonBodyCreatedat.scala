package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyCreatedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyCreatedat
}
object ApplicationjsonBodyCreatedat {
  
  inline def apply(applicationSlashjson: BodyCreatedat): ApplicationjsonBodyCreatedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBodyCreatedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: BodyCreatedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
