package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBranch extends StObject {
  
  var path: Branch
}
object PathBranch {
  
  inline def apply(path: Branch): PathBranch = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBranch]
  }
  
  extension [Self <: PathBranch](x: Self) {
    
    inline def setPath(value: Branch): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
