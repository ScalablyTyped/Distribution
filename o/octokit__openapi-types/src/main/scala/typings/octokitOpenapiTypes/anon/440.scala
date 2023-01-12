package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `440` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Avatarurl]
}
object `440` {
  
  inline def apply(applicationSlashjson: js.Array[Avatarurl]): `440` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`440`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `440`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Avatarurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Avatarurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
