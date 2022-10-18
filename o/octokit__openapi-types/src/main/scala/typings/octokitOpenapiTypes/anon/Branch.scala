package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branch extends StObject {
  
  var branch: String
  
  var path: String
}
object Branch {
  
  inline def apply(branch: String, path: String): Branch = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
  
  extension [Self <: Branch](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
