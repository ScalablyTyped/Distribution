package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `406` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Collectiondate]
}
object `406` {
  
  inline def apply(applicationSlashjson: js.Array[Collectiondate]): `406` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`406`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `406`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Collectiondate]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Collectiondate*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
