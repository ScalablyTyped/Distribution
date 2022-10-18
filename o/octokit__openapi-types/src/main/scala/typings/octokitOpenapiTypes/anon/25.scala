package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[ChangestatusCommittedat]
}
object `25` {
  
  inline def apply(applicationSlashjson: js.Array[ChangestatusCommittedat]): `25` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[ChangestatusCommittedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: ChangestatusCommittedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
