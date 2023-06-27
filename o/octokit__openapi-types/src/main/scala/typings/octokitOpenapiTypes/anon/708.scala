package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `708` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Importurl]
}
object `708` {
  
  inline def apply(applicationSlashjson: js.Array[Importurl]): `708` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`708`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `708`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Importurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Importurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
