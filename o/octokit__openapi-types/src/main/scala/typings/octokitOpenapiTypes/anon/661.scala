package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `661` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Externalurl]
}
object `661` {
  
  inline def apply(applicationSlashjson: js.Array[Externalurl]): `661` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`661`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `661`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Externalurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Externalurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
