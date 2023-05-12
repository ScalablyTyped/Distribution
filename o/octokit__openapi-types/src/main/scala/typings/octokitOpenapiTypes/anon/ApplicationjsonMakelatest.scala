package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMakelatest extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Makelatest
}
object ApplicationjsonMakelatest {
  
  inline def apply(applicationSlashjson: Makelatest): ApplicationjsonMakelatest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMakelatest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonMakelatest] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Makelatest): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
