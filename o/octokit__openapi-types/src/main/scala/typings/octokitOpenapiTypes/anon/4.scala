package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: StringDictionary[Any]
}
object `4` {
  
  inline def apply(applicationSlashjson: StringDictionary[Any]): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setApplicationSlashjson(value: StringDictionary[Any]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
