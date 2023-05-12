package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `613` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Inreplytoid]
}
object `613` {
  
  inline def apply(applicationSlashjson: js.Array[Inreplytoid]): `613` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`613`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `613`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Inreplytoid]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Inreplytoid*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
