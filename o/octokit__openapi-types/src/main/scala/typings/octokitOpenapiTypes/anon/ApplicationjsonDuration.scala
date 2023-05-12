package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDuration extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Duration
}
object ApplicationjsonDuration {
  
  inline def apply(applicationSlashjson: Duration): ApplicationjsonDuration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDuration] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Duration): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
