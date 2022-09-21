package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `522` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[CommitName]
}
object `522` {
  
  inline def apply(applicationSlashjson: js.Array[CommitName]): `522` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`522`]
  }
  
  extension [Self <: `522`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[CommitName]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: CommitName*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
