package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.mod.OneOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `447` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: OneOf[js.Tuple2[Idletimeoutminutes, Machine]]
}
object `447` {
  
  inline def apply(applicationSlashjson: OneOf[js.Tuple2[Idletimeoutminutes, Machine]]): `447` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`447`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `447`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: OneOf[js.Tuple2[Idletimeoutminutes, Machine]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
