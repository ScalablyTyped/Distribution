package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.mod.OneOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `333` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: OneOf[js.Tuple2[`331`, `332`]]
}
object `333` {
  
  inline def apply(applicationSlashjson: OneOf[js.Tuple2[`331`, `332`]]): `333` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`333`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `333`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: OneOf[js.Tuple2[`331`, `332`]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
