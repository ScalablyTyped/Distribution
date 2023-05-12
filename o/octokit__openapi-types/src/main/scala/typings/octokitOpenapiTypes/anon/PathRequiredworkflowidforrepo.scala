package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRequiredworkflowidforrepo extends StObject {
  
  var path: Requiredworkflowidforrepo
}
object PathRequiredworkflowidforrepo {
  
  inline def apply(path: Requiredworkflowidforrepo): PathRequiredworkflowidforrepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRequiredworkflowidforrepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRequiredworkflowidforrepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Requiredworkflowidforrepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
