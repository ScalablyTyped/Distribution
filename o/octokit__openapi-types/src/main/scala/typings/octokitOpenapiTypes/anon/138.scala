package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Note | Contentid
}
object `138` {
  
  inline def apply(applicationSlashjson: Note | Contentid): `138` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`138`]
  }
  
  extension [Self <: `138`](x: Self) {
    
    inline def setApplicationSlashjson(value: Note | Contentid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
