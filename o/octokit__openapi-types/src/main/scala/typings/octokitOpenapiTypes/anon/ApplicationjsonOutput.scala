package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOutput extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Output
}
object ApplicationjsonOutput {
  
  inline def apply(applicationSlashjson: Output): ApplicationjsonOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonOutput] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Output): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
