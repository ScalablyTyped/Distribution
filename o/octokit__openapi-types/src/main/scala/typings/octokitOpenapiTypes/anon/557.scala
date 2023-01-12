package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `557` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[DetailsType]
}
object `557` {
  
  inline def apply(applicationSlashjson: js.Array[DetailsType]): `557` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`557`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `557`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[DetailsType]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: DetailsType*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
