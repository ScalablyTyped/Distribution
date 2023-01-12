package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `415` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Pushprotectionbypassedat]
}
object `415` {
  
  inline def apply(applicationSlashjson: js.Array[Pushprotectionbypassedat]): `415` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`415`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `415`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Pushprotectionbypassedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Pushprotectionbypassedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
