package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCacheid extends StObject {
  
  var path: Cacheid
}
object PathCacheid {
  
  inline def apply(path: Cacheid): PathCacheid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCacheid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCacheid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Cacheid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
