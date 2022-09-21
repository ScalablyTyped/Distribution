package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Slash
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Slashdocs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BranchStringPath extends StObject {
  
  /** @description The repository branch used to publish your site's source files. */
  var branch: String
  
  /**
    * @description The repository directory that includes the source files for the Pages site. Allowed paths are `/` or `/docs`. Default: `/`
    * @default /
    * @enum {string}
    */
  var path: js.UndefOr[Slash | Slashdocs] = js.undefined
}
object BranchStringPath {
  
  inline def apply(branch: String): BranchStringPath = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchStringPath]
  }
  
  extension [Self <: BranchStringPath](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Slash | Slashdocs): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
