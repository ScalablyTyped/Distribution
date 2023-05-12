package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `477` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodyHtmlurl]
}
object `477` {
  
  inline def apply(applicationSlashjson: js.Array[BodyHtmlurl]): `477` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`477`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `477`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[BodyHtmlurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodyHtmlurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
