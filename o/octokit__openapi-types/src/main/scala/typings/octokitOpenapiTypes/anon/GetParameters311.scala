package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters311 extends StObject {
  
  /**
    * Get commit authors
    * @description Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
    *
    * This endpoint and the [Map a commit author](https://docs.github.com/rest/migrations/source-imports#map-a-commit-author) endpoint allow you to provide correct Git author information.
    *
    * **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end
    * on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update
    * these docs to reflect relevant changes to the API and will contact all integrators using the "Source imports" API.
    */
  var get: Parameters311
}
object GetParameters311 {
  
  inline def apply(get: Parameters311): GetParameters311 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters311]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters311] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters311): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
