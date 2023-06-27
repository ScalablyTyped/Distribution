package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `762` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Avatarurl | StarredatUser]
}
object `762` {
  
  inline def apply(applicationSlashjson: js.Array[Avatarurl | StarredatUser]): `762` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`762`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `762`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Avatarurl | StarredatUser]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: (Avatarurl | StarredatUser)*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
