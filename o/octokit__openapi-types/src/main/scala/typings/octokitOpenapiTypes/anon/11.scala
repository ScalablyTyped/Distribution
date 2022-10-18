package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: StringDictionary[String]
}
object `11` {
  
  inline def apply(applicationSlashjson: StringDictionary[String]): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setApplicationSlashjson(value: StringDictionary[String]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
