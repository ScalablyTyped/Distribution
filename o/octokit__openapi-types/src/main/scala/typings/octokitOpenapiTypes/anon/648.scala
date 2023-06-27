package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `648` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CommentEnvironmentname | EnvironmentnameState
}
object `648` {
  
  inline def apply(applicationSlashjson: CommentEnvironmentname | EnvironmentnameState): `648` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`648`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `648`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CommentEnvironmentname | EnvironmentnameState): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
