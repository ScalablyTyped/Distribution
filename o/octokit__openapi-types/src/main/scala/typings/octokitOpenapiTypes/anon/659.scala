package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `659` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[FreetrialendsonNextbillingdate]
}
object `659` {
  
  inline def apply(applicationSlashjson: js.Array[FreetrialendsonNextbillingdate]): `659` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`659`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `659`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[FreetrialendsonNextbillingdate]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: FreetrialendsonNextbillingdate*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
