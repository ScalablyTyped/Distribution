package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `624` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Commentscount]
}
object `624` {
  
  inline def apply(applicationSlashjson: js.Array[Commentscount]): `624` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`624`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `624`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Commentscount]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Commentscount*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
