package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookid extends StObject {
  
  var path: Hookid
}
object PathHookid {
  
  inline def apply(path: Hookid): PathHookid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookid]
  }
  
  extension [Self <: PathHookid](x: Self) {
    
    inline def setPath(value: Hookid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
