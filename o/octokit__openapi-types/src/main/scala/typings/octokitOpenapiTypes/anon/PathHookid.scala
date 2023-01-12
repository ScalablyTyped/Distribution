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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHookid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Hookid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
