package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `446` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Partial[Origin] & Partial[StringDictionary[Any]]
}
object `446` {
  
  inline def apply(applicationSlashjson: Partial[Origin] & Partial[StringDictionary[Any]]): `446` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`446`]
  }
  
  extension [Self <: `446`](x: Self) {
    
    inline def setApplicationSlashjson(value: Partial[Origin] & Partial[StringDictionary[Any]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
