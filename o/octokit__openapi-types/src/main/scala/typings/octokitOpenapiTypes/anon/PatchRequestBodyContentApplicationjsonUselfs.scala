package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchRequestBodyContentApplicationjsonUselfs extends StObject {
  
  /**
    * Update Git LFS preference
    * @description You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability
    * is powered by [Git LFS](https://git-lfs.com).
    *
    * You can learn more about our LFS feature and working with large files [on our help
    * site](https://docs.github.com/repositories/working-with-files/managing-large-files).
    *
    * **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end
    * on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update
    * these docs to reflect relevant changes to the API and will contact all integrators using the "Source imports" API.
    */
  var patch: RequestBodyContentApplicationjsonUselfs
}
object PatchRequestBodyContentApplicationjsonUselfs {
  
  inline def apply(patch: RequestBodyContentApplicationjsonUselfs): PatchRequestBodyContentApplicationjsonUselfs = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRequestBodyContentApplicationjsonUselfs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchRequestBodyContentApplicationjsonUselfs] (val x: Self) extends AnyVal {
    
    inline def setPatch(value: RequestBodyContentApplicationjsonUselfs): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
