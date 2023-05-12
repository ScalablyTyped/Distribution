package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `511` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Invitationteamsurl]
}
object `511` {
  
  inline def apply(applicationSlashjson: js.Array[Invitationteamsurl]): `511` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`511`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `511`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Invitationteamsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Invitationteamsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
