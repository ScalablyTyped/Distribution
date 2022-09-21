package typings.octokitOpenapiTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `622` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Partial[js.Array[StarredatString]] & Partial[js.Array[Allowupdatebranch]]
}
object `622` {
  
  inline def apply(applicationSlashjson: Partial[js.Array[StarredatString]] & Partial[js.Array[Allowupdatebranch]]): `622` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`622`]
  }
  
  extension [Self <: `622`](x: Self) {
    
    inline def setApplicationSlashjson(value: Partial[js.Array[StarredatString]] & Partial[js.Array[Allowupdatebranch]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
