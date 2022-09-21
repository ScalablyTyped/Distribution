package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery255 extends StObject {
  
  /**
    * Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
    *
    * This endpoint and the [Map a commit author](https://docs.github.com/rest/reference/migrations#map-a-commit-author) endpoint allow you to provide correct Git author information.
    */
  var get: ParametersQuery255
}
object GetParametersQuery255 {
  
  inline def apply(get: ParametersQuery255): GetParametersQuery255 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery255]
  }
  
  extension [Self <: GetParametersQuery255](x: Self) {
    
    inline def setGet(value: ParametersQuery255): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
