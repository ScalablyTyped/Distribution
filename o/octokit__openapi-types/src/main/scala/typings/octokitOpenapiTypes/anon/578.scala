package typings.octokitOpenapiTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `578` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Partial[js.Array[Avatarurl]] & Partial[js.Array[StarredatUser]]
}
object `578` {
  
  inline def apply(applicationSlashjson: Partial[js.Array[Avatarurl]] & Partial[js.Array[StarredatUser]]): `578` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`578`]
  }
  
  extension [Self <: `578`](x: Self) {
    
    inline def setApplicationSlashjson(value: Partial[js.Array[Avatarurl]] & Partial[js.Array[StarredatUser]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
