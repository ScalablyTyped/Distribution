package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: StringDictionary[Double]
}
object `159` {
  
  inline def apply(applicationSlashjson: StringDictionary[Double]): `159` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`159`]
  }
  
  extension [Self <: `159`](x: Self) {
    
    inline def setApplicationSlashjson(value: StringDictionary[Double]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
