package typings.octokitOpenapiTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Partial[DictkeyConclusion] & Partial[DictkeyStatus] & Completedat
}
object `173` {
  
  inline def apply(applicationSlashjson: Partial[DictkeyConclusion] & Partial[DictkeyStatus] & Completedat): `173` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`173`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `173`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Partial[DictkeyConclusion] & Partial[DictkeyStatus] & Completedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
