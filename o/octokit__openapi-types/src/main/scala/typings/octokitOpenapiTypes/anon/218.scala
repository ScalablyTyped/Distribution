package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `218` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Allowmergecommit]
}
object `218` {
  
  inline def apply(applicationSlashjson: js.Array[Allowmergecommit]): `218` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`218`]
  }
  
  extension [Self <: `218`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Allowmergecommit]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Allowmergecommit*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
