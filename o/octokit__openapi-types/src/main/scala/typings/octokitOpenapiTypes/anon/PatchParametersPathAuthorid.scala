package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchParametersPathAuthorid extends StObject {
  
  /**
    * Map a commit author
    * @description Update an author's identity for the import. Your application can continue updating authors any time before you push
    * new commits to the repository.
    *
    * **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end
    * on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update
    * these docs to reflect relevant changes to the API and will contact all integrators using the "Source imports" API.
    */
  var patch: ParametersPathAuthorid
}
object PatchParametersPathAuthorid {
  
  inline def apply(patch: ParametersPathAuthorid): PatchParametersPathAuthorid = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchParametersPathAuthorid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchParametersPathAuthorid] (val x: Self) extends AnyVal {
    
    inline def setPatch(value: ParametersPathAuthorid): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
