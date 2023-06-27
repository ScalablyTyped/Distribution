package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `747` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Mentionscount]
}
object `747` {
  
  inline def apply(applicationSlashjson: js.Array[Mentionscount]): `747` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`747`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `747`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Mentionscount]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Mentionscount*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
