package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Collectiondate]
}
object `12` {
  
  inline def apply(applicationSlashjson: js.Array[Collectiondate]): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Collectiondate]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Collectiondate*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
