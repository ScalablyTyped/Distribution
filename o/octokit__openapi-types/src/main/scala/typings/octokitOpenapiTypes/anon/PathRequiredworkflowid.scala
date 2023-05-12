package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRequiredworkflowid extends StObject {
  
  var path: Requiredworkflowid
}
object PathRequiredworkflowid {
  
  inline def apply(path: Requiredworkflowid): PathRequiredworkflowid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRequiredworkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRequiredworkflowid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Requiredworkflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
