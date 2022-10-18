package typings.octokitOpenapiTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Partial[js.Array[StarredatString]] & Partial[js.Array[Allowmergecommit]]
}
object `225` {
  
  inline def apply(applicationSlashjson: Partial[js.Array[StarredatString]] & Partial[js.Array[Allowmergecommit]]): `225` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`225`]
  }
  
  extension [Self <: `225`](x: Self) {
    
    inline def setApplicationSlashjson(value: Partial[js.Array[StarredatString]] & Partial[js.Array[Allowmergecommit]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
