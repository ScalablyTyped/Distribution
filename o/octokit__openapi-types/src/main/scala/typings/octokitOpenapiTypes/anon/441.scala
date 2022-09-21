package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `441` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Gitpullurl]
}
object `441` {
  
  inline def apply(applicationSlashjson: js.Array[Gitpullurl]): `441` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`441`]
  }
  
  extension [Self <: `441`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Gitpullurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Gitpullurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
