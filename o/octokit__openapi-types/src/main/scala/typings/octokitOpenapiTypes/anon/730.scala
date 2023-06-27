package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `730` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Closedissues]
}
object `730` {
  
  inline def apply(applicationSlashjson: js.Array[Closedissues]): `730` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`730`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `730`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Closedissues]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Closedissues*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
