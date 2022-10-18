package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchResponses200Content517422 extends StObject {
  
  /** You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.github.com). You can learn more about our LFS feature and working with large files [on our help site](https://docs.github.com/articles/versioning-large-files/). */
  var patch: Responses200Content517422
}
object PatchResponses200Content517422 {
  
  inline def apply(patch: Responses200Content517422): PatchResponses200Content517422 = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchResponses200Content517422]
  }
  
  extension [Self <: PatchResponses200Content517422](x: Self) {
    
    inline def setPatch(value: Responses200Content517422): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
