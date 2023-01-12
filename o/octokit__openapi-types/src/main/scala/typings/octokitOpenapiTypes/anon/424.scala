package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `424` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Gitpullurl]
}
object `424` {
  
  inline def apply(applicationSlashjson: js.Array[Gitpullurl]): `424` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`424`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `424`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Gitpullurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Gitpullurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
