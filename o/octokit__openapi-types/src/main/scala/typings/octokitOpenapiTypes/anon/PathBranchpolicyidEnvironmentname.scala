package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBranchpolicyidEnvironmentname extends StObject {
  
  var path: BranchpolicyidEnvironmentname
}
object PathBranchpolicyidEnvironmentname {
  
  inline def apply(path: BranchpolicyidEnvironmentname): PathBranchpolicyidEnvironmentname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBranchpolicyidEnvironmentname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathBranchpolicyidEnvironmentname] (val x: Self) extends AnyVal {
    
    inline def setPath(value: BranchpolicyidEnvironmentname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
