package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.mod.OneOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `281` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: OneOf[js.Tuple2[`279`, `280`]]
}
object `281` {
  
  inline def apply(applicationSlashjson: OneOf[js.Tuple2[`279`, `280`]]): `281` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`281`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `281`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: OneOf[js.Tuple2[`279`, `280`]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
