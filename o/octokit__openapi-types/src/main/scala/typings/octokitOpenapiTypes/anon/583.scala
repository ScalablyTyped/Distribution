package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `583` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Branchesurl]
}
object `583` {
  
  inline def apply(applicationSlashjson: js.Array[Branchesurl]): `583` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`583`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `583`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Branchesurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Branchesurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
