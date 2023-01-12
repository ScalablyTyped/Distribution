package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `540` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Labelsurl]
}
object `540` {
  
  inline def apply(applicationSlashjson: js.Array[Labelsurl]): `540` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`540`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `540`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Labelsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Labelsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
