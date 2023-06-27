package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `805` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Provider]
}
object `805` {
  
  inline def apply(applicationSlashjson: js.Array[Provider]): `805` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`805`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `805`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Provider]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Provider*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
