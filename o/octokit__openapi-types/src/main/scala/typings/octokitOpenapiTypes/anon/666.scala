package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `666` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[DismissedcommentDismissedreason]
}
object `666` {
  
  inline def apply(applicationSlashjson: js.Array[DismissedcommentDismissedreason]): `666` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`666`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `666`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[DismissedcommentDismissedreason]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: DismissedcommentDismissedreason*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
