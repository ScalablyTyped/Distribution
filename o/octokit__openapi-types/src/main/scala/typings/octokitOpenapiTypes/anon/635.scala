package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `635` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Tarballurl]
}
object `635` {
  
  inline def apply(applicationSlashjson: js.Array[Tarballurl]): `635` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`635`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `635`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Tarballurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Tarballurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
