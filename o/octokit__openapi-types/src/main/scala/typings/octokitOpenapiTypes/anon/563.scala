package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `563` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Resultscount]
}
object `563` {
  
  inline def apply(applicationSlashjson: js.Array[Resultscount]): `563` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`563`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `563`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Resultscount]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Resultscount*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
