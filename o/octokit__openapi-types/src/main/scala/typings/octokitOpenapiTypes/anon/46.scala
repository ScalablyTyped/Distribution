package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Partial[Origin] & Partial[StringDictionary[Any]]
}
object `46` {
  
  inline def apply(applicationSlashjson: Partial[Origin] & Partial[StringDictionary[Any]]): `46` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`46`]
  }
  
  extension [Self <: `46`](x: Self) {
    
    inline def setApplicationSlashjson(value: Partial[Origin] & Partial[StringDictionary[Any]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
