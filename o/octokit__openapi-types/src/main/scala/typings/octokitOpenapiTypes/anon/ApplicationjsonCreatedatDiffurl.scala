package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreatedatDiffurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CreatedatDiffurl
}
object ApplicationjsonCreatedatDiffurl {
  
  inline def apply(applicationSlashjson: CreatedatDiffurl): ApplicationjsonCreatedatDiffurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreatedatDiffurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCreatedatDiffurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CreatedatDiffurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
