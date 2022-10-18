package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path389 extends StObject {
  
  var path: `389`
}
object Path389 {
  
  inline def apply(path: `389`): Path389 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path389]
  }
  
  extension [Self <: Path389](x: Self) {
    
    inline def setPath(value: `389`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
