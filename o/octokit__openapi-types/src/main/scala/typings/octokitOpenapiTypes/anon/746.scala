package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `746` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Pullrequestreviewid]
}
object `746` {
  
  inline def apply(applicationSlashjson: js.Array[Pullrequestreviewid]): `746` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`746`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `746`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Pullrequestreviewid]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Pullrequestreviewid*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
