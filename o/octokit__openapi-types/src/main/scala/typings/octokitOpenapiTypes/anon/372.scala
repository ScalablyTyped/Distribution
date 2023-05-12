package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.mod.OneOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `372` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: OneOf[js.Tuple2[Machine, Pullrequest]]
}
object `372` {
  
  inline def apply(applicationSlashjson: OneOf[js.Tuple2[Machine, Pullrequest]]): `372` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`372`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `372`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: OneOf[js.Tuple2[Machine, Pullrequest]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
