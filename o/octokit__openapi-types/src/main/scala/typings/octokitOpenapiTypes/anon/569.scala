package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `569` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodytextCommitid]
}
object `569` {
  
  inline def apply(applicationSlashjson: js.Array[BodytextCommitid]): `569` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`569`]
  }
  
  extension [Self <: `569`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[BodytextCommitid]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodytextCommitid*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
