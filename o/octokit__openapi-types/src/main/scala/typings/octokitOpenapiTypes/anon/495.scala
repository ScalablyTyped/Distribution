package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `495` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Uploader]
}
object `495` {
  
  inline def apply(applicationSlashjson: js.Array[Uploader]): `495` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`495`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `495`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Uploader]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Uploader*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
