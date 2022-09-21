package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `558` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: StringDictionary[Double]
}
object `558` {
  
  inline def apply(applicationSlashjson: StringDictionary[Double]): `558` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`558`]
  }
  
  extension [Self <: `558`](x: Self) {
    
    inline def setApplicationSlashjson(value: StringDictionary[Double]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
