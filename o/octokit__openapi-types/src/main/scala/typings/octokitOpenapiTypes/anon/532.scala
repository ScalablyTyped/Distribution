package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `532` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[DescriptionId]
}
object `532` {
  
  inline def apply(applicationSlashjson: js.Array[DescriptionId]): `532` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`532`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `532`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[DescriptionId]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: DescriptionId*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
