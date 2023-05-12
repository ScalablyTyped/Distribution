package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `509` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[DismissedbyDismissedcomment]
}
object `509` {
  
  inline def apply(applicationSlashjson: js.Array[DismissedbyDismissedcomment]): `509` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`509`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `509`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[DismissedbyDismissedcomment]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: DismissedbyDismissedcomment*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
