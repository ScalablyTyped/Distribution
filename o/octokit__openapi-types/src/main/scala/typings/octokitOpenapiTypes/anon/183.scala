package typings.octokitOpenapiTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `183` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Partial[js.Array[Avatarurl]] & Partial[js.Array[StarredatUser]]
}
object `183` {
  
  inline def apply(applicationSlashjson: Partial[js.Array[Avatarurl]] & Partial[js.Array[StarredatUser]]): `183` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`183`]
  }
  
  extension [Self <: `183`](x: Self) {
    
    inline def setApplicationSlashjson(value: Partial[js.Array[Avatarurl]] & Partial[js.Array[StarredatUser]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
