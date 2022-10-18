package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `195` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Businessplus | Bio
}
object `195` {
  
  inline def apply(applicationSlashjson: Businessplus | Bio): `195` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`195`]
  }
  
  extension [Self <: `195`](x: Self) {
    
    inline def setApplicationSlashjson(value: Businessplus | Bio): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
