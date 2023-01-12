package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `420` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodyCreatedat]
}
object `420` {
  
  inline def apply(applicationSlashjson: js.Array[BodyCreatedat]): `420` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`420`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `420`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[BodyCreatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodyCreatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
