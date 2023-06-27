package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content315 extends StObject {
  
  /**
    * Get large files
    * @description List files larger than 100MB found during the import
    *
    * **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end
    * on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update
    * these docs to reflect relevant changes to the API and will contact all integrators using the "Source imports" API.
    */
  var get: Responses200Content315
}
object GetResponses200Content315 {
  
  inline def apply(get: Responses200Content315): GetResponses200Content315 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content315]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content315] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content315): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
