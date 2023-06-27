package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEncodedjitconfig extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Encodedjitconfig
}
object ApplicationjsonEncodedjitconfig {
  
  inline def apply(applicationSlashjson: Encodedjitconfig): ApplicationjsonEncodedjitconfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEncodedjitconfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEncodedjitconfig] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Encodedjitconfig): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
