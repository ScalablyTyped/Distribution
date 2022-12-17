package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchRequestBodyContentApplicationjsonUselfs extends StObject {
  
  /** You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.github.com). You can learn more about our LFS feature and working with large files [on our help site](https://docs.github.com/articles/versioning-large-files/). */
  var patch: RequestBodyContentApplicationjsonUselfs
}
object PatchRequestBodyContentApplicationjsonUselfs {
  
  inline def apply(patch: RequestBodyContentApplicationjsonUselfs): PatchRequestBodyContentApplicationjsonUselfs = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRequestBodyContentApplicationjsonUselfs]
  }
  
  extension [Self <: PatchRequestBodyContentApplicationjsonUselfs](x: Self) {
    
    inline def setPatch(value: RequestBodyContentApplicationjsonUselfs): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
