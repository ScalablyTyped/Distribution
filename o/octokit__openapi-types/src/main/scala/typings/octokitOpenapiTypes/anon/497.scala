package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `497` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Branchesurl]
}
object `497` {
  
  inline def apply(applicationSlashjson: js.Array[Branchesurl]): `497` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`497`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `497`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Branchesurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Branchesurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
