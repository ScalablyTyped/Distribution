package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `479` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Resolvedat]
}
object `479` {
  
  inline def apply(applicationSlashjson: js.Array[Resolvedat]): `479` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`479`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `479`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Resolvedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Resolvedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
