package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `565` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Inreplytoid]
}
object `565` {
  
  inline def apply(applicationSlashjson: js.Array[Inreplytoid]): `565` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`565`]
  }
  
  extension [Self <: `565`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Inreplytoid]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Inreplytoid*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
