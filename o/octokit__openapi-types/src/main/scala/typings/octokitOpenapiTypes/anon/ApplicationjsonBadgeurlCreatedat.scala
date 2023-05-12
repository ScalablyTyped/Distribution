package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBadgeurlCreatedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BadgeurlCreatedat
}
object ApplicationjsonBadgeurlCreatedat {
  
  inline def apply(applicationSlashjson: BadgeurlCreatedat): ApplicationjsonBadgeurlCreatedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBadgeurlCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBadgeurlCreatedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: BadgeurlCreatedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
