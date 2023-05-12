package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `630` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Avatarurl | StarredatUser]
}
object `630` {
  
  inline def apply(applicationSlashjson: js.Array[Avatarurl | StarredatUser]): `630` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`630`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `630`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Avatarurl | StarredatUser]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: (Avatarurl | StarredatUser)*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
