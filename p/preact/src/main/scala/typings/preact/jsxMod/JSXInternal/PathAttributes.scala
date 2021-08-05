package typings.preact.jsxMod.JSXInternal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttributes extends StObject {
  
  var d: String
}
object PathAttributes {
  
  inline def apply(d: String): PathAttributes = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttributes]
  }
  
  extension [Self <: PathAttributes](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
  }
}
