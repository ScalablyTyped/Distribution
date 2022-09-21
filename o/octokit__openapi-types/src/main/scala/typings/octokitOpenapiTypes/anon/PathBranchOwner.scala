package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBranchOwner extends StObject {
  
  var path: BranchOwner
}
object PathBranchOwner {
  
  inline def apply(path: BranchOwner): PathBranchOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBranchOwner]
  }
  
  extension [Self <: PathBranchOwner](x: Self) {
    
    inline def setPath(value: BranchOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
