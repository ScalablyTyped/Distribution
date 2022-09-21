package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: StringDictionary[Any]
}
object `47` {
  
  inline def apply(applicationSlashjson: StringDictionary[Any]): `47` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setApplicationSlashjson(value: StringDictionary[Any]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
