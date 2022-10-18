package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBranchOwnerRepo extends StObject {
  
  var path: BranchOwnerRepo
}
object PathBranchOwnerRepo {
  
  inline def apply(path: BranchOwnerRepo): PathBranchOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBranchOwnerRepo]
  }
  
  extension [Self <: PathBranchOwnerRepo](x: Self) {
    
    inline def setPath(value: BranchOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
