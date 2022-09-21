package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `425` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Collectiondate]
}
object `425` {
  
  inline def apply(applicationSlashjson: js.Array[Collectiondate]): `425` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`425`]
  }
  
  extension [Self <: `425`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Collectiondate]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Collectiondate*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
