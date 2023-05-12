package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `498` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Tokenlastusedat]
}
object `498` {
  
  inline def apply(applicationSlashjson: js.Array[Tokenlastusedat]): `498` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`498`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `498`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Tokenlastusedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Tokenlastusedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
