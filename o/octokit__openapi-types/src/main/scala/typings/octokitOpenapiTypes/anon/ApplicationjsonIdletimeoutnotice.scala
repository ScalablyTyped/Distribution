package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIdletimeoutnotice extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Idletimeoutnotice
}
object ApplicationjsonIdletimeoutnotice {
  
  inline def apply(applicationSlashjson: Idletimeoutnotice): ApplicationjsonIdletimeoutnotice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIdletimeoutnotice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonIdletimeoutnotice] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Idletimeoutnotice): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
