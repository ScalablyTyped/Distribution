package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Slash
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Slashdocs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BranchPath extends StObject {
  
  /** @description The repository branch used to publish your site's source files. */
  var branch: String
  
  /**
    * @description The repository directory that includes the source files for the Pages site. Allowed paths are `/` or `/docs`.
    * @enum {string}
    */
  var path: Slash | Slashdocs
}
object BranchPath {
  
  inline def apply(branch: String, path: Slash | Slashdocs): BranchPath = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchPath]
  }
  
  extension [Self <: BranchPath](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Slash | Slashdocs): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
