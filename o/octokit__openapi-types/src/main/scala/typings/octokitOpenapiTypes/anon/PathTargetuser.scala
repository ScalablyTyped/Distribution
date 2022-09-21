package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTargetuser extends StObject {
  
  var path: Targetuser
}
object PathTargetuser {
  
  inline def apply(path: Targetuser): PathTargetuser = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTargetuser]
  }
  
  extension [Self <: PathTargetuser](x: Self) {
    
    inline def setPath(value: Targetuser): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
