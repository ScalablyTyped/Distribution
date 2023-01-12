package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathFilesha extends StObject {
  
  var path: Filesha
}
object PathFilesha {
  
  inline def apply(path: Filesha): PathFilesha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathFilesha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathFilesha] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Filesha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
