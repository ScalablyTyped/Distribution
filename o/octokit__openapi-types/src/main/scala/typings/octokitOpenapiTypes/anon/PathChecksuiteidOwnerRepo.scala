package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathChecksuiteidOwnerRepo extends StObject {
  
  var path: ChecksuiteidOwnerRepo
}
object PathChecksuiteidOwnerRepo {
  
  inline def apply(path: ChecksuiteidOwnerRepo): PathChecksuiteidOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathChecksuiteidOwnerRepo]
  }
  
  extension [Self <: PathChecksuiteidOwnerRepo](x: Self) {
    
    inline def setPath(value: ChecksuiteidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
