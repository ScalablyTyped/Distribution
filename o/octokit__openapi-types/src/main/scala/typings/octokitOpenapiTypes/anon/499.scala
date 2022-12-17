package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `499` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[AuthorCommentsurl]
}
object `499` {
  
  inline def apply(applicationSlashjson: js.Array[AuthorCommentsurl]): `499` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`499`]
  }
  
  extension [Self <: `499`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[AuthorCommentsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: AuthorCommentsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
