package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `467` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Branchesurl]
}
object `467` {
  
  inline def apply(applicationSlashjson: js.Array[Branchesurl]): `467` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`467`]
  }
  
  extension [Self <: `467`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Branchesurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Branchesurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
