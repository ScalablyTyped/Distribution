package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `576` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Businessplus | Blog
}
object `576` {
  
  inline def apply(applicationSlashjson: Businessplus | Blog): `576` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`576`]
  }
  
  extension [Self <: `576`](x: Self) {
    
    inline def setApplicationSlashjson(value: Businessplus | Blog): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
