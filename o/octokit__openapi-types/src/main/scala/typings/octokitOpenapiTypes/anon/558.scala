package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `558` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodyHtmlurl]
}
object `558` {
  
  inline def apply(applicationSlashjson: js.Array[BodyHtmlurl]): `558` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`558`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `558`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[BodyHtmlurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodyHtmlurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
