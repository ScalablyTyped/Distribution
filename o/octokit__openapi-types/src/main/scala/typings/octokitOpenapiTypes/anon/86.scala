package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Reviewers]
}
object `86` {
  
  inline def apply(applicationSlashjson: js.Array[Reviewers]): `86` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`86`]
  }
  
  extension [Self <: `86`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Reviewers]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Reviewers*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
