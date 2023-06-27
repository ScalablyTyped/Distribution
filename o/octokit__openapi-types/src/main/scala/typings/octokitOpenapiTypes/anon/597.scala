package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `597` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Invitationteamsurl]
}
object `597` {
  
  inline def apply(applicationSlashjson: js.Array[Invitationteamsurl]): `597` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`597`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `597`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Invitationteamsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Invitationteamsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
