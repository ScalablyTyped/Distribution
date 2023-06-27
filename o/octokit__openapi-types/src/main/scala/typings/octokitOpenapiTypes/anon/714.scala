package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `714` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Bodytext]
}
object `714` {
  
  inline def apply(applicationSlashjson: js.Array[Bodytext]): `714` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`714`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `714`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Bodytext]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Bodytext*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
