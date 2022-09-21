package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `423` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Contactemail]
}
object `423` {
  
  inline def apply(applicationSlashjson: js.Array[Contactemail]): `423` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`423`]
  }
  
  extension [Self <: `423`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Contactemail]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Contactemail*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
