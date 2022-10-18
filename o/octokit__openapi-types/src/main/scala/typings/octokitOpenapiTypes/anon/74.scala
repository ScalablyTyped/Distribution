package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `73` | Contentid
}
object `74` {
  
  inline def apply(applicationSlashjson: `73` | Contentid): `74` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`74`]
  }
  
  extension [Self <: `74`](x: Self) {
    
    inline def setApplicationSlashjson(value: `73` | Contentid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
