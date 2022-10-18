package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[CommentEnvironments]
}
object `81` {
  
  inline def apply(applicationSlashjson: js.Array[CommentEnvironments]): `81` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`81`]
  }
  
  extension [Self <: `81`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[CommentEnvironments]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: CommentEnvironments*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
