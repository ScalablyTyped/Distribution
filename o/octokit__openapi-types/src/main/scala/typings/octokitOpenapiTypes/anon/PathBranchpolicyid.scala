package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBranchpolicyid extends StObject {
  
  var path: Branchpolicyid
}
object PathBranchpolicyid {
  
  inline def apply(path: Branchpolicyid): PathBranchpolicyid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBranchpolicyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathBranchpolicyid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Branchpolicyid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
