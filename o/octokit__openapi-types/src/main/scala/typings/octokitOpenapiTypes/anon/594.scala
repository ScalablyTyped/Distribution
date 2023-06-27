package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `594` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[DismissedbyDismissedcomment]
}
object `594` {
  
  inline def apply(applicationSlashjson: js.Array[DismissedbyDismissedcomment]): `594` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`594`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `594`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[DismissedbyDismissedcomment]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: DismissedbyDismissedcomment*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
