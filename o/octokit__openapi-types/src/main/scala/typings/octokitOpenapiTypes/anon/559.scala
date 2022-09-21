package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `559` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Labelsurl]
}
object `559` {
  
  inline def apply(applicationSlashjson: js.Array[Labelsurl]): `559` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`559`]
  }
  
  extension [Self <: `559`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Labelsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Labelsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
