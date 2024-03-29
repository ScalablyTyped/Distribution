package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNameNodeid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NameNodeid
}
object ApplicationjsonNameNodeid {
  
  inline def apply(applicationSlashjson: NameNodeid): ApplicationjsonNameNodeid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNameNodeid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonNameNodeid] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: NameNodeid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
