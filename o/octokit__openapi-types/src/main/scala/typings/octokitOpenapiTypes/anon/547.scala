package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `547` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CommentEnvironmentname | EnvironmentnameState
}
object `547` {
  
  inline def apply(applicationSlashjson: CommentEnvironmentname | EnvironmentnameState): `547` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`547`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `547`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CommentEnvironmentname | EnvironmentnameState): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
