package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `461` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Commentscount]
}
object `461` {
  
  inline def apply(applicationSlashjson: js.Array[Commentscount]): `461` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`461`]
  }
  
  extension [Self <: `461`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Commentscount]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Commentscount*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
