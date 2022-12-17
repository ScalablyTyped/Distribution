package typings.octokitOpenapiTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `599` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Partial[js.Array[StarredatString]] & Partial[js.Array[Allowupdatebranch]]
}
object `599` {
  
  inline def apply(applicationSlashjson: Partial[js.Array[StarredatString]] & Partial[js.Array[Allowupdatebranch]]): `599` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`599`]
  }
  
  extension [Self <: `599`](x: Self) {
    
    inline def setApplicationSlashjson(value: Partial[js.Array[StarredatString]] & Partial[js.Array[Allowupdatebranch]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
