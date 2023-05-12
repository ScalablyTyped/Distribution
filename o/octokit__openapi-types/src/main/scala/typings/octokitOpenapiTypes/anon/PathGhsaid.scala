package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGhsaid extends StObject {
  
  var path: Ghsaid
}
object PathGhsaid {
  
  inline def apply(path: Ghsaid): PathGhsaid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGhsaid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathGhsaid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Ghsaid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
