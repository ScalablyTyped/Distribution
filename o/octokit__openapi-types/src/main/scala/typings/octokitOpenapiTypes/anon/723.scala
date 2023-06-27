package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `723` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Addedby]
}
object `723` {
  
  inline def apply(applicationSlashjson: js.Array[Addedby]): `723` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`723`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `723`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Addedby]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Addedby*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
