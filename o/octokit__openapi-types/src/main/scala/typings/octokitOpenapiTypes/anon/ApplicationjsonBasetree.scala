package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBasetree extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Basetree
}
object ApplicationjsonBasetree {
  
  inline def apply(applicationSlashjson: Basetree): ApplicationjsonBasetree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBasetree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBasetree] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Basetree): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
